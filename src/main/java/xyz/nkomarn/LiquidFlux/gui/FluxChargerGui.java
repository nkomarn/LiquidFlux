package xyz.nkomarn.LiquidFlux.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

import net.minecraft.util.ResourceLocation;
import xyz.nkomarn.LiquidFlux.LiquidFlux;
import xyz.nkomarn.LiquidFlux.container.FluxChargerContainer;
import xyz.nkomarn.LiquidFlux.tile.FluxChargerTile;
import xyz.nkomarn.LiquidFlux.util.ProgressBar;

import java.text.DecimalFormat;
import java.util.Arrays;

public class FluxChargerGui extends GuiContainer {
	private final IInventory playerInventory;
	private final FluxChargerTile tile;

	private final ResourceLocation texture = new ResourceLocation(LiquidFlux.MODID
			+ ":textures/gui/container/flux_charger.png");
	private ProgressBar progress, fluxMeter, chargedFluxMeter, energyMeter;

	public FluxChargerGui(IInventory playerInventory, FluxChargerTile thing) {
		super(new FluxChargerContainer(playerInventory, thing));
		this.playerInventory = playerInventory;
		this.tile = thing;

		ResourceLocation components = new ResourceLocation(LiquidFlux.MODID + ":textures/gui/components.png");
		this.progress = new ProgressBar(texture, ProgressBar.ProgressBarDirection.LEFT_TO_RIGHT, 7, 9,
				23, 45, 177, 0);

		this.fluxMeter = new ProgressBar(components, ProgressBar.ProgressBarDirection.DOWN_TO_UP, 10, 51,
				10, 24, 0, 0);
		this.chargedFluxMeter = new ProgressBar(components, ProgressBar.ProgressBarDirection.DOWN_TO_UP, 10, 51,
				32, 24, 40, 0);
		this.energyMeter = new ProgressBar(components, ProgressBar.ProgressBarDirection.DOWN_TO_UP, 10, 51,
				156, 24, 30, 0);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float ticks, int mouseX, int mouseY) {
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(texture);
		int guiHeight = 165;
		int guiWidth = 175;
		drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, guiWidth, guiHeight);
	}

	int p = 0;
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		int storedEnergy = this.tile.getEnergyStored(ForgeDirection.UNKNOWN);
		int maxEnergy = this.tile.getMaxEnergyStored(ForgeDirection.UNKNOWN);

		this.fluxMeter.setMin(10).setMax(30);
		this.fluxMeter.draw(this.mc);

		this.chargedFluxMeter.setMin(1000).setMax(5000);
		this.chargedFluxMeter.draw(this.mc);

		this.energyMeter.setMin(5).setMax(10);
		this.energyMeter.draw(this.mc);

		this.progress.setMin(20).setMax(40);
		this.progress.draw(this.mc);

		DecimalFormat formatter = new DecimalFormat("#,###");
		fontRendererObj.drawString("Flux Charger", 8, 8, 0x404040);

		fontRendererObj.drawString("Status: Running.", 57, 29, 0x55FF55);

		int leftBound = (this.width - this.xSize) / 2;
		int topBound = (this.height - this.ySize) / 2;

		// Liquid Flux tank hover text
		/*if ((mouseX >= leftBound + 9 && mouseX <= leftBound + 20) && (mouseY >= topBound + 23 && mouseY <= topBound + 75)) {
			drawHoveringText(Arrays.asList("§cLiquid Flux", String.format("%s mB", formatter.format(this.tile.liquidFluxTank.getFluidAmount()))),
					mouseX - leftBound, mouseY - topBound, fontRendererObj);
		}

		// Liquid Flux tank hover text
		if ((mouseX >= leftBound + 30 && mouseX <= leftBound + 41) && (mouseY >= topBound + 23 && mouseY <= topBound + 75)) {
			drawHoveringText(Arrays.asList("§bCharged Flux", String.format("%s mB", formatter.format(this.tile.chargedFluxTank.getFluidAmount()))),
					mouseX - leftBound, mouseY - topBound, fontRendererObj);
		}*/

		if ((mouseX >= leftBound + 155 && mouseX <= leftBound + 166) && (mouseY >= topBound + 23 && mouseY <= topBound + 75)) {
			drawHoveringText(Arrays.asList("§aEnergy", String.format("%s RF", formatter.format(storedEnergy))), mouseX - leftBound,
					mouseY - topBound, fontRendererObj);
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}

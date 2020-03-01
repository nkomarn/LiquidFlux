package xyz.nkomarn.LiquidFlux.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xyz.nkomarn.LiquidFlux.LiquidFlux;
import xyz.nkomarn.LiquidFlux.gui.GuiHandler;
import xyz.nkomarn.LiquidFlux.proxy.ClientProxy;
import xyz.nkomarn.LiquidFlux.tile.FluxChargerTile;

public class FluxChargerBlock extends Block implements ITileEntityProvider {
	public FluxChargerBlock() {
		super(Material.iron);
		setBlockName("flux_charger");
		setCreativeTab(ClientProxy.fluxTab);
		GameRegistry.registerBlock(this, "flux_charger");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new FluxChargerTile();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side,
									float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			player.openGui(LiquidFlux.instance, GuiHandler.FLUX_CHARGER, world, x, y, z);
		}
		return true;
	}
}

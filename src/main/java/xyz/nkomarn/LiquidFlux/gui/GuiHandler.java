package xyz.nkomarn.LiquidFlux.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xyz.nkomarn.LiquidFlux.container.FluxChargerContainer;
import xyz.nkomarn.LiquidFlux.tile.FluxChargerTile;

public class GuiHandler implements IGuiHandler {
    public static int FLUX_CHARGER = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == FLUX_CHARGER) {
            return new FluxChargerContainer(player.inventory, (FluxChargerTile) world.getTileEntity(x, y, z));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == FLUX_CHARGER) {
            return new FluxChargerGui(player.inventory, (FluxChargerTile) world.getTileEntity(x, y, z));
        }
        return null;
    }
}

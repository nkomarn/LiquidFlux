package xyz.nkomarn.LiquidFlux.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import xyz.nkomarn.LiquidFlux.tile.FluxChargerTile;

public class FluxChargerContainer extends Container {
    private final IInventory playerInventory;
    private final FluxChargerTile tile;

    public FluxChargerContainer(IInventory playerInventory, FluxChargerTile thing) {
        this.playerInventory = playerInventory;
        this.tile = thing;

        // Player Inventory, Slot 9-35, Slot IDs 9-35
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.addSlotToContainer(new Slot(playerInventory, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }

        // Player Inventory, Slot 0-8, Slot IDs 36-44
        for (int x = 0; x < 9; ++x) {
            this.addSlotToContainer(new Slot(playerInventory, x, 8 + x * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true; // TODO check if usable by player
    }
}

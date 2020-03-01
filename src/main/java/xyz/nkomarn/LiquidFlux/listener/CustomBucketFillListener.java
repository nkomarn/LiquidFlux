package xyz.nkomarn.LiquidFlux.listener;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import xyz.nkomarn.LiquidFlux.item.Items;

public class CustomBucketFillListener {
    @SubscribeEvent
    public void onBucketFill(FillBucketEvent event) {
        event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.liquidFluxBucket, 1));
    }
}

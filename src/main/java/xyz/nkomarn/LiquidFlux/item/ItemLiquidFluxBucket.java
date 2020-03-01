package xyz.nkomarn.LiquidFlux.item;

import net.minecraft.item.ItemBucket;
import xyz.nkomarn.LiquidFlux.LiquidFlux;
import xyz.nkomarn.LiquidFlux.block.Blocks;
import xyz.nkomarn.LiquidFlux.proxy.ClientProxy;

public class ItemLiquidFluxBucket extends ItemBucket {
    public ItemLiquidFluxBucket() {
        super(Blocks.liquidFlux);
        setTextureName(String.format("%s:%s", LiquidFlux.instance, "liquid_flux_bucket"));
        setCreativeTab(ClientProxy.fluxTab);
    }
}

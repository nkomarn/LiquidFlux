package xyz.nkomarn.LiquidFlux.block;

import cpw.mods.fml.common.registry.GameRegistry;
import xyz.nkomarn.LiquidFlux.LiquidFlux;
import xyz.nkomarn.LiquidFlux.tile.FluxChargerTile;

public class Blocks {
    public static FluxChargerBlock fluxCharger;
    public static LiquidFluxBlock liquidFlux;

    public Blocks() {
        fluxCharger = new FluxChargerBlock();
        liquidFlux = new LiquidFluxBlock();

        GameRegistry.registerTileEntity(FluxChargerTile.class,
                LiquidFlux.MODID + "flux_charger");
    }
}

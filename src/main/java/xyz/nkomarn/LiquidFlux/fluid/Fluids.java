package xyz.nkomarn.LiquidFlux.fluid;

import net.minecraftforge.fluids.FluidRegistry;

public class Fluids {
    public static FluidLiquidFlux liquidFlux;

    public Fluids() {
        liquidFlux = new FluidLiquidFlux();
        FluidRegistry.registerFluid(liquidFlux);
    }
}

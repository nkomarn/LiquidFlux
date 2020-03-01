package xyz.nkomarn.LiquidFlux.fluid;

import net.minecraftforge.fluids.Fluid;
import xyz.nkomarn.LiquidFlux.block.Blocks;

public class FluidLiquidFlux extends Fluid {
    public FluidLiquidFlux() {
        super("liquid_flux");
        setBlock(Blocks.liquidFlux);
    }

    @Override
    public int getColor() {
        return 0xc64949;
    }
}

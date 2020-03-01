package xyz.nkomarn.LiquidFlux.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import xyz.nkomarn.LiquidFlux.fluid.FluidLiquidFlux;
import xyz.nkomarn.LiquidFlux.proxy.ClientProxy;

public class LiquidFluxBlock extends BlockFluidClassic {
    public LiquidFluxBlock() {
        super(new FluidLiquidFlux(), Material.water);
        setBlockName("liquid_flux");
        setCreativeTab(ClientProxy.fluxTab);
        GameRegistry.registerBlock(this, "liquid_flux");
    }

    @Override
    public int colorMultiplier(IBlockAccess blockAccess, int x, int y, int z) {
        return 0xc64949;
    }
}

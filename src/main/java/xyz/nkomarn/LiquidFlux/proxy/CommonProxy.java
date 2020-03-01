package xyz.nkomarn.LiquidFlux.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.common.MinecraftForge;
import xyz.nkomarn.LiquidFlux.LiquidFlux;
import xyz.nkomarn.LiquidFlux.block.Blocks;
import xyz.nkomarn.LiquidFlux.fluid.Fluids;
import xyz.nkomarn.LiquidFlux.gui.GuiHandler;
import xyz.nkomarn.LiquidFlux.item.Items;
import xyz.nkomarn.LiquidFlux.listener.CustomBucketFillListener;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new Fluids();
        new Blocks();
        new Items();

        MinecraftForge.EVENT_BUS.register(new CustomBucketFillListener());
    }

    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(LiquidFlux.instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}



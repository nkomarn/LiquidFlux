package xyz.nkomarn.LiquidFlux;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import xyz.nkomarn.LiquidFlux.proxy.CommonProxy;

@Mod(modid = LiquidFlux.MODID, name= "LiquidFlux", useMetadata = true)
public class LiquidFlux {
    public static final String MODID = "liquidflux";

    @Mod.Instance
    public static LiquidFlux instance;

    @SidedProxy(clientSide = "xyz.nkomarn.LiquidFlux.proxy.ClientProxy",
        serverSide = "xyz.nkomarn.LiquidFlux.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
		proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}

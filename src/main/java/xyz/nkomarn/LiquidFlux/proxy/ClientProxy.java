package xyz.nkomarn.LiquidFlux.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xyz.nkomarn.LiquidFlux.block.Blocks;

public class ClientProxy extends CommonProxy {
    public static CreativeTabs fluxTab = new CreativeTabs("liquid_flux") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.fluxCharger);
        }
    };

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        //fluxTab.setBackgroundImageName()
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}

package xyz.nkomarn.LiquidFlux.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class Items {
	public static UltimateSword sword;
	public static ItemLiquidFluxBucket liquidFluxBucket;
	
	public static void register() {
		initialize();
		registerItems();
	}
	
	private static void initialize() {
		sword = new UltimateSword(EnumHelper.addToolMaterial("ultimatesword", 1000, 500,
				1, 10, 4));
		liquidFluxBucket = new ItemLiquidFluxBucket();
	}
	
	private static void registerItems() {
		GameRegistry.registerItem(sword, "ultimatesword");
		GameRegistry.registerItem(liquidFluxBucket, "liquid_flux_bucket");
	}
}

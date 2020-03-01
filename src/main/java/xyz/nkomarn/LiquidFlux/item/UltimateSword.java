package xyz.nkomarn.LiquidFlux.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import xyz.nkomarn.LiquidFlux.LiquidFlux;

public class UltimateSword extends ItemSword {
	protected UltimateSword(Item.ToolMaterial material) {
		super(material);
		setUnlocalizedName("ultimatesword");
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(LiquidFlux.MODID + ":" + this.getUnlocalizedName());
	}
	
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, 
			float hitX, float hitY, float hitZ) {
		world.createExplosion(player, x + hitX, y + hitY, z + hitZ, 3.0f, false);
		item.damageItem(10, player);
		return super.onItemUse(item, player, world, x, y, z, side, hitX, hitY, hitZ);
	}
}

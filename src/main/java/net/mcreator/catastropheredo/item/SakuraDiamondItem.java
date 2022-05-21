
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.catastropheredo.init.CatastropheredoModTabs;

public class SakuraDiamondItem extends Item {
	public SakuraDiamondItem() {
		super(new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHIC_ORES).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

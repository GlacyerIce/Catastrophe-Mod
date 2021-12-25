
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SteelNuggetItem extends Item {
	public SteelNuggetItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("steel_nugget");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

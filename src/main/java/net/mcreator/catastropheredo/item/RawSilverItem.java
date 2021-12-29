
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RawSilverItem extends Item {
	public RawSilverItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("raw_silver");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

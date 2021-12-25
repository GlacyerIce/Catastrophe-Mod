
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ChainMailItem extends Item {
	public ChainMailItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(32).rarity(Rarity.COMMON));
		setRegistryName("chain_mail");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}

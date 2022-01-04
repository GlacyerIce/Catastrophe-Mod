
package net.mcreator.catastropheredo.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SilverNuggetItem extends Item {

	public SilverNuggetItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("silver_nugget");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

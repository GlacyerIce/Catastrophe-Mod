
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.catastropheredo.init.CatastropheredoModTabs;
import net.mcreator.catastropheredo.init.CatastropheredoModSounds;

public class CarefreeItem extends RecordItem {
	public CarefreeItem() {
		super(0, CatastropheredoModSounds.REGISTRY.get(new ResourceLocation("catastropheredo:carefree_disc")),
				new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_MUSIC_DISCS).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("carefree");
	}
}

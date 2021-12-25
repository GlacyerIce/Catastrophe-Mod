
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.catastropheredo.init.CatastropheredoModTabs;
import net.mcreator.catastropheredo.init.CatastropheredoModItems;

public class SakuraDiamondShovelItem extends PickaxeItem {
	public SakuraDiamondShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1796;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CatastropheredoModItems.SAKURA_DIAMOND));
			}
		}, 1, -3.1f, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_TOOLS_AND_WEAPONS));
		setRegistryName("sakura_diamond_shovel");
	}
}

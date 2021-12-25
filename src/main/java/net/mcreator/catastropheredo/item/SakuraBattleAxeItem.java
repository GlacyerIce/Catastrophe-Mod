
package net.mcreator.catastropheredo.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.catastropheredo.init.CatastropheredoModTabs;
import net.mcreator.catastropheredo.init.CatastropheredoModItems;

public class SakuraBattleAxeItem extends AxeItem {
	public SakuraBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1796;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 10.5f;
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
		}, 1, -2.7000000000000002f, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_TOOLS_AND_WEAPONS));
		setRegistryName("sakura_diamond_battle_axe");
	}
}

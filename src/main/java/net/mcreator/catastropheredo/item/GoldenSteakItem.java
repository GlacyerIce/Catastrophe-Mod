
package net.mcreator.catastropheredo.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.catastropheredo.procedures.GoldenSteakFoodEatenProcedure;
import net.mcreator.catastropheredo.init.CatastropheredoModTabs;

public class GoldenSteakItem extends Item {
	public GoldenSteakItem() {
		super(new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHIC_FOOD).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(10f).alwaysEat().meat().build()));
		setRegistryName("golden_steak");
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GoldenSteakFoodEatenProcedure.execute(entity);
		return retval;
	}
}

package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.core.BlockPos;

import net.mcreator.catastropheredo.init.CatastropheredoModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AutoSmeltProcedureProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(CatastropheredoModEnchantments.AUTO_SMELT,
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) > 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
					.isCorrectToolForDrops((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) == true) {
				if ((world instanceof Level _lvlCanSmelt
						? _lvlCanSmelt.getRecipeManager()
								.getRecipeFor(RecipeType.SMELTING,
										new SimpleContainer(
												(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
										_lvlCanSmelt)
								.isPresent()
						: false) == true) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer(
														(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
														(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
														_lvlSmeltResult).get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (world instanceof Level) {
						Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			}
		}
	}
}

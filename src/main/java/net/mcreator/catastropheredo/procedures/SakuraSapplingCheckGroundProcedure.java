package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SakuraSapplingCheckGroundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:dirt"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
						(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

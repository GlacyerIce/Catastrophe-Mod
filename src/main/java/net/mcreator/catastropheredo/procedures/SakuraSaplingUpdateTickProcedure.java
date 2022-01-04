package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SakuraSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double height_modifier = 0;
		double ittr = 0;
		if (Math.random() < 0.05) {
			height_modifier = 4 * Math.random();
			if (Math.random() < 0.9995) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("catastropheredo", "sakura_tree_normal"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos((int) (x - 4), (int) (height_modifier + y), (int) (z - 4)),
								new BlockPos((int) (x - 4), (int) (height_modifier + y), (int) (z - 4)),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("catastropheredo", "sakura_tree_flat"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos((int) (x - 4), (int) (height_modifier + y), (int) (z - 4)),
								new BlockPos((int) (x - 4), (int) (height_modifier + y), (int) (z - 4)),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			while (ittr + 1 < height_modifier) {
				world.setBlock(new BlockPos((int) x, (int) ((ittr + y) - 0), (int) z), CatastropheredoModBlocks.SAKURA_LOG.defaultBlockState(), 3);
				ittr = ittr + 1;
			}
		}
	}
}

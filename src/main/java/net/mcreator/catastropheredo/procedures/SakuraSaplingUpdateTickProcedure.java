package net.mcreator.catastropheredo.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.catastropheredo.init.CatastropheredoModBlocks;

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
						template.placeInWorld(_serverworld, new BlockPos(x - 4, height_modifier + y, z - 4),
								new BlockPos(x - 4, height_modifier + y, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("catastropheredo", "sakura_tree_flat"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 4, height_modifier + y, z - 4),
								new BlockPos(x - 4, height_modifier + y, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			while (ittr + 1 < height_modifier) {
				world.setBlock(new BlockPos(x, (ittr + y) - 0, z), CatastropheredoModBlocks.SAKURA_LOG.get().defaultBlockState(), 3);
				ittr = ittr + 1;
			}
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.catastropheredo.block.TotallyAChestBlock;
import net.mcreator.catastropheredo.block.SteelOreBlock;
import net.mcreator.catastropheredo.block.SteelBlockBlock;
import net.mcreator.catastropheredo.block.SakuraDiamondOreBlock;
import net.mcreator.catastropheredo.block.SakuraDiamondBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatastropheredoModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block STEEL_ORE = register(new SteelOreBlock());
	public static final Block STEEL_BLOCK = register(new SteelBlockBlock());
	public static final Block SAKURA_DIAMOND_BLOCK = register(new SakuraDiamondBlockBlock());
	public static final Block TOTALLY_A_CHEST = register(new TotallyAChestBlock());
	public static final Block SAKURA_DIAMOND_ORE = register(new SakuraDiamondOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}

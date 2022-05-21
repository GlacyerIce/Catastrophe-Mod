
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.catastropheredo.block.TotallyAChestBlock;
import net.mcreator.catastropheredo.block.SuperSlipBlock;
import net.mcreator.catastropheredo.block.SteelOreBlock;
import net.mcreator.catastropheredo.block.SteelBlockBlock;
import net.mcreator.catastropheredo.block.SilverOreBlock;
import net.mcreator.catastropheredo.block.SakuraSaplingBlock;
import net.mcreator.catastropheredo.block.SakuraLogBlock;
import net.mcreator.catastropheredo.block.SakuraDiamondOreBlock;
import net.mcreator.catastropheredo.block.SakuraDiamondBlockBlock;
import net.mcreator.catastropheredo.block.SakruaLeavesBlock;
import net.mcreator.catastropheredo.CatastropheredoMod;

public class CatastropheredoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CatastropheredoMod.MODID);
	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOreBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> SAKURA_DIAMOND_BLOCK = REGISTRY.register("sakura_diamond_block", () -> new SakuraDiamondBlockBlock());
	public static final RegistryObject<Block> TOTALLY_A_CHEST = REGISTRY.register("totally_a_chest", () -> new TotallyAChestBlock());
	public static final RegistryObject<Block> SAKURA_DIAMOND_ORE = REGISTRY.register("sakura_diamond_ore", () -> new SakuraDiamondOreBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SAKURA_LOG = REGISTRY.register("sakura_log", () -> new SakuraLogBlock());
	public static final RegistryObject<Block> SAKRUA_LEAVES = REGISTRY.register("sakrua_leaves", () -> new SakruaLeavesBlock());
	public static final RegistryObject<Block> SAKURA_SAPLING = REGISTRY.register("sakura_sapling", () -> new SakuraSaplingBlock());
	public static final RegistryObject<Block> SUPER_SLIP = REGISTRY.register("super_slip", () -> new SuperSlipBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SakuraSaplingBlock.registerRenderLayer();
			SuperSlipBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			SakruaLeavesBlock.blockColorLoad(event);
		}
	}
}

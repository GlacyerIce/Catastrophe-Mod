
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.catastropheredo.world.biome.SakuraPlainsBiome;
import net.mcreator.catastropheredo.world.biome.SakuraMountainsBiome;
import net.mcreator.catastropheredo.world.biome.SakuraForestBiome;
import net.mcreator.catastropheredo.CatastropheredoMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatastropheredoModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome SAKURA_FOREST = register("sakura_forest", SakuraForestBiome.createBiome());
	public static Biome SAKURA_PLAINS = register("sakura_plains", SakuraPlainsBiome.createBiome());
	public static Biome SAKURA_MOUNTAINS = register("sakura_mountains", SakuraMountainsBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(CatastropheredoMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SakuraForestBiome.init();
			SakuraPlainsBiome.init();
			SakuraMountainsBiome.init();
		});
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.catastropheredo.world.features.ores.SteelOreFeature;
import net.mcreator.catastropheredo.world.features.ores.SilverOreFeature;
import net.mcreator.catastropheredo.world.features.ores.SakuraDiamondOreFeature;
import net.mcreator.catastropheredo.world.features.SakuratreeflatFeature;
import net.mcreator.catastropheredo.world.features.SakuraTreeFeature;
import net.mcreator.catastropheredo.CatastropheredoMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CatastropheredoModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CatastropheredoMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> STEEL_ORE = register("steel_ore", SteelOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SteelOreFeature.GENERATE_BIOMES, SteelOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAKURA_DIAMOND_ORE = register("sakura_diamond_ore", SakuraDiamondOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SakuraDiamondOreFeature.GENERATE_BIOMES,
					SakuraDiamondOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAKURATREEFLAT = register("sakuratreeflat", SakuratreeflatFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SakuratreeflatFeature.GENERATE_BIOMES,
					SakuratreeflatFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAKURA_TREE = register("sakura_tree", SakuraTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, SakuraTreeFeature.GENERATE_BIOMES, SakuraTreeFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.catastropheredo.enchantment.WitheringEnchantment;
import net.mcreator.catastropheredo.enchantment.RandomPotionEffectEnchantment;
import net.mcreator.catastropheredo.enchantment.PoisonousEnchantment;
import net.mcreator.catastropheredo.enchantment.LifeStealEnchantment;
import net.mcreator.catastropheredo.enchantment.AutoSmeltEnchantment;
import net.mcreator.catastropheredo.CatastropheredoMod;

public class CatastropheredoModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CatastropheredoMod.MODID);
	public static final RegistryObject<Enchantment> AUTO_SMELT = REGISTRY.register("auto_smelt", () -> new AutoSmeltEnchantment());
	public static final RegistryObject<Enchantment> LIFE_STEAL = REGISTRY.register("life_steal", () -> new LifeStealEnchantment());
	public static final RegistryObject<Enchantment> POISONOUS = REGISTRY.register("poisonous", () -> new PoisonousEnchantment());
	public static final RegistryObject<Enchantment> WITHERING = REGISTRY.register("withering", () -> new WitheringEnchantment());
	public static final RegistryObject<Enchantment> RANDOM_POTION_EFFECT = REGISTRY.register("random_potion_effect",
			() -> new RandomPotionEffectEnchantment());
}

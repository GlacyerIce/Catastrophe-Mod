
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.catastropheredo.enchantment.WitheringEnchantment;
import net.mcreator.catastropheredo.enchantment.RandomPotionEffectEnchantment;
import net.mcreator.catastropheredo.enchantment.PoisonousEnchantment;
import net.mcreator.catastropheredo.enchantment.LifeStealEnchantment;
import net.mcreator.catastropheredo.enchantment.AutoSmeltEnchantment;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatastropheredoModEnchantments {
	private static final List<Enchantment> REGISTRY = new ArrayList<>();
	public static final Enchantment AUTO_SMELT = register("catastropheredo:auto_smelt", new AutoSmeltEnchantment());
	public static final Enchantment LIFE_STEAL = register("catastropheredo:life_steal", new LifeStealEnchantment());
	public static final Enchantment POISONOUS = register("catastropheredo:poisonous", new PoisonousEnchantment());
	public static final Enchantment WITHERING = register("catastropheredo:withering", new WitheringEnchantment());
	public static final Enchantment RANDOM_POTION_EFFECT = register("catastropheredo:random_potion_effect", new RandomPotionEffectEnchantment());

	private static Enchantment register(String registryname, Enchantment enchantment) {
		REGISTRY.add(enchantment.setRegistryName(registryname));
		return enchantment;
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Enchantment[0]));
	}
}

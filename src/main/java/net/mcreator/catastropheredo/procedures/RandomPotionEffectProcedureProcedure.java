package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.catastropheredo.init.CatastropheredoModEnchantments;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class RandomPotionEffectProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity, event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double EnchantmentLevel = 0;
		double time = 0;
		double strength = 0;
		EnchantmentLevel = EnchantmentHelper.getItemEnchantmentLevel(CatastropheredoModEnchantments.RANDOM_POTION_EFFECT,
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
		if (EnchantmentLevel > 0) {
			if (entity instanceof LivingEntity) {
				time = 10 * 20 * EnchantmentLevel;
				strength = EnchantmentLevel;
				MobEffect effect;
				int random_number = new Random().nextInt(9);
				switch (random_number) {
					default :
					case 0 :
						effect = MobEffects.MOVEMENT_SLOWDOWN;
						break;
					case 1 :
						effect = MobEffects.DIG_SLOWDOWN;
						break;
					case 2 :
						effect = MobEffects.CONFUSION;
						break;
					case 3 :
						effect = MobEffects.BLINDNESS;
						break;
					case 4 :
						effect = MobEffects.HUNGER;
						break;
					case 5 :
						effect = MobEffects.WEAKNESS;
						break;
					case 6 :
						effect = MobEffects.WITHER;
						break;
					case 7 :
						effect = MobEffects.LEVITATION;
						break;
					case 8 :
						effect = MobEffects.UNLUCK;
						break;
				}
				((LivingEntity) entity).addEffect(new MobEffectInstance(effect, (int) time, (int) strength));
			}
		}
	}
}

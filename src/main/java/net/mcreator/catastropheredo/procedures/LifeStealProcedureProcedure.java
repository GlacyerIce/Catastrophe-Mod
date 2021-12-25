package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.catastropheredo.init.CatastropheredoModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LifeStealProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity sourceentity, double amount) {
		execute(null, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity sourceentity, double amount) {
		if (sourceentity == null)
			return;
		double EnchantLevel = 0;
		double Percentage = 0;
		double DamageAt90 = 0;
		double userHealth = 0;
		double healthAdded = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(CatastropheredoModEnchantments.LIFE_STEAL,
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) > 0) {
			EnchantLevel = EnchantmentHelper.getItemEnchantmentLevel(CatastropheredoModEnchantments.LIFE_STEAL,
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
			Percentage = 3 / EnchantLevel;
			DamageAt90 = amount * 0.9;
			userHealth = sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
			healthAdded = Math.round((DamageAt90 * Percentage) / 2) * 2;
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) (userHealth + healthAdded));
		}
	}
}

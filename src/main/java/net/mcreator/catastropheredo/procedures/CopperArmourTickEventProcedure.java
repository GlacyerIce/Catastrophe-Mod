package net.mcreator.catastropheredo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.catastropheredo.init.CatastropheredoModItems;

public class CopperArmourTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack item = ItemStack.EMPTY;
		double ticks = 0;
		double ticker = 0;
		double oxide = 0;
		double RandomTickerValue = 0;
		double solt = 0;
		ticks = itemstack.getOrCreateTag().getDouble("ticks");
		oxide = itemstack.getOrCreateTag().getDouble("oxidise");
		if (oxide == 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 2, (false), (false)));
		} else if (oxide == 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 1, (false), (false)));
		} else if (oxide == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 0, (false), (false)));
		}
		if (itemstack.getOrCreateTag().getBoolean("waxed")) {
			return;
		}
		if ((world.getLevelData().getGameRules().getInt(GameRules.RULE_RANDOMTICKING)) > 0) {
			for (int index0 = 0; index0 < (int) ((world.getLevelData().getGameRules().getInt(GameRules.RULE_RANDOMTICKING))); index0++) {
				if ((itemstack).isEnchanted() && (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack) != 0
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
					break;
				}
				RandomTickerValue = Math.round((24000 * 50 + 24000 * 32 * Math.random()) * 3);
				ticker = itemstack.getOrCreateTag().getDouble("ticker");
				if (ticker < 24000 * 50) {
					itemstack.getOrCreateTag().putDouble("ticker", RandomTickerValue);
					break;
				}
				ticks = itemstack.getOrCreateTag().getDouble("ticks");
				itemstack.getOrCreateTag().putDouble("ticks", (ticks + 1));
				if (ticks > ticker) {
					if (oxide == 0) {
						if (CatastropheredoModItems.COPPER_OXIDE_0_HELMET.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_HELMET.get());
							solt = 3;
						} else if (CatastropheredoModItems.COPPER_OXIDE_0_CHESTPLATE.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE.get());
							solt = 2;
						} else if (CatastropheredoModItems.COPPER_OXIDE_0_LEGGINGS.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS.get());
							solt = 1;
						} else if (CatastropheredoModItems.COPPER_OXIDE_0_BOOTS.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_BOOTS.get());
							solt = 0;
						}
					} else if (oxide == 1) {
						if (CatastropheredoModItems.COPPER_OXIDE_1_HELMET.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_HELMET.get());
							solt = 3;
						} else if (CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_CHESTPLATE.get());
							solt = 2;
						} else if (CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_LEGGINGS.get());
							solt = 1;
						} else if (CatastropheredoModItems.COPPER_OXIDE_1_BOOTS.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_BOOTS.get());
							solt = 0;
						}
					} else if (oxide == 2) {
						if (CatastropheredoModItems.COPPER_OXIDE_2_HELMET.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_HELMET.get());
							solt = 3;
						} else if (CatastropheredoModItems.COPPER_OXIDE_2_CHESTPLATE.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_CHESTPLATE.get());
							solt = 2;
						} else if (CatastropheredoModItems.COPPER_OXIDE_2_LEGGINGS.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_LEGGINGS.get());
							solt = 1;
						} else if (CatastropheredoModItems.COPPER_OXIDE_2_BOOTS.get() == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_BOOTS.get());
							solt = 0;
						}
					}
					if (item.getItem() == (ItemStack.EMPTY).getItem()) {
						break;
					}
					item.getOrCreateTag().putDouble("oxidise", (itemstack.getOrCreateTag().getDouble("oxidise") + 1));
					item.getOrCreateTag().putDouble("ticks", 1);
					item.getOrCreateTag().putDouble("ticker", RandomTickerValue);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set((int) solt, item);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) solt), item);
						}
					}
					(item).setDamageValue((itemstack).getDamageValue());
					(item.getOrCreateTag()).put("Enchantments", itemstack.getEnchantmentTags());
					break;
				}
			}
		}
	}
}

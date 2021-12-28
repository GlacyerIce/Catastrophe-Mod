package net.mcreator.catastropheredo.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.catastropheredo.init.CatastropheredoModItems;

public class CopperArmourTickEventProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack item = ItemStack.EMPTY;
		double ticks = 0;
		double ticker = 0;
		double oxide = 0;
		double RandomTickerValue = 0;
		if ((itemstack).isEnchanted() && (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
			return;
		}
		RandomTickerValue = 1200000 + 768000 * Math.random();
		if (itemstack.getOrCreateTag().getDouble("ticker") < 1200000) {
			itemstack.getOrCreateTag().putDouble("ticker", RandomTickerValue);
			return;
		}
		ticks = itemstack.getOrCreateTag().getDouble("ticks");
		ticker = itemstack.getOrCreateTag().getDouble("ticker");
		itemstack.getOrCreateTag().putDouble("ticks", (ticks + 1));
		if (ticks > ticker) {
			if (oxide == 0) {
				if (CatastropheredoModItems.COPPER_OXIDE_0_HELMET == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_HELMET);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(3, (item));
						else
							_entity.setItemSlot(EquipmentSlot.HEAD, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPPER_OXIDE_0_CHESTPLATE == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(2, (item));
						else
							_entity.setItemSlot(EquipmentSlot.CHEST, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPPER_OXIDE_0_LEGGINGS == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(1, (item));
						else
							_entity.setItemSlot(EquipmentSlot.LEGS, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPPER_OXIDE_0_BOOTS == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_BOOTS);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(0, (item));
						else
							_entity.setItemSlot(EquipmentSlot.FEET, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				}
			} else if (oxide == 1) {
				if (CatastropheredoModItems.COPPER_OXIDE_1_HELMET == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPER_OXIDE_2_HELMET);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(3, (item));
						else
							_entity.setItemSlot(EquipmentSlot.HEAD, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPER_OXIDE_2_CHESTPLATE);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(2, (item));
						else
							_entity.setItemSlot(EquipmentSlot.CHEST, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPER_OXIDE_2_LEGGINGS);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(1, (item));
						else
							_entity.setItemSlot(EquipmentSlot.LEGS, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPPER_OXIDE_1_BOOTS == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPER_OXIDE_2_BOOTS);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(0, (item));
						else
							_entity.setItemSlot(EquipmentSlot.FEET, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				}
			} else if (oxide == 2) {
				if (CatastropheredoModItems.COPER_OXIDE_2_HELMET == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_HELMET);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(3, (item));
						else
							_entity.setItemSlot(EquipmentSlot.HEAD, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPER_OXIDE_2_CHESTPLATE == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_CHESTPLATE);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(2, (item));
						else
							_entity.setItemSlot(EquipmentSlot.CHEST, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPER_OXIDE_2_LEGGINGS == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_LEGGINGS);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(1, (item));
						else
							_entity.setItemSlot(EquipmentSlot.LEGS, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				} else if (CatastropheredoModItems.COPER_OXIDE_2_BOOTS == itemstack.getItem()) {
					item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_BOOTS);
					((item)).setDamageValue((itemstack).getDamageValue());
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set(0, (item));
						else
							_entity.setItemSlot(EquipmentSlot.FEET, (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
				}
			}
			if ((item).getItem() == (ItemStack.EMPTY).getItem()) {
				return;
			}
			(item).getOrCreateTag().putDouble("oxidise", (itemstack.getOrCreateTag().getDouble("oxidise") + 1));
			(item).getOrCreateTag().putDouble("ticks", 0);
			(item).getOrCreateTag().putDouble("ticker", RandomTickerValue);
		}
	}
}

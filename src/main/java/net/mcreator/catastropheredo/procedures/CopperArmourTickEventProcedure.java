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
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.catastropheredo.init.CatastropheredoModItems;
import net.mcreator.catastropheredo.CatastropheredoMod;

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
		if (!((world.getLevelData().getGameRules().getInt(GameRules.RULE_RANDOMTICKING)) > 0)) {
			for (int index0 = 0; index0 < (int) ((world.getLevelData().getGameRules().getInt(GameRules.RULE_RANDOMTICKING)) / 3); index0++) {
				if ((itemstack).isEnchanted() && (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack) != 0
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
					return;
				}
				RandomTickerValue = Math.round(24000 * 50 + 24000 * 32 * Math.random());
				ticker = itemstack.getOrCreateTag().getDouble("ticker");
				if (ticker < 24000 * 50) {
					itemstack.getOrCreateTag().putDouble("ticker", RandomTickerValue);
					return;
				}
				ticks = itemstack.getOrCreateTag().getDouble("ticks");
				oxide = itemstack.getOrCreateTag().getDouble("oxidise");
				itemstack.getOrCreateTag().putDouble("ticks", (ticks + 1));
				CatastropheredoMod.LOGGER.info(new java.text.DecimalFormat("##.##").format(ticks));
				if (ticks > ticker) {
					if (oxide == 0) {
						if (CatastropheredoModItems.COPPER_OXIDE_0_HELMET == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_HELMET);
							solt = 3;
						} else if (CatastropheredoModItems.COPPER_OXIDE_0_CHESTPLATE == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE);
							solt = 2;
						} else if (CatastropheredoModItems.COPPER_OXIDE_0_LEGGINGS == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS);
							solt = 1;
						} else if (CatastropheredoModItems.COPPER_OXIDE_0_BOOTS == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_1_BOOTS);
							solt = 0;
						}
					} else if (oxide == 1) {
						if (CatastropheredoModItems.COPPER_OXIDE_1_HELMET == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_HELMET);
							solt = 3;
						} else if (CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_CHESTPLATE);
							solt = 2;
						} else if (CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_LEGGINGS);
							solt = 1;
						} else if (CatastropheredoModItems.COPPER_OXIDE_1_BOOTS == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_2_BOOTS);
							solt = 0;
						}
					} else if (oxide == 2) {
						if (CatastropheredoModItems.COPPER_OXIDE_2_HELMET == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_HELMET);
							solt = 3;
						} else if (CatastropheredoModItems.COPPER_OXIDE_2_CHESTPLATE == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_CHESTPLATE);
							solt = 2;
						} else if (CatastropheredoModItems.COPPER_OXIDE_2_LEGGINGS == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_LEGGINGS);
							solt = 1;
						} else if (CatastropheredoModItems.COPPER_OXIDE_2_BOOTS == itemstack.getItem()) {
							item = new ItemStack(CatastropheredoModItems.COPPER_OXIDE_3_BOOTS);
							solt = 0;
						}
					}
					if ((item).getItem() == (ItemStack.EMPTY).getItem()) {
						return;
					}
					(item).getOrCreateTag().putDouble("oxidise", (itemstack.getOrCreateTag().getDouble("oxidise") + 1));
					(item).getOrCreateTag().putDouble("ticks", 1);
					(item).getOrCreateTag().putDouble("ticker", RandomTickerValue);
					if (entity instanceof LivingEntity _entity) {
						if (_entity instanceof Player _player)
							_player.getInventory().armor.set((int) solt, (item));
						else
							_entity.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) solt), (item));
						if (_entity instanceof ServerPlayer _serverPlayer)
							_serverPlayer.getInventory().setChanged();
					}
					((item)).setDamageValue((itemstack).getDamageValue());
					(item.getOrCreateTag()).put("Enchantments", itemstack.getEnchantmentTags());
				}
			}
		}
	}
}

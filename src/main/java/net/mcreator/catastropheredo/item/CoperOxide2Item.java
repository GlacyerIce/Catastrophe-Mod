
package net.mcreator.catastropheredo.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.catastropheredo.procedures.CopperArmourTickEventProcedure;

public abstract class CoperOxide2Item extends ArmorItem {
	public CoperOxide2Item(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 18;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 8;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}

			@Override
			public String getName() {
				return "coper_oxide_2";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CoperOxide2Item {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(null));
			setRegistryName("coper_oxide_2_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/weatheredcopper__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CopperArmourTickEventProcedure.execute(entity, itemstack);
		}
	}

	public static class Chestplate extends CoperOxide2Item {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(null));
			setRegistryName("coper_oxide_2_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/weatheredcopper__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CopperArmourTickEventProcedure.execute(entity, itemstack);
		}
	}

	public static class Leggings extends CoperOxide2Item {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(null));
			setRegistryName("coper_oxide_2_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/weatheredcopper__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CopperArmourTickEventProcedure.execute(entity, itemstack);
		}
	}

	public static class Boots extends CoperOxide2Item {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(null));
			setRegistryName("coper_oxide_2_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/weatheredcopper__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CopperArmourTickEventProcedure.execute(entity, itemstack);
		}
	}
}

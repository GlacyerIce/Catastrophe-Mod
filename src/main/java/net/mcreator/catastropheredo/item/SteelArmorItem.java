
package net.mcreator.catastropheredo.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.catastropheredo.init.CatastropheredoModTabs;
import net.mcreator.catastropheredo.init.CatastropheredoModItems;

public abstract class SteelArmorItem extends ArmorItem {
	public SteelArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 24, 20, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 64;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CatastropheredoModItems.STEEL_INGOT.get()));
			}

			@Override
			public String getName() {
				return "steel_armor";
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

	public static class Helmet extends SteelArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/steel__layer_1.png";
		}
	}

	public static class Chestplate extends SteelArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/steel__layer_1.png";
		}
	}

	public static class Leggings extends SteelArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/steel__layer_2.png";
		}
	}

	public static class Boots extends SteelArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/steel__layer_1.png";
		}
	}
}

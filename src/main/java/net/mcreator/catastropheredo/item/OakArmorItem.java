
package net.mcreator.catastropheredo.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
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

public abstract class OakArmorItem extends ArmorItem {
	public OakArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 6;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 2, 3, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_LOG), new ItemStack(Blocks.OAK_PLANKS), new ItemStack(Blocks.SPRUCE_PLANKS),
						new ItemStack(Blocks.BIRCH_PLANKS), new ItemStack(Blocks.JUNGLE_PLANKS), new ItemStack(Blocks.ACACIA_PLANKS),
						new ItemStack(Blocks.DARK_OAK_PLANKS));
			}

			@Override
			public String getName() {
				return "oak_armor";
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

	public static class Helmet extends OakArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
			setRegistryName("oak_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/oak__layer_1.png";
		}
	}

	public static class Chestplate extends OakArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
			setRegistryName("oak_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/oak__layer_1.png";
		}
	}

	public static class Leggings extends OakArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
			setRegistryName("oak_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/oak__layer_2.png";
		}
	}

	public static class Boots extends OakArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CatastropheredoModTabs.TAB_CATASTROPHE_ARMOR));
			setRegistryName("oak_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "catastropheredo:textures/models/armor/oak__layer_1.png";
		}
	}
}

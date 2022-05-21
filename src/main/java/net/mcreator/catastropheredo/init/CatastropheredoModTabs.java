
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CatastropheredoModTabs {
	public static CreativeModeTab TAB_CATASTROPHE_ARMOR;
	public static CreativeModeTab TAB_CATASTROPHE_MUSIC_DISCS;
	public static CreativeModeTab TAB_CATASTROPHIC_STORAGE;
	public static CreativeModeTab TAB_CATASTROPHE_TOOLS_AND_WEAPONS;
	public static CreativeModeTab TAB_CATASTROPHIC_ORES;
	public static CreativeModeTab TAB_CATASTROPHIC_FOOD;

	public static void load() {
		TAB_CATASTROPHE_ARMOR = new CreativeModeTab("tabcatastrophe_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.EMERALD_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CATASTROPHE_MUSIC_DISCS = new CreativeModeTab("tabcatastrophe_music_discs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.MUSIC_DISC_11);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_CATASTROPHIC_STORAGE = new CreativeModeTab("tabcatastrophic_storage") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CatastropheredoModBlocks.TOTALLY_A_CHEST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CATASTROPHE_TOOLS_AND_WEAPONS = new CreativeModeTab("tabcatastrophe_tools_and_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CatastropheredoModItems.SAKURA_DIAMOND_BATTLE_AXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CATASTROPHIC_ORES = new CreativeModeTab("tabcatastrophic_ores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CatastropheredoModBlocks.SAKURA_DIAMOND_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CATASTROPHIC_FOOD = new CreativeModeTab("tabcatastrophic_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CatastropheredoModItems.GOLDEN_STEAK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

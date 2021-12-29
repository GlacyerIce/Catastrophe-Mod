
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.catastropheredo.item.TruePigstepItem;
import net.mcreator.catastropheredo.item.SweetBerryStewItem;
import net.mcreator.catastropheredo.item.SteelSwordItem;
import net.mcreator.catastropheredo.item.SteelSteakItem;
import net.mcreator.catastropheredo.item.SteelShovelItem;
import net.mcreator.catastropheredo.item.SteelPickaxeItem;
import net.mcreator.catastropheredo.item.SteelNuggetItem;
import net.mcreator.catastropheredo.item.SteelIngotItem;
import net.mcreator.catastropheredo.item.SteelHoeItem;
import net.mcreator.catastropheredo.item.SteelAxeItem;
import net.mcreator.catastropheredo.item.SteelArmorItem;
import net.mcreator.catastropheredo.item.SteelAppleItem;
import net.mcreator.catastropheredo.item.SilverNuggetItem;
import net.mcreator.catastropheredo.item.SakuraDiamondSwordItem;
import net.mcreator.catastropheredo.item.SakuraDiamondShovelItem;
import net.mcreator.catastropheredo.item.SakuraDiamondPickaxeItem;
import net.mcreator.catastropheredo.item.SakuraDiamondItem;
import net.mcreator.catastropheredo.item.SakuraDiamondHoeItem;
import net.mcreator.catastropheredo.item.SakuraDiamondArmorItem;
import net.mcreator.catastropheredo.item.SakuraBattleAxeItem;
import net.mcreator.catastropheredo.item.RawsteelItem;
import net.mcreator.catastropheredo.item.RawSilverItem;
import net.mcreator.catastropheredo.item.OakArmorItem;
import net.mcreator.catastropheredo.item.IngotSilverItem;
import net.mcreator.catastropheredo.item.GoldenSteakItem;
import net.mcreator.catastropheredo.item.Emerald_SwordItem;
import net.mcreator.catastropheredo.item.Emerald_ShovelItem;
import net.mcreator.catastropheredo.item.Emerald_PickaxeItem;
import net.mcreator.catastropheredo.item.Emerald_HoeItem;
import net.mcreator.catastropheredo.item.Emerald_AxeItem;
import net.mcreator.catastropheredo.item.Emerald_ArmorArmorItem;
import net.mcreator.catastropheredo.item.CopperOxide3Item;
import net.mcreator.catastropheredo.item.CopperOxide2Item;
import net.mcreator.catastropheredo.item.CopperOxide1Item;
import net.mcreator.catastropheredo.item.CopperOxide0Item;
import net.mcreator.catastropheredo.item.ChainMailItem;
import net.mcreator.catastropheredo.item.CarefreeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatastropheredoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RAWSTEEL = register(new RawsteelItem());
	public static final Item STEEL_INGOT = register(new SteelIngotItem());
	public static final Item STEEL_NUGGET = register(new SteelNuggetItem());
	public static final Item CHAIN_MAIL = register(new ChainMailItem());
	public static final Item STEEL_ORE = register(CatastropheredoModBlocks.STEEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item STEEL_BLOCK = register(CatastropheredoModBlocks.STEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item STEEL_AXE = register(new SteelAxeItem());
	public static final Item STEEL_PICKAXE = register(new SteelPickaxeItem());
	public static final Item STEEL_SHOVEL = register(new SteelShovelItem());
	public static final Item STEEL_HOE = register(new SteelHoeItem());
	public static final Item EMERALD_AXE = register(new Emerald_AxeItem());
	public static final Item EMERALD_PICKAXE = register(new Emerald_PickaxeItem());
	public static final Item EMERALD_SHOVEL = register(new Emerald_ShovelItem());
	public static final Item EMERALD_HOE = register(new Emerald_HoeItem());
	public static final Item SAKURA_DIAMOND_HOE = register(new SakuraDiamondHoeItem());
	public static final Item STEEL_SWORD = register(new SteelSwordItem());
	public static final Item EMERALD_SWORD = register(new Emerald_SwordItem());
	public static final Item SAKURA_DIAMOND_ARMOR_HELMET = register(new SakuraDiamondArmorItem.Helmet());
	public static final Item SAKURA_DIAMOND_ARMOR_CHESTPLATE = register(new SakuraDiamondArmorItem.Chestplate());
	public static final Item SAKURA_DIAMOND_ARMOR_LEGGINGS = register(new SakuraDiamondArmorItem.Leggings());
	public static final Item SAKURA_DIAMOND_ARMOR_BOOTS = register(new SakuraDiamondArmorItem.Boots());
	public static final Item GAPPLE_COW = register(
			new SpawnEggItem(CatastropheredoModEntities.GAPPLE_COW, -26368, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("gapple_cow_spawn_egg"));
	public static final Item GOLDEN_STEAK = register(new GoldenSteakItem());
	public static final Item STEEL_STEAK = register(new SteelSteakItem());
	public static final Item STEEL_ARMOR_HELMET = register(new SteelArmorItem.Helmet());
	public static final Item STEEL_ARMOR_CHESTPLATE = register(new SteelArmorItem.Chestplate());
	public static final Item STEEL_ARMOR_LEGGINGS = register(new SteelArmorItem.Leggings());
	public static final Item STEEL_ARMOR_BOOTS = register(new SteelArmorItem.Boots());
	public static final Item EMERALD_ARMOR_ARMOR_HELMET = register(new Emerald_ArmorArmorItem.Helmet());
	public static final Item EMERALD_ARMOR_ARMOR_CHESTPLATE = register(new Emerald_ArmorArmorItem.Chestplate());
	public static final Item EMERALD_ARMOR_ARMOR_LEGGINGS = register(new Emerald_ArmorArmorItem.Leggings());
	public static final Item EMERALD_ARMOR_ARMOR_BOOTS = register(new Emerald_ArmorArmorItem.Boots());
	public static final Item OAK_ARMOR_HELMET = register(new OakArmorItem.Helmet());
	public static final Item OAK_ARMOR_CHESTPLATE = register(new OakArmorItem.Chestplate());
	public static final Item OAK_ARMOR_LEGGINGS = register(new OakArmorItem.Leggings());
	public static final Item OAK_ARMOR_BOOTS = register(new OakArmorItem.Boots());
	public static final Item SAKURA_DIAMOND_BLOCK = register(CatastropheredoModBlocks.SAKURA_DIAMOND_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TRUE_PIGSTEP = register(new TruePigstepItem());
	public static final Item CAREFREE = register(new CarefreeItem());
	public static final Item TOTALLY_A_CHEST = register(CatastropheredoModBlocks.TOTALLY_A_CHEST, CatastropheredoModTabs.TAB_CATASTROPHIC_STORAGE);
	public static final Item SAKURA_DIAMOND_BATTLE_AXE = register(new SakuraBattleAxeItem());
	public static final Item SAKURA_DIAMOND_SWORD = register(new SakuraDiamondSwordItem());
	public static final Item SAKURA_DIAMOND_PICKAXE = register(new SakuraDiamondPickaxeItem());
	public static final Item SAKURA_DIAMOND_SHOVEL = register(new SakuraDiamondShovelItem());
	public static final Item SAKURA_DIAMOND = register(new SakuraDiamondItem());
	public static final Item SAKURA_DIAMOND_ORE = register(CatastropheredoModBlocks.SAKURA_DIAMOND_ORE, CatastropheredoModTabs.TAB_CATASTROPHIC_ORES);
	public static final Item SWEET_BERRY_STEW = register(new SweetBerryStewItem());
	public static final Item STEEL_APPLE = register(new SteelAppleItem());
	public static final Item COPPER_OXIDE_1_HELMET = register(new CopperOxide1Item.Helmet());
	public static final Item COPPER_OXIDE_1_CHESTPLATE = register(new CopperOxide1Item.Chestplate());
	public static final Item COPPER_OXIDE_1_LEGGINGS = register(new CopperOxide1Item.Leggings());
	public static final Item COPPER_OXIDE_1_BOOTS = register(new CopperOxide1Item.Boots());
	public static final Item COPPER_OXIDE_2_HELMET = register(new CopperOxide2Item.Helmet());
	public static final Item COPPER_OXIDE_2_CHESTPLATE = register(new CopperOxide2Item.Chestplate());
	public static final Item COPPER_OXIDE_2_LEGGINGS = register(new CopperOxide2Item.Leggings());
	public static final Item COPPER_OXIDE_2_BOOTS = register(new CopperOxide2Item.Boots());
	public static final Item COPPER_OXIDE_0_HELMET = register(new CopperOxide0Item.Helmet());
	public static final Item COPPER_OXIDE_0_CHESTPLATE = register(new CopperOxide0Item.Chestplate());
	public static final Item COPPER_OXIDE_0_LEGGINGS = register(new CopperOxide0Item.Leggings());
	public static final Item COPPER_OXIDE_0_BOOTS = register(new CopperOxide0Item.Boots());
	public static final Item COPPER_OXIDE_3_HELMET = register(new CopperOxide3Item.Helmet());
	public static final Item COPPER_OXIDE_3_CHESTPLATE = register(new CopperOxide3Item.Chestplate());
	public static final Item COPPER_OXIDE_3_LEGGINGS = register(new CopperOxide3Item.Leggings());
	public static final Item COPPER_OXIDE_3_BOOTS = register(new CopperOxide3Item.Boots());
	public static final Item RAW_SILVER = register(new RawSilverItem());
	public static final Item INGOT_SILVER = register(new IngotSilverItem());
	public static final Item SILVER_ORE = register(CatastropheredoModBlocks.SILVER_ORE, CatastropheredoModTabs.TAB_CATASTROPHIC_ORES);
	public static final Item SILVER_NUGGET = register(new SilverNuggetItem());
	public static final Item SAKURA_LOG = register(CatastropheredoModBlocks.SAKURA_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SAKRUA_LEAVES = register(CatastropheredoModBlocks.SAKRUA_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SAKURA_SAPLING = register(CatastropheredoModBlocks.SAKURA_SAPLING, CreativeModeTab.TAB_DECORATIONS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}

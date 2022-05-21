
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.catastropheredo.item.WardenRibItem;
import net.mcreator.catastropheredo.item.WardenDaggerItem;
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
import net.mcreator.catastropheredo.item.DeepslateStickItem;
import net.mcreator.catastropheredo.item.CopperOxide3Item;
import net.mcreator.catastropheredo.item.CopperOxide2Item;
import net.mcreator.catastropheredo.item.CopperOxide1Item;
import net.mcreator.catastropheredo.item.CopperOxide0Item;
import net.mcreator.catastropheredo.item.ChainMailItem;
import net.mcreator.catastropheredo.item.CarefreeItem;
import net.mcreator.catastropheredo.CatastropheredoMod;

public class CatastropheredoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CatastropheredoMod.MODID);
	public static final RegistryObject<Item> RAWSTEEL = REGISTRY.register("rawsteel", () -> new RawsteelItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new SteelNuggetItem());
	public static final RegistryObject<Item> CHAIN_MAIL = REGISTRY.register("chain_mail", () -> new ChainMailItem());
	public static final RegistryObject<Item> STEEL_ORE = block(CatastropheredoModBlocks.STEEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_BLOCK = block(CatastropheredoModBlocks.STEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> EMERALD_AXE = REGISTRY.register("emerald_axe", () -> new Emerald_AxeItem());
	public static final RegistryObject<Item> EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", () -> new Emerald_PickaxeItem());
	public static final RegistryObject<Item> EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", () -> new Emerald_ShovelItem());
	public static final RegistryObject<Item> EMERALD_HOE = REGISTRY.register("emerald_hoe", () -> new Emerald_HoeItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND_HOE = REGISTRY.register("sakura_diamond_hoe", () -> new SakuraDiamondHoeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new Emerald_SwordItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND_ARMOR_HELMET = REGISTRY.register("sakura_diamond_armor_helmet",
			() -> new SakuraDiamondArmorItem.Helmet());
	public static final RegistryObject<Item> SAKURA_DIAMOND_ARMOR_CHESTPLATE = REGISTRY.register("sakura_diamond_armor_chestplate",
			() -> new SakuraDiamondArmorItem.Chestplate());
	public static final RegistryObject<Item> SAKURA_DIAMOND_ARMOR_LEGGINGS = REGISTRY.register("sakura_diamond_armor_leggings",
			() -> new SakuraDiamondArmorItem.Leggings());
	public static final RegistryObject<Item> SAKURA_DIAMOND_ARMOR_BOOTS = REGISTRY.register("sakura_diamond_armor_boots",
			() -> new SakuraDiamondArmorItem.Boots());
	public static final RegistryObject<Item> GAPPLE_COW = REGISTRY.register("gapple_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(CatastropheredoModEntities.GAPPLE_COW, -26368, -16777216,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate",
			() -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_HELMET = REGISTRY.register("emerald_armor_armor_helmet",
			() -> new Emerald_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_armor_chestplate",
			() -> new Emerald_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_armor_leggings",
			() -> new Emerald_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_ARMOR_BOOTS = REGISTRY.register("emerald_armor_armor_boots",
			() -> new Emerald_ArmorArmorItem.Boots());
	public static final RegistryObject<Item> OAK_ARMOR_HELMET = REGISTRY.register("oak_armor_helmet", () -> new OakArmorItem.Helmet());
	public static final RegistryObject<Item> OAK_ARMOR_CHESTPLATE = REGISTRY.register("oak_armor_chestplate", () -> new OakArmorItem.Chestplate());
	public static final RegistryObject<Item> OAK_ARMOR_LEGGINGS = REGISTRY.register("oak_armor_leggings", () -> new OakArmorItem.Leggings());
	public static final RegistryObject<Item> OAK_ARMOR_BOOTS = REGISTRY.register("oak_armor_boots", () -> new OakArmorItem.Boots());
	public static final RegistryObject<Item> SAKURA_DIAMOND_BLOCK = block(CatastropheredoModBlocks.SAKURA_DIAMOND_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TRUE_PIGSTEP = REGISTRY.register("true_pigstep", () -> new TruePigstepItem());
	public static final RegistryObject<Item> CAREFREE = REGISTRY.register("carefree", () -> new CarefreeItem());
	public static final RegistryObject<Item> TOTALLY_A_CHEST = block(CatastropheredoModBlocks.TOTALLY_A_CHEST,
			CatastropheredoModTabs.TAB_CATASTROPHIC_STORAGE);
	public static final RegistryObject<Item> SAKURA_DIAMOND_BATTLE_AXE = REGISTRY.register("sakura_diamond_battle_axe",
			() -> new SakuraBattleAxeItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND_SWORD = REGISTRY.register("sakura_diamond_sword", () -> new SakuraDiamondSwordItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND_PICKAXE = REGISTRY.register("sakura_diamond_pickaxe",
			() -> new SakuraDiamondPickaxeItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND_SHOVEL = REGISTRY.register("sakura_diamond_shovel", () -> new SakuraDiamondShovelItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND = REGISTRY.register("sakura_diamond", () -> new SakuraDiamondItem());
	public static final RegistryObject<Item> SAKURA_DIAMOND_ORE = block(CatastropheredoModBlocks.SAKURA_DIAMOND_ORE,
			CatastropheredoModTabs.TAB_CATASTROPHIC_ORES);
	public static final RegistryObject<Item> COPPER_OXIDE_1_HELMET = REGISTRY.register("copper_oxide_1_helmet", () -> new CopperOxide1Item.Helmet());
	public static final RegistryObject<Item> COPPER_OXIDE_1_CHESTPLATE = REGISTRY.register("copper_oxide_1_chestplate",
			() -> new CopperOxide1Item.Chestplate());
	public static final RegistryObject<Item> COPPER_OXIDE_1_LEGGINGS = REGISTRY.register("copper_oxide_1_leggings",
			() -> new CopperOxide1Item.Leggings());
	public static final RegistryObject<Item> COPPER_OXIDE_1_BOOTS = REGISTRY.register("copper_oxide_1_boots", () -> new CopperOxide1Item.Boots());
	public static final RegistryObject<Item> COPPER_OXIDE_2_HELMET = REGISTRY.register("copper_oxide_2_helmet", () -> new CopperOxide2Item.Helmet());
	public static final RegistryObject<Item> COPPER_OXIDE_2_CHESTPLATE = REGISTRY.register("copper_oxide_2_chestplate",
			() -> new CopperOxide2Item.Chestplate());
	public static final RegistryObject<Item> COPPER_OXIDE_2_LEGGINGS = REGISTRY.register("copper_oxide_2_leggings",
			() -> new CopperOxide2Item.Leggings());
	public static final RegistryObject<Item> COPPER_OXIDE_2_BOOTS = REGISTRY.register("copper_oxide_2_boots", () -> new CopperOxide2Item.Boots());
	public static final RegistryObject<Item> COPPER_OXIDE_0_HELMET = REGISTRY.register("copper_oxide_0_helmet", () -> new CopperOxide0Item.Helmet());
	public static final RegistryObject<Item> COPPER_OXIDE_0_CHESTPLATE = REGISTRY.register("copper_oxide_0_chestplate",
			() -> new CopperOxide0Item.Chestplate());
	public static final RegistryObject<Item> COPPER_OXIDE_0_LEGGINGS = REGISTRY.register("copper_oxide_0_leggings",
			() -> new CopperOxide0Item.Leggings());
	public static final RegistryObject<Item> COPPER_OXIDE_0_BOOTS = REGISTRY.register("copper_oxide_0_boots", () -> new CopperOxide0Item.Boots());
	public static final RegistryObject<Item> COPPER_OXIDE_3_HELMET = REGISTRY.register("copper_oxide_3_helmet", () -> new CopperOxide3Item.Helmet());
	public static final RegistryObject<Item> COPPER_OXIDE_3_CHESTPLATE = REGISTRY.register("copper_oxide_3_chestplate",
			() -> new CopperOxide3Item.Chestplate());
	public static final RegistryObject<Item> COPPER_OXIDE_3_LEGGINGS = REGISTRY.register("copper_oxide_3_leggings",
			() -> new CopperOxide3Item.Leggings());
	public static final RegistryObject<Item> COPPER_OXIDE_3_BOOTS = REGISTRY.register("copper_oxide_3_boots", () -> new CopperOxide3Item.Boots());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> INGOT_SILVER = REGISTRY.register("ingot_silver", () -> new IngotSilverItem());
	public static final RegistryObject<Item> SILVER_ORE = block(CatastropheredoModBlocks.SILVER_ORE, CatastropheredoModTabs.TAB_CATASTROPHIC_ORES);
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> SAKURA_LOG = block(CatastropheredoModBlocks.SAKURA_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAKRUA_LEAVES = block(CatastropheredoModBlocks.SAKRUA_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SAKURA_SAPLING = block(CatastropheredoModBlocks.SAKURA_SAPLING, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SUPER_SLIP = block(CatastropheredoModBlocks.SUPER_SLIP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> GOLDEN_STEAK = REGISTRY.register("golden_steak", () -> new GoldenSteakItem());
	public static final RegistryObject<Item> STEEL_STEAK = REGISTRY.register("steel_steak", () -> new SteelSteakItem());
	public static final RegistryObject<Item> SWEET_BERRY_STEW = REGISTRY.register("sweet_berry_stew", () -> new SweetBerryStewItem());
	public static final RegistryObject<Item> STEEL_APPLE = REGISTRY.register("steel_apple", () -> new SteelAppleItem());
	public static final RegistryObject<Item> WARDEN_RIB = REGISTRY.register("warden_rib", () -> new WardenRibItem());
	public static final RegistryObject<Item> WARDEN_DAGGER = REGISTRY.register("warden_dagger", () -> new WardenDaggerItem());
	public static final RegistryObject<Item> DEEPSLATE_STICK = REGISTRY.register("deepslate_stick", () -> new DeepslateStickItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

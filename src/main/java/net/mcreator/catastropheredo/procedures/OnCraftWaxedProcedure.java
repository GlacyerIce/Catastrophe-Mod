package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.catastropheredo.init.CatastropheredoModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnCraftWaxedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("ticker") == 0) {
			return;
		}
		if (itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_HELMET.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_CHESTPLATE.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_LEGGINGS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_BOOTS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_HELMET.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_BOOTS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_HELMET.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_CHESTPLATE.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_LEGGINGS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_BOOTS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_HELMET.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_CHESTPLATE.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_LEGGINGS.get()
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_BOOTS.get()) {
			itemstack.getOrCreateTag().putBoolean("waxed", (true));
		}
	}
}

package net.mcreator.catastropheredo.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class OnCraftWaxedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		Entity entity = event.getPlayer();
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("ticker") == 0) {
			return;
		}
		if (itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_HELMET
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_CHESTPLATE
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_LEGGINGS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_0_BOOTS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_HELMET
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_CHESTPLATE
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_LEGGINGS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_1_BOOTS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_HELMET
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_CHESTPLATE
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_LEGGINGS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_3_BOOTS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_HELMET
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_CHESTPLATE
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_LEGGINGS
				|| itemstack.getItem() == CatastropheredoModItems.COPPER_OXIDE_2_BOOTS) {
			itemstack.getOrCreateTag().putBoolean("waxed", (true));
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catastropheredo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatastropheredoModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(80, 64).setRegistryName("sunset"));
		event.getRegistry().register(new Motive(80, 64).setRegistryName("endtherworld"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("desert"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("literal_bomb"));
	}
}

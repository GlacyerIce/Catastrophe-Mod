package net.mcreator.catastropheredo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.catastropheredo.entity.GappleCowEntity;

public class GappleCowRenderer extends MobRenderer<GappleCowEntity, CowModel<GappleCowEntity>> {
	public GappleCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GappleCowEntity entity) {
		return new ResourceLocation("catastropheredo:textures/red_mooshroom.png");
	}
}

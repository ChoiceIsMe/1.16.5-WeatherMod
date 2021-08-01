package io.github.choiceisme.client.entity.model;

import io.github.choiceisme.WeatherMod;
import io.github.choiceisme.common.entity.ExampleEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExampleEntityRenderer extends MobRenderer<ExampleEntity, ExampleEntityModel<ExampleEntity>>{
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(WeatherMod.MOD_ID, "textures/entity/example/example.png");

	public ExampleEntityRenderer(EntityRendererManager manager) {
		super(manager, new ExampleEntityModel<>(), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExampleEntity entity) {
		return TEXTURE;
	}

}

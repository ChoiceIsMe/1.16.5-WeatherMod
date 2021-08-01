package io.github.choiceisme.core.util;

import io.github.choiceisme.WeatherMod;
import io.github.choiceisme.client.entity.model.ExampleEntityRenderer;
import io.github.choiceisme.core.init.EntityTypeInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = WeatherMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)

public class ClientEventBusSubscriber {

	public static void clientSetup(FMLClientSetupEvent event) {
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.EXAMPLE.get(), ExampleEntityRenderer::new);
	}
	
}

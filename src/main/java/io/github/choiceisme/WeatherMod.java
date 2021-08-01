package io.github.choiceisme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.choiceisme.common.entity.ExampleEntity;
import io.github.choiceisme.core.init.BlockInit;
import io.github.choiceisme.core.init.EntityTypeInit;
import io.github.choiceisme.core.init.FeatureInit;
import io.github.choiceisme.core.init.ItemInit;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(WeatherMod.MOD_ID)
public class WeatherMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "choiceismemods";

    public WeatherMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
        bus.addListener(this::setup);
        
        EntityTypeInit.ENTITY_TYPES.register(bus);
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    @SuppressWarnings("deprecation")
	private void setup(final FMLCommonSetupEvent event) {

    	DeferredWorkQueue.runLater(() -> {
    		
    		GlobalEntityTypeAttributes.put(EntityTypeInit.EXAMPLE.get(), ExampleEntity.setAttributes().build());
        
    });
  }
}
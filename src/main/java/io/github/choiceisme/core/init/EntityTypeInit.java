package io.github.choiceisme.core.init;

import io.github.choiceisme.WeatherMod;
import io.github.choiceisme.common.entity.ExampleEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, WeatherMod.MOD_ID);
	
	public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE = ENTITY_TYPES.register("example", 
			() -> EntityType.Builder.of(ExampleEntity::new, EntityClassification.MONSTER).sized(1.0f, 1.0f)
			.build(new ResourceLocation(WeatherMod.MOD_ID, "example").toString()));
}

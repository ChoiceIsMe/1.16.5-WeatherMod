package io.github.choiceisme.core.init;

import io.github.choiceisme.WeatherMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			WeatherMod.MOD_ID);
	
	public static final RegistryObject<Block> MONKEY_BLOCK = BLOCKS.register("monkey_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(3)
					.sound(SoundType.METAL)
					.strength(15f, 30f)
					.requiresCorrectToolForDrops()));
					
}

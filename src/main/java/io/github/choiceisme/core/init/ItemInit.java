package io.github.choiceisme.core.init;

import io.github.choiceisme.WeatherMod;
import io.github.choiceisme.common.material.CustomArmorMaterial;
import io.github.choiceisme.common.material.CustomToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			 WeatherMod.MOD_ID);

	public static final RegistryObject<Item> MONKEY_ITEM = ITEMS.register("monkey_item",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> MONKEY_SWORD = ITEMS.register("monkey_sword", 
			() -> new SwordItem(CustomToolMaterial.MONKEY_ITEM, -1, -1f, 
					new Item.Properties().tab(ItemGroup.TAB_COMBAT)));; 
	
	public static final RegistryObject<Item> MONKEY_SHOVEL = ITEMS.register("monkey_shovel", 
			() -> new ShovelItem(CustomToolMaterial.MONKEY_ITEM, -2, -2f, 
					new Item.Properties().tab(ItemGroup.TAB_TOOLS))); 
	
	public static final RegistryObject<Item> MONKEY_PICKAXE = ITEMS.register("monkey_pickaxe", 
			() -> new PickaxeItem(CustomToolMaterial.MONKEY_ITEM, -3, -3f, 
					new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> MONKEY_AXE = ITEMS.register("monkey_axe", 
			() -> new AxeItem(CustomToolMaterial.MONKEY_ITEM, 1, -2f, 
					new Item.Properties().tab(ItemGroup.TAB_TOOLS))); 
	
	public static final RegistryObject<Item> MONKEY_HOE = ITEMS.register("monkey_hoe", 
			() -> new HoeItem(CustomToolMaterial.MONKEY_ITEM, -7, 2f, 
					new Item.Properties().tab(ItemGroup.TAB_TOOLS))); 
	
	public static final RegistryObject<Item> MONKEY_HELMET = ITEMS.register("monkey_helmet", 
			() -> new ArmorItem(CustomArmorMaterial.MONKEY_ARMOR, EquipmentSlotType.HEAD, 
					new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> MONKEY_CHESTPLATE = ITEMS.register("monkey_chestplate", 
			() -> new ArmorItem(CustomArmorMaterial.MONKEY_ARMOR, EquipmentSlotType.CHEST, 
					new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> MONKEY_LEGGINGS = ITEMS.register("monkey_leggings", 
			() -> new ArmorItem(CustomArmorMaterial.MONKEY_ARMOR, EquipmentSlotType.LEGS, 
					new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> MONKEY_BOOTS = ITEMS.register("monkey_boots", 
			() -> new ArmorItem(CustomArmorMaterial.MONKEY_ARMOR, EquipmentSlotType.FEET, 
					new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<BlockItem> MONKEY_BLOCK = ITEMS.register("monkey_block", () -> new BlockItem(BlockInit.MONKEY_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
}

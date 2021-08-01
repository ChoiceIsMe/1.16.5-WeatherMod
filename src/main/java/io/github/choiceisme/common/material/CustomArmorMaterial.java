package io.github.choiceisme.common.material;

import java.util.function.Supplier;

import io.github.choiceisme.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CustomArmorMaterial implements IArmorMaterial {
	
    MONKEY_ARMOR("monkey", 10, new int[] {4, 7, 9, 4}, 17, SoundEvents.ARMOR_EQUIP_CHAIN, 4f, 0.2f, () -> Ingredient.of(ItemInit.MONKEY_ITEM.get()));

	private static final int[] baseDurability = { 128, 144, 160, 112};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	
	CustomArmorMaterial(String name, int durabilityMultiplier, int [] armorVal, int enchantability, 
			SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
		
	}
		
	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		// TODO Auto-generated method stub
		return this.baseDurability[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slot) {
		// TODO Auto-generated method stub
		return this.armorVal[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return this.knockbackResistance;
	}

}

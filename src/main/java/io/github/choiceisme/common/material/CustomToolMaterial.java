package io.github.choiceisme.common.material;

import com.google.common.base.Supplier;

import io.github.choiceisme.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier {
	
	MONKEY_ITEM(3, 3000, 25f, 10f, 17, () -> Ingredient.of(ItemInit.MONKEY_ITEM.get()));
	
	private final int HarvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	CustomToolMaterial(int HarvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		
		this.HarvestLevel = HarvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
		
		
	}
	
	@Override
	public int getUses() {
		return this.maxUses;
	}
	@Override
	public float getSpeed() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}
	@Override
	public int getLevel() {
		return this.HarvestLevel;
	}
	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
		
	}
	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial;
	
    }
}

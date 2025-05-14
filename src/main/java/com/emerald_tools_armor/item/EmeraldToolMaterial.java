package com.emerald_tools_armor.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.Items;

public class EmeraldToolMaterial implements ToolMaterial {
    public static final EmeraldToolMaterial INSTANCE = new EmeraldToolMaterial();

    @Override
    public int getDurability() {
        return 1500; // Menor que diamante (1561)
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f; // Diamante é 8.0
    }

    @Override
    public float getAttackDamage() {
        return 3.0f; // dano base da espada
    }

    @Override
    public int getMiningLevel() {
        return 2; // 2 = ferro, 3 = diamante
    }

    @Override
    public int getEnchantability() {
        return 18; // Diamante é 10, ouro é 22
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}

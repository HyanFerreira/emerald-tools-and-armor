package com.emerald_tools_armor.item;

import com.emerald_tools_armor.EmeraldToolsAndArmor;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModItems {
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
        new SwordItem(
            EmeraldToolMaterial.INSTANCE,
            3,  // bônus de dano (diamante = 3)
            -2.4f, // velocidade de ataque padrão
            new Item.Settings().maxCount(1)
        )
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EmeraldToolsAndArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EmeraldToolsAndArmor.LOGGER.info("Registrando os itens do mod...");
    }
}

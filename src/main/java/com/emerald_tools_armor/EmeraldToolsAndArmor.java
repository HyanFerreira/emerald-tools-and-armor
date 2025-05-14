package com.emerald_tools_armor;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.emerald_tools_armor.item.ModItems;

public class EmeraldToolsAndArmor implements ModInitializer {

    public static final String MOD_ID = "emerald-tools-and-armor";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Inicializando Emerald Tools and Armor Mod");
        ModItems.registerModItems();
    }

}

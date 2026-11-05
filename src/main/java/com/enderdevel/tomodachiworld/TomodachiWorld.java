package com.enderdevel.tomodachiworld;

import com.enderdevel.tomodachiworld.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public final class TomodachiWorld implements ModInitializer {
    public static final String MOD_ID = "tomodachiworld";

    @Override
    public void onInitialize() {
        ModScreenHandlers.register();
        ModEntities.register();
        ModItems.register();
        ModItemGroups.register();
        GuideInteraction.register();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}

package com.enderdevel.tomodachiworld;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKeys;

public final class ModItems {
    public static final SpawnEggItem STEVE_SPAWN_EGG = new SpawnEggItem(
            ModEntities.STEVE_GUIDE, 0x8B7A5E, 0x2E9E5C,
            new FabricItemSettings());

    public static final SpawnEggItem BETA_ZOMBIE_SPAWN_EGG = new SpawnEggItem(
            ModEntities.BETA_ZOMBIE, 0x2E9E5C, 0x3A3A3A,
            new FabricItemSettings());

    public static void register() {
        Registry.register(Registry.ITEM, TomodachiWorld.id("steve_guide_spawn_egg"), STEVE_SPAWN_EGG);
        Registry.register(Registry.ITEM, TomodachiWorld.id("beta_zombie_spawn_egg"), BETA_ZOMBIE_SPAWN_EGG);
    }

    private ModItems() {
    }
}

package com.enderdevel.tomodachiworld;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;

public final class ModItemGroups {
    public static final ItemGroup TOMODACHI_GROUP = FabricItemGroupBuilder.create(TomodachiWorld.id("tomodachiworld"))
            .icon(() -> new ItemStack(ModItems.STEVE_SPAWN_EGG))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.STEVE_SPAWN_EGG));
                stacks.add(new ItemStack(ModItems.BETA_ZOMBIE_SPAWN_EGG));
            })
            .build();

    public static void register() {
        Registry.register(Registry.ITEM_GROUP, TomodachiWorld.id("tomodachiworld"), TOMODACHI_GROUP);
    }

    private ModItemGroups() {
    }
}

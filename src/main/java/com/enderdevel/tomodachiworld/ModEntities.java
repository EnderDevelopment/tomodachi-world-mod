package com.enderdevel.tomodachiworld;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public final class ModEntities {
    public static final EntityType<SteveGuideEntity> STEVE_GUIDE = Registry.register(
            Registry.ENTITY_TYPE,
            TomodachiWorld.id("steve_guide"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SteveGuideEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f))
                    .build());

    public static final EntityType<BetaZombieEntity> BETA_ZOMBIE = Registry.register(
            Registry.ENTITY_TYPE,
            TomodachiWorld.id("beta_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BetaZombieEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.9f))
                    .build());

    public static void register() {
        FabricDefaultAttributeRegistry.register(STEVE_GUIDE, SteveGuideEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(BETA_ZOMBIE, BetaZombieEntity.createZombieAttributes());
    }

    private ModEntities() {
    }
}

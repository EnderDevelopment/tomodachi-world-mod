package com.enderdevel.tomodachiworld;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;

public class BetaZombieEntity extends ZombieEntity {
    public BetaZombieEntity(EntityType<? extends ZombieEntity> type, World world) {
        super(type, world);
    }
}

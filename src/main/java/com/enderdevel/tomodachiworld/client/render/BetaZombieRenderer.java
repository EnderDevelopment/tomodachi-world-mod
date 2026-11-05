package com.enderdevel.tomodachiworld.client.render;

import com.enderdevel.tomodachiworld.TomodachiWorld;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class BetaZombieRenderer extends ZombieEntityRenderer {
    private static final Identifier TEXTURE = TomodachiWorld.id("textures/entity/beta_zombie.png");

    public BetaZombieRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ZombieEntity entity) {
        return TEXTURE;
    }
}

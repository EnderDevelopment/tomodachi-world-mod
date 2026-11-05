package com.enderdevel.tomodachiworld.client.render;

import com.enderdevel.tomodachiworld.SteveGuideEntity;
import com.enderdevel.tomodachiworld.TomodachiWorld;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class SteveGuideRenderer extends MobEntityRenderer<SteveGuideEntity, PlayerEntityModel<SteveGuideEntity>> {
    private static final Identifier TEXTURE = TomodachiWorld.id("textures/entity/steve_guide.png");

    public SteveGuideRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }

    @Override
    public Identifier getTexture(SteveGuideEntity entity) {
        return TEXTURE;
    }
}

package com.enderdevel.tomodachiworld.client;

import com.enderdevel.tomodachiworld.ModEntities;
import com.enderdevel.tomodachiworld.client.render.BetaZombieRenderer;
import com.enderdevel.tomodachiworld.client.render.SteveGuideRenderer;
import com.enderdevel.tomodachiworld.client.screen.CityNameScreen;
import com.enderdevel.tomodachiworld.screen.CityNameScreenHandler;
import com.enderdevel.tomodachiworld.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.screen.ScreenHandlerType;

public final class TomodachiWorldClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register((ScreenHandlerType<? extends CityNameScreenHandler>) ModScreenHandlers.CITY_NAME,
                CityNameScreen::new);

        EntityRendererRegistry.register(ModEntities.STEVE_GUIDE, SteveGuideRenderer::new);
        EntityRendererRegistry.register(ModEntities.BETA_ZOMBIE, BetaZombieRenderer::new);
    }
}

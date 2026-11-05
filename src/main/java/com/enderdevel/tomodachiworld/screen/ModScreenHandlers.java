package com.enderdevel.tomodachiworld.screen;

import com.enderdevel.tomodachiworld.TomodachiWorld;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public final class ModScreenHandlers {
    public static final ScreenHandlerType<CityNameScreenHandler> CITY_NAME =
            new ScreenHandlerType<>(CityNameScreenHandler::new);

    public static void register() {
        Registry.register(Registry.SCREEN_HANDLER, TomodachiWorld.id("city_name"), CITY_NAME);
    }

    private ModScreenHandlers() {
    }
}

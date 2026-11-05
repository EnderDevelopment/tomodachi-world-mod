package com.enderdevel.tomodachiworld.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class CityNameScreenHandler extends ScreenHandler {
    // Client-side property that holds the entered city name length (mirrored).
    private String cityName = "";
    private int cityNameLength = 0;

    public CityNameScreenHandler(int syncId, PlayerInventory inventory) {
        super(ModScreenHandlers.CITY_NAME, syncId);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }

    public void setCityName(String name) {
        this.cityName = name;
        this.cityNameLength = name.length();
    }

    public String getCityName() {
        return cityName;
    }
}

package com.enderdevel.tomodachiworld.client.screen;

import com.enderdevel.tomodachiworld.TomodachiWorld;
import com.enderdevel.tomodachiworld.screen.CityNameScreenHandler;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CityNameScreen extends HandledScreen<CityNameScreenHandler> {
    private static final Identifier TEXTURE = TomodachiWorld.id("textures/gui/city_name.png");
    private static final int PANEL_WIDTH = 240;
    private static final int PANEL_HEIGHT = 110;

    private TextFieldWidget nameField;

    public CityNameScreen(CityNameScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = PANEL_WIDTH;
        this.backgroundHeight = PANEL_HEIGHT;
    }

    @Override
    protected void init() {
        super.init();
        int fieldX = this.x + 30;
        int fieldY = this.y + 46;
        this.nameField = new TextFieldWidget(this.textRenderer, fieldX, fieldY, PANEL_WIDTH - 60, 20, Text.literal("City name"));
        this.nameField.setMaxLength(24);
        this.nameField.setDrawsBackground(true);
        this.nameField.setEditable(true);
        this.nameField.setFocusUnlocked(true);
        this.nameField.setTextFieldFocused(true);
        this.addSelectableChild(this.nameField);
        this.setInitialFocus(this.nameField);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(TEXTURE, this.x, this.y, 0, 0, this.backgroundWidth, this.backgroundHeight);
        this.nameField.render(context, mouseX, mouseY, delta);
    }

    @Override
    protected void drawForeground(DrawContext context, int mouseX, int mouseY) {
        context.drawCenteredTextWithShadow(this.textRenderer,
                Text.translatable("screen.tomodachiworld.city_name.title"), PANEL_WIDTH / 2, 16, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer,
                Text.translatable("screen.tomodachiworld.city_name.prompt"), PANEL_WIDTH / 2, 80, 0xFFFF55);
    }

    @Override
    protected void close() {
        this.screenHandler.setCityName(this.nameField.getText().trim());
        super.close();
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}

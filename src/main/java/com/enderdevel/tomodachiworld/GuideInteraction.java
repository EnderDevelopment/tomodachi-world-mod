package com.enderdevel.tomodachiworld;

import com.enderdevel.tomodachiworld.screen.CityNameScreenHandler;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

/**
 * Handles right-clicking the Steve guide: shows the intro dialogue and opens
 * the city-name screen. Runs on the server so the screen packet reaches the
 * client correctly in single-player and multiplayer.
 */
public final class GuideInteraction {
    private GuideInteraction() {
    }

    public static void register() {
        UseEntityCallback.EVENT.register(GuideInteraction::onUseEntity);
    }

    private static ActionResult onUseEntity(PlayerEntity player, World world, Hand hand,
                                            Entity entity,
                                            net.minecraft.util.hit.EntityHitResult hitResult) {
        if (world.isClient || hand != Hand.MAIN_HAND || entity.getType() != ModEntities.STEVE_GUIDE) {
            return ActionResult.PASS;
        }
        if (!(player instanceof ServerPlayerEntity serverPlayer)) {
            return ActionResult.PASS;
        }
        // The guide only talks on an empty hand.
        if (!player.getMainHandStack().isEmpty()) {
            player.sendMessage(Text.translatable("dialogue.tomodachiworld.require_empty"), false);
            return ActionResult.SUCCESS;
        }

        player.sendMessage(Text.translatable("dialogue.tomodachiworld.intro_1"), false);
        player.sendMessage(Text.translatable("dialogue.tomodachiworld.intro_2"), false);
        player.sendMessage(Text.translatable("dialogue.tomodachiworld.intro_3"), false);

        serverPlayer.openHandledScreen(new net.minecraft.screen.NamedScreenHandlerFactory() {
            @Override
            public Text getDisplayName() {
                return Text.translatable("screen.tomodachiworld.city_name.title");
            }

            @Override
            public net.minecraft.screen.ScreenHandler createMenu(int syncId, PlayerInventory inventory,
                                                                 PlayerEntity player) {
                return new CityNameScreenHandler(syncId, inventory);
            }
        });
        return ActionResult.SUCCESS;
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.movement;

import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.settings.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.gui.*;
import Bobr.*;
import org.lwjgl.input.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class GuiWalk extends Module
{
    public void onDisable() {
        super.onDisable();
    }
    
    public GuiWalk() {
        super("GuiWalk", Category.MOVEMENT);
        Micotian.instance.settingsManager.rSetting(new Setting("Sneak", this, false));
    }
    
    @SubscribeEvent
    public void onKeyUpdate(final InputUpdateEvent inputUpdateEvent) {
        final boolean valBoolean = Micotian.instance.settingsManager.getSettingByName(this, "Sneak").getValBoolean();
        if (GuiWalk.mc.world != null && GuiWalk.mc.player != null && (GuiWalk.mc.currentScreen instanceof GuiContainer || GuiWalk.mc.currentScreen instanceof GuiIngameMenu || GuiWalk.mc.currentScreen instanceof GuiOptions || GuiWalk.mc.currentScreen instanceof BobrGui)) {
            if (Keyboard.isKeyDown(GuiWalk.mc.gameSettings.keyBindForward.getKeyCode())) {
                final MovementInput movementInput = GuiWalk.mc.player.movementInput;
                movementInput.moveForward = invokedynamic(15:(Lnet/minecraft/util/MovementInput;)F, movementInput) + 1.0f;
                GuiWalk.mc.player.movementInput.forwardKeyDown = true;
            }
            if (Keyboard.isKeyDown(GuiWalk.mc.gameSettings.keyBindBack.getKeyCode())) {
                final MovementInput movementInput2 = GuiWalk.mc.player.movementInput;
                movementInput2.moveForward = invokedynamic(15:(Lnet/minecraft/util/MovementInput;)F, movementInput2) - 1.0f;
                GuiWalk.mc.player.movementInput.backKeyDown = true;
            }
            if (Keyboard.isKeyDown(GuiWalk.mc.gameSettings.keyBindRight.getKeyCode())) {
                final MovementInput movementInput3 = GuiWalk.mc.player.movementInput;
                movementInput3.moveStrafe = invokedynamic(18:(Lnet/minecraft/util/MovementInput;)F, movementInput3) - 1.0f;
                GuiWalk.mc.player.movementInput.rightKeyDown = true;
            }
            if (Keyboard.isKeyDown(GuiWalk.mc.gameSettings.keyBindLeft.getKeyCode())) {
                final MovementInput movementInput4 = GuiWalk.mc.player.movementInput;
                movementInput4.moveStrafe = invokedynamic(18:(Lnet/minecraft/util/MovementInput;)F, movementInput4) + 1.0f;
                GuiWalk.mc.player.movementInput.rightKeyDown = true;
            }
            GuiWalk.mc.player.movementInput.jump = Keyboard.isKeyDown(GuiWalk.mc.gameSettings.keyBindJump.getKeyCode());
            GuiWalk.mc.player.movementInput.sneak = (valBoolean && Keyboard.isKeyDown(GuiWalk.mc.gameSettings.keyBindSneak.getKeyCode()));
            if (invokedynamic(22:(Lnet/minecraft/util/MovementInput;)Z, GuiWalk.mc.player.movementInput)) {
                GuiWalk.mc.player.movementInput.moveStrafe = (float)((double)invokedynamic(18:(Lnet/minecraft/util/MovementInput;)F, GuiWalk.mc.player.movementInput) * 0.3);
                GuiWalk.mc.player.movementInput.moveForward = (float)((double)invokedynamic(15:(Lnet/minecraft/util/MovementInput;)F, GuiWalk.mc.player.movementInput) * 0.3);
            }
        }
    }
    
    public void onEnable() {
        super.onEnable();
    }
}

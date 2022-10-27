//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.movement;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class Sneak extends Module
{
    private static int pop;
    private boolean pope;
    private static boolean snek;
    
    @SubscribeEvent
    public void onPlayerTick(final InputUpdateEvent inputUpdateEvent) {
        if (inputUpdateEvent.getEntityPlayer().isSneaking() && !invokedynamic(4:(Lru/sanchez/micotian/module/movement/Sneak;)Z, this)) {
            // invokedynamic(1:(Lru/sanchez/micotian/module/movement/Sneak;Z)V, this, true)
            toggleop();
        }
        else if (!inputUpdateEvent.getEntityPlayer().isSneaking()) {
        }
        // invokedynamic(1:(Lru/sanchez/micotian/module/movement/Sneak;Z)V, this, false)
        inputUpdateEvent.getMovementInput().sneak = invokedynamic(7:()Z);
        if (invokedynamic(7:()Z)) {
            inputUpdateEvent.getMovementInput().moveForward = invokedynamic(8:(Lnet/minecraft/util/MovementInput;)F, inputUpdateEvent.getMovementInput()) / 1.8f;
            inputUpdateEvent.getMovementInput().moveStrafe = invokedynamic(9:(Lnet/minecraft/util/MovementInput;)F, inputUpdateEvent.getMovementInput()) / 1.8f;
        }
    }
    // invokedynamic(10:(I)V, false)
    
    private static void toggleop() {
        if (invokedynamic(11:()I) == 0) {
        }
        // invokedynamic(12:(Z)V, !invokedynamic(7:()Z))
        // invokedynamic(10:(I)V, invokedynamic(11:()I) + 1)
    }
    
    public Sneak() {
        super("Sneak", Category.MOVEMENT);
    }
    // invokedynamic(1:(Lru/sanchez/micotian/module/movement/Sneak;Z)V, this, false)
}

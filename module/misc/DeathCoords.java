//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import net.minecraftforge.fml.common.gameevent.*;
import ru.sanchez.micotian.utils.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class DeathCoords extends Module
{
    public static int deley;
    
    @Override
    public void onDisable() {
        super.onDisable();
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (DeathCoords.mc.player.getHealth() < 0.0f || invokedynamic(3:(Lnet/minecraft/client/entity/EntityPlayerSP;)Z, DeathCoords.mc.player) || !DeathCoords.mc.player.isEntityAlive()) {
            // invokedynamic(6:(I)V, invokedynamic(5:()I) + 1)
            if (invokedynamic(5:()I) == 0) {
                Command.sendClientSideMessage(" DeathCoords! X:" + (int)invokedynamic(8:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, DeathCoords.mc.player) + " Y:" + (int)invokedynamic(10:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, DeathCoords.mc.player) + " Z:" + (int)invokedynamic(11:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, DeathCoords.mc.player));
            }
            if (invokedynamic(5:()I) >= 10) {
            }
            // invokedynamic(6:(I)V, -1)
        }
    }
    
    public DeathCoords() {
        super("DeathCoords", Category.OUTHER);
    }
}

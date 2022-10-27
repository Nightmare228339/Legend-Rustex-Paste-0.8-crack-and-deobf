//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import ru.sanchez.micotian.module.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class NoHurtCum extends Module
{
    public NoHurtCum() {
        super("NoHurtCum", Category.RENDER);
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        NoHurtCum.mc.player.hurtTime = 0;
        NoHurtCum.mc.player.hurtResistantTime = 0;
        NoHurtCum.mc.player.maxHurtResistantTime = 0;
        NoHurtCum.mc.player.maxHurtTime = 0;
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import ru.sanchez.micotian.module.*;
import net.minecraft.client.gui.*;
import ru.sanchez.micotian.*;
import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class SelfDestruct extends Module
{
    public static boolean self;
    
    public SelfDestruct() {
        super("SelfDestruct", Category.OUTHER);
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
        SelfDestruct.mc.displayGuiScreen((GuiScreen)null);
        final Micotian instance = Micotian.instance;
        final Iterator<Module> iterator = Micotian.moduleManager.getModuleList().iterator();
        if (iterator.hasNext()) {
            if (iterator.next().getName() != "SelfDestruct") {}
            return;
        }
        // invokedynamic(10:(Z)V, true)
        SelfDestruct.mc.player.rotationYaw = 0.0f;
        SelfDestruct.mc.player.rotationPitch = 0.0f;
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent playerTickEvent) {
    }
}

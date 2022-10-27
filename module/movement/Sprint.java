//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.movement;

import net.minecraft.client.settings.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class Sprint extends Module
{
    public void onDisable() {
        super.onDisable();
        KeyBinding.setKeyBindState(Sprint.mc.gameSettings.keyBindSprint.getKeyCode(), false);
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        KeyBinding.setKeyBindState(Sprint.mc.gameSettings.keyBindSprint.getKeyCode(), true);
    }
    
    public Sprint() {
        super("Sprint", Category.MOVEMENT);
    }
}

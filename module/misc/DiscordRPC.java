//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import ru.sanchez.micotian.miscs.*;
import ru.sanchez.micotian.utils.*;
import ru.sanchez.micotian.module.*;

public class DiscordRPC extends Module
{
    @Override
    public void onEnable() {
        super.onEnable();
        try {
            Discord.startRPC();
        }
        catch (UnsatisfiedLinkError | NoClassDefFoundError unsatisfiedLinkError) {
            ChatUtils.sendMessage("Error: not found discord-rps.dll in natives");
            this.onDisableR();
        }
    }
    
    public DiscordRPC() {
        super("DiscordRPC", Category.OUTHER);
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        try {
            Discord.stopRPC();
        }
        catch (NoClassDefFoundError noClassDefFoundError) {}
    }
}

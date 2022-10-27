//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.util;

import net.minecraft.client.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.util.text.*;

public abstract class Command
{
    public static String prefix;
    public static final Minecraft mc;
    
    public abstract void onClientCommand(final String p0, final String[] p1) throws Exception;
    
    public static void sendClientSideMessage(final String str) {
        if (Command.mc.player == null || Command.mc.world == null) {
            return;
        }
        Command.mc.player.sendMessage((ITextComponent)new TextComponentString(ChatFormatting.DARK_RED + "[Micotian] " + ChatFormatting.WHITE + str));
    }
    
    public abstract String[] getClientAlias();
    
    public static String getClientPrefix() {
        return Command.prefix;
    }
    
    public static void setClientPrefix(final String prefix) {
        Command.prefix = prefix;
    }
    
    static {
        mc = Minecraft.getMinecraft();
        Command.prefix = ".";
    }
    
    public abstract String getClientSyntax();
}

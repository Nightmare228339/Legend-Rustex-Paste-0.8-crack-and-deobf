//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.client.*;
import net.minecraft.util.text.*;

public class ChatUtils
{
    private static final String prefix;
    
    static {
        prefix = TextFormatting.GRAY + "[" + TextFormatting.RED + "Legend" + TextFormatting.GRAY + "]: " + TextFormatting.WHITE;
    }
    
    public static void sendMessage(final String str) {
        Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString(ChatUtils.prefix + str));
    }
    
    public static void say(final String s) {
        Minecraft.getMinecraft().player.sendChatMessage(s);
    }
}

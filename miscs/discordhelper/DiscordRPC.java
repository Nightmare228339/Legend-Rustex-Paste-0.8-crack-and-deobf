//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.miscs.discordhelper;

import javax.annotation.*;
import com.sun.jna.*;

public interface DiscordRPC extends Library
{
    public static final int DISCORD_REPLY_IGNORE = 2;
    public static final int DISCORD_REPLY_NO = 0;
    public static final DiscordRPC INSTANCE = (DiscordRPC)Native.loadLibrary("discord-rpc", (Class)DiscordRPC.class);
    public static final int DISCORD_REPLY_YES = 1;
    
    void Discord_Shutdown();
    
    void Discord_RunCallbacks();
    
    void Discord_ClearPresence();
    
    void Discord_UpdatePresence(@Nullable final DiscordRichPresence p0);
    
    void Discord_UpdateConnection();
    
    void Discord_Initialize(@Nonnull final String p0, @Nullable final DiscordEventHandlers p1, final boolean p2, @Nullable final String p3);
    
    void Discord_Register(final String p0, final String p1);
    
    void Discord_Respond(@Nonnull final String p0, final int p1);
    
    void Discord_RegisterSteamGame(final String p0, final String p1);
    
    void Discord_UpdateHandlers(@Nullable final DiscordEventHandlers p0);
}

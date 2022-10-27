//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.miscs;

import ru.sanchez.micotian.miscs.discordhelper.*;

public class Discord
{
    public static DiscordRichPresence discordRichP;
    public static DiscordRPC discordRPC;
    public static String discordID;
    
    static {
        Discord.discordID = "959374005134065717";
        Discord.discordRichP = new DiscordRichPresence();
        Discord.discordRPC = DiscordRPC.INSTANCE;
    }
    
    public static void startRPC() {
        final DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers();
        discordEventHandlers.disconnected = Discord::lambda$startRPC$0;
        Discord.discordRPC.Discord_Initialize(Discord.discordID, discordEventHandlers, true, null);
        // invokedynamic(6:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;J)V, Discord.discordRichP, System.currentTimeMillis() / 1000L)
        Discord.discordRichP.details = "bySanchez";
        Discord.discordRichP.largeImageKey = "1024lcc";
        Discord.discordRichP.largeImageText = "Legend";
        Discord.discordRichP.state = null;
        Discord.discordRPC.Discord_UpdatePresence(Discord.discordRichP);
    }
    
    public static void stopRPC() {
        Discord.discordRPC.Discord_Shutdown();
        Discord.discordRPC.Discord_ClearPresence();
    }
    
    private static void lambda$startRPC$0(final int i, final String str) {
        System.out.println("Discord RPC disconnected, var1:" + i + ", var2: " + str);
    }
}

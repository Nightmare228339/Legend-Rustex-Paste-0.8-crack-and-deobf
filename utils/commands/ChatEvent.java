//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.commands;

import java.util.*;
import net.minecraft.client.*;
import net.minecraftforge.client.event.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.utils.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ChatEvent
{
    public static HashSet Player;
    private static Minecraft mc;
    
    @SubscribeEvent
    public void ChatEvent(final ClientChatEvent clientChatEvent) {
        clientChatEvent.getMessage();
        final String lowerCase = clientChatEvent.getMessage().toLowerCase();
        if (lowerCase.startsWith("/aim")) {
            try {
                Micotian.instance.settingsManager.getSettingByName(Micotian.moduleManager.getModule("AimBot"), "Predict").setValDouble((double)Float.parseFloat(lowerCase.split(" ")[1]));
            }
            catch (Throwable t) {
                ChatUtils.sendMessage("Error");
            }
            clientChatEvent.setMessage("");
        }
        else if (lowerCase.startsWith("/vaim")) {
            try {
                Micotian.instance.settingsManager.getSettingByName(Micotian.moduleManager.getModule("AimBot"), "VPredict").setValDouble((double)Float.parseFloat(lowerCase.split(" ")[1]));
            }
            catch (Throwable t2) {
                ChatUtils.sendMessage("Error");
            }
            clientChatEvent.setMessage("");
        }
        else if (lowerCase.startsWith("/range")) {
            try {
                Micotian.instance.settingsManager.getSettingByName(Micotian.moduleManager.getModule("AimBot"), "Range").setValDouble((double)Float.parseFloat(lowerCase.split(" ")[1]));
            }
            catch (Throwable t3) {
                ChatUtils.sendMessage("Error");
            }
            clientChatEvent.setMessage("");
        }
        else if (lowerCase.startsWith("/unmute")) {
            ChatEvent.mc.player.connection.sendPacket((Packet)new CPacketChatMessage("/m " + ChatEvent.mc.player.getName() + " \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0430"));
            clientChatEvent.setMessage("");
        }
    }
    
    static {
        ChatEvent.Player = new HashSet();
        ChatEvent.mc = Minecraft.getMinecraft();
    }
}

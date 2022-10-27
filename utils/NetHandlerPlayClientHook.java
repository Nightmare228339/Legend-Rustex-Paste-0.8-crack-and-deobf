//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.client.network.*;
import net.minecraft.util.text.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import com.mojang.authlib.*;
import net.minecraft.network.*;
import ru.sanchez.micotian.notifications.*;

public class NetHandlerPlayClientHook extends NetHandlerPlayClient
{
    public void onDisconnect(final ITextComponent textComponent) {
        super.onDisconnect(textComponent);
    }
    
    public NetHandlerPlayClientHook(final Minecraft minecraft, final GuiScreen guiScreen, final NetworkManager networkManager, final GameProfile gameProfile) {
        super(minecraft, guiScreen, networkManager, gameProfile);
    }
    
    public void sendPacket(final Packet packet) {
        notifications.add("rotation", "work", Type.OK);
        super.sendPacket(packet);
    }
}

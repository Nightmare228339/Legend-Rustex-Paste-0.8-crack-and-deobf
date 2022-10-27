//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.util;

import net.minecraft.client.settings.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.*;
import net.minecraft.network.*;
import net.minecraft.client.entity.*;

public class Wrapper
{
    public static volatile Wrapper INSTANCE;
    
    public PlayerControllerMP controller() {
        return Wrapper.INSTANCE.mc().playerController;
    }
    
    public GameSettings mcSettings() {
        return Wrapper.INSTANCE.mc().gameSettings;
    }
    
    public InventoryPlayer inventory() {
        return this.player().inventory;
    }
    
    public FontRenderer getFontRenderer() {
        return Wrapper.INSTANCE.getMinecraft().fontRenderer;
    }
    
    public WorldClient getWorld() {
        return Wrapper.INSTANCE.getMinecraft().world;
    }
    
    public Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }
    
    public GameSettings getGameSettings() {
        return Wrapper.INSTANCE.getMinecraft().gameSettings;
    }
    
    public void sendPacket(final Packet packet) {
        this.player().connection.sendPacket(packet);
    }
    
    static {
        Wrapper.INSTANCE = new Wrapper();
    }
    
    public WorldClient world() {
        return Wrapper.INSTANCE.mc().world;
    }
    
    public FontRenderer fontRenderer() {
        return Wrapper.INSTANCE.mc().fontRenderer;
    }
    
    public EntityPlayerSP player() {
        return Wrapper.INSTANCE.mc().player;
    }
    
    public EntityPlayerSP getLocalPlayer() {
        return Wrapper.INSTANCE.getMinecraft().player;
    }
    
    public Minecraft mc() {
        return Minecraft.getMinecraft();
    }
}

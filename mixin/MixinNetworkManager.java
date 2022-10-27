//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.mixin;

import org.spongepowered.asm.mixin.*;
import io.netty.channel.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.spongepowered.asm.mixin.injection.*;
import ru.sanchez.micotian.events.*;
import net.minecraft.client.*;
import net.minecraftforge.fml.common.network.internal.*;
import net.minecraft.network.play.client.*;
import io.netty.buffer.*;
import net.minecraft.network.*;
import java.lang.reflect.*;

@Mixin({ NetworkManager.class })
public abstract class MixinNetworkManager
{
    @Inject(method = { "channelRead0" }, at = { @At("HEAD") }, cancellable = true)
    protected void onchannelRead0(final ChannelHandlerContext channelHandlerContext, final Packet packet, final CallbackInfo callbackInfo) throws Exception {
        final ReceivePacketEvent receivePacketEvent = new ReceivePacketEvent(packet);
        MinecraftForge.EVENT_BUS.post((Event)receivePacketEvent);
        if (receivePacketEvent.isCanceled()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "sendPacket" }, at = { @At("HEAD") }, cancellable = true)
    public void onsendPacket(final Packet packet, final CallbackInfo callbackInfo) {
        final SendPacketEvent sendPacketEvent = new SendPacketEvent(packet);
        MinecraftForge.EVENT_BUS.post((Event)sendPacketEvent);
        if (sendPacketEvent.isCanceled()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "sendPacket" }, at = { @At("HEAD") }, cancellable = true)
    public void sendPacket(final Packet packet, final CallbackInfo callbackInfo) {
        if (Minecraft.getMinecraft().isIntegratedServerRunning()) {
            return;
        }
        if (packet instanceof FMLProxyPacket) {
            callbackInfo.cancel();
            return;
        }
        if (packet instanceof CPacketCustomPayload) {
            final CPacketCustomPayload cPacketCustomPayload = (CPacketCustomPayload)packet;
            final String getChannelName = cPacketCustomPayload.getChannelName();
            if (!getChannelName.startsWith("MC|")) {
                callbackInfo.cancel();
            }
            else if (getChannelName.equalsIgnoreCase("MC|Brand")) {
                final PacketBuffer writeString = new PacketBuffer(Unpooled.buffer()).writeString("vanilla");
                try {
                    final Field declaredField = cPacketCustomPayload.getClass().getDeclaredField("data");
                    declaredField.setAccessible(true);
                    declaredField.set(cPacketCustomPayload, writeString);
                }
                catch (NoSuchFieldException ex2) {
                    try {
                        final Field declaredField2 = cPacketCustomPayload.getClass().getDeclaredField("data");
                        declaredField2.setAccessible(true);
                        declaredField2.set(cPacketCustomPayload, writeString);
                    }
                    catch (NoSuchFieldException | IllegalAccessException ex3) {
                        final Throwable t;
                        t.printStackTrace();
                    }
                }
                catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

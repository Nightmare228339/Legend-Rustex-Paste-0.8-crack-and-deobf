//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.mixin;

import net.minecraft.network.handshake.client.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.network.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import java.io.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ C00Handshake.class })
public class MixinC00Handshake
{
    @Shadow
    private EnumConnectionState requestedState;
    @Shadow
    private int protocolVersion;
    @Shadow
    private String ip;
    @Shadow
    private int port;
    
    @Inject(method = { "writePacketData" }, at = { @At("HEAD") }, cancellable = true)
    public void onWritePacketData(final PacketBuffer packetBuffer, final CallbackInfo callbackInfo) throws IOException {
        packetBuffer.writeVarInt(this.protocolVersion);
        packetBuffer.writeString(this.ip);
        packetBuffer.writeShort(this.port);
        packetBuffer.writeVarInt(this.requestedState.getId());
        callbackInfo.cancel();
    }
}

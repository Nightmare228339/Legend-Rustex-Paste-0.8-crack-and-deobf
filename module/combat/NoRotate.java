//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.combat;

import ru.sanchez.micotian.events.*;
import net.minecraft.network.play.server.*;
import ru.sanchez.micotian.utils.mixinInterphase.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class NoRotate extends Module
{
    @SubscribeEvent
    public void onReceivePacket(final ReceivePacketEvent receivePacketEvent) {
        if (receivePacketEvent.getPacket() instanceof SPacketPlayerPosLook) {
            if (NoRotate.mc.world == null) {
                return;
            }
            final SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)receivePacketEvent.getPacket();
            final IMixinSPacketPlayerPosLook mixinSPacketPlayerPosLook = (IMixinSPacketPlayerPosLook)sPacketPlayerPosLook;
            if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.X_ROT)) {
                mixinSPacketPlayerPosLook.setPitch(0.0f);
            }
            if (sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.Y_ROT)) {
                mixinSPacketPlayerPosLook.setYaw(0.0f);
            }
            if (!sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.X_ROT) || !sPacketPlayerPosLook.getFlags().contains(SPacketPlayerPosLook.EnumFlags.Y_ROT)) {
                mixinSPacketPlayerPosLook.setPitch(invokedynamic(11:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, NoRotate.mc.player));
                mixinSPacketPlayerPosLook.setYaw(invokedynamic(12:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, NoRotate.mc.player));
            }
        }
    }
    
    public NoRotate() {
        super("NoRotate", Category.COMBAT);
    }
}

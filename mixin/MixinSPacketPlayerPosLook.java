//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.mixin;

import ru.sanchez.micotian.utils.mixinInterphase.*;
import net.minecraft.network.play.server.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ SPacketPlayerPosLook.class })
public class MixinSPacketPlayerPosLook implements IMixinSPacketPlayerPosLook
{
    @Shadow
    private double y;
    @Shadow
    private double z;
    @Shadow
    private double x;
    @Shadow
    private float yaw;
    @Shadow
    private float pitch;
    
    @Override
    public void setZ(final double z) {
        this.z = z;
    }
    
    @Override
    public void setYaw(final float yaw) {
        this.yaw = yaw;
    }
    
    @Override
    public void setPitch(final float pitch) {
        this.pitch = pitch;
    }
    
    @Override
    public void setY(final double y) {
        this.y = y;
    }
    
    @Override
    public void setX(final double x) {
        this.x = x;
    }
}

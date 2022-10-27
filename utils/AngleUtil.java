//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.util.math.*;

public class AngleUtil implements Wrapper
{
    public static Vec3d getVectorForRotation(final Rotation rotation) {
        final float cos = MathHelper.cos(-rotation.getYaw() * 0.017453292f - 3.1415927f);
        final float sin = MathHelper.sin(-rotation.getYaw() * 0.017453292f - 3.1415927f);
        final float n = -MathHelper.cos(-rotation.getPitch() * 0.017453292f);
        return new Vec3d((double)(sin * n), (double)MathHelper.sin(-rotation.getPitch() * 0.017453292f), (double)(cos * n));
    }
    
    public static Rotation calculateAngles(final Vec3d vec3d) {
        return new Rotation(MathHelper.wrapDegrees((float)(Math.toDegrees(Math.atan2(invokedynamic(4:(Lnet/minecraft/util/math/Vec3d;)D, vec3d.subtract(AngleUtil.mc.player.getPositionEyes(1.0f))), invokedynamic(5:(Lnet/minecraft/util/math/Vec3d;)D, vec3d.subtract(AngleUtil.mc.player.getPositionEyes(1.0f))))) - 90.0)), MathHelper.wrapDegrees((float)Math.toDegrees(-Math.atan2(invokedynamic(8:(Lnet/minecraft/util/math/Vec3d;)D, vec3d.subtract(AngleUtil.mc.player.getPositionEyes(1.0f))), Math.hypot(invokedynamic(5:(Lnet/minecraft/util/math/Vec3d;)D, vec3d.subtract(AngleUtil.mc.player.getPositionEyes(1.0f))), invokedynamic(4:(Lnet/minecraft/util/math/Vec3d;)D, vec3d.subtract(AngleUtil.mc.player.getPositionEyes(1.0f))))))));
    }
}

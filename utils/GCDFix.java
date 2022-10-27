//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.client.*;

public class GCDFix
{
    static Minecraft mc;
    private float pitch;
    private float yaw;
    
    public static float getGCD() {
        final float n;
        return (n = (float)((double)invokedynamic(7:(Lnet/minecraft/client/settings/GameSettings;)F, GCDFix.mc.gameSettings) * 0.6 + 0.2)) * n * n * 8.0f;
    }
    
    public static float getDeltaMouse(final float n) {
        return (float)Math.round(n / getGCDValue());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof GCDFix) {
            final GCDFix gcdFix = (GCDFix)o;
            return Float.compare(invokedynamic(9:(Lru/sanchez/micotian/utils/GCDFix;)F, this), invokedynamic(9:(Lru/sanchez/micotian/utils/GCDFix;)F, gcdFix)) == 0 && Float.compare(invokedynamic(10:(Lru/sanchez/micotian/utils/GCDFix;)F, this), invokedynamic(10:(Lru/sanchez/micotian/utils/GCDFix;)F, gcdFix)) == 0;
        }
        return false;
    }
    
    static {
        GCDFix.mc = Minecraft.getMinecraft();
    }
    
    public final float getYaw() {
        return invokedynamic(9:(Lru/sanchez/micotian/utils/GCDFix;)F, this);
    }
    
    @Override
    public int hashCode() {
        return Float.hashCode(invokedynamic(9:(Lru/sanchez/micotian/utils/GCDFix;)F, this)) * 31 + Float.hashCode(invokedynamic(10:(Lru/sanchez/micotian/utils/GCDFix;)F, this));
    }
    
    public static float getGCDValue() {
        return (float)(getGCD() * 0.15);
    }
    
    public static float getFixedRotation(final float n) {
        return getDeltaMouse(n) * getGCDValue();
    }
    
    public final void setYaw(final float n) {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/GCDFix;F)V, this, n)
    
    public final void setPitch(final float n) {
    }
    // invokedynamic(1:(Lru/sanchez/micotian/utils/GCDFix;F)V, this, n)
    
    public GCDFix(final float n, final float n2) {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/GCDFix;F)V, this, n)
    // invokedynamic(1:(Lru/sanchez/micotian/utils/GCDFix;F)V, this, n2)
    
    public final float getPitch() {
        return invokedynamic(10:(Lru/sanchez/micotian/utils/GCDFix;)F, this);
    }
    
    @Override
    public String toString() {
        return "Rotation(yaw=" + invokedynamic(9:(Lru/sanchez/micotian/utils/GCDFix;)F, this) + ", pitch=" + invokedynamic(10:(Lru/sanchez/micotian/utils/GCDFix;)F, this) + ")";
    }
}

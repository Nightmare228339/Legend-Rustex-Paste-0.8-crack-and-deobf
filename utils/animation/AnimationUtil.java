//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.animation;

import net.minecraft.client.*;

public class AnimationUtil
{
    public static float speedTarget;
    private static Class[] lIIIIlIlIIl;
    
    public static double animate(final double n, double n2, double n3) {
        int n4 = 0;
        if (n <= n2) {
            n4 = 0;
        }
        final int n5 = n4;
        if (n3 < 0.0) {
            n3 = 0.0;
        }
        else if (n3 > 1.0) {
            n3 = 1.0;
        }
        double n6 = (Math.max(n, n2) - Math.min(n, n2)) * n3;
        if (n6 < 0.1) {
            n6 = 0.1;
        }
        n2 = (n2 = ((n5 != 0) ? (n2 + n6) : (n2 - n6)));
        return n2;
    }
    
    public static float animation(final float n, final float n2, final float n3, final float a) {
        float n4 = (n2 - n) / Math.max((float)Minecraft.getDebugFPS(), 5.0f) * 15.0f;
        if (n4 > 0.0f) {
            n4 = Math.min(n2 - n, Math.max(a, n4));
        }
        else if (n4 < 0.0f) {
            n4 = Math.max(n2 - n, Math.min(-a, n4));
        }
        return n + n4;
    }
    
    public static float animation(final float n, final float n2, final float n3) {
        return animation(n, n2, invokedynamic(0:()F), n3);
    }
}

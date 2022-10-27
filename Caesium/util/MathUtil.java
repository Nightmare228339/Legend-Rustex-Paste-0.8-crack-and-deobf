//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.util;

import java.math.*;

public class MathUtil
{
    public static double round(final double val, final int newScale) {
        return new BigDecimal(val).setScale(newScale, RoundingMode.HALF_EVEN).doubleValue();
    }
    
    public static float round(final float n, final int newScale) {
        return new BigDecimal(n).setScale(newScale, RoundingMode.HALF_EVEN).floatValue();
    }
}

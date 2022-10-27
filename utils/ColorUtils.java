//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import java.awt.*;
import net.minecraft.entity.*;
import java.text.*;
import java.util.*;

public class ColorUtils
{
    public static int getColor(final int n, final int n2, final int n3, final int n4) {
        return 0x0 | n4 << 24 | n << 16 | n2 << 8 | n3;
    }
    
    public static int reAlpha(final int rgb, final float a) {
        final Color color = new Color(rgb);
        return new Color(0.003921569f * color.getRed(), 0.003921569f * color.getGreen(), 0.003921569f * color.getBlue(), a).getRGB();
    }
    
    public static Color Yellowastolfo1(final int n, final float n2) {
        final float n3 = 2900.0f;
        final float n4 = System.currentTimeMillis() % (int)n3 + (n - n2) * 9.0f;
        if (n4 > n3) {
            return null;
        }
        float n5;
        if ((n5 = n4 / n3) > 0.6) {
            n5 = 0.6f - (n5 - 0.6f);
        }
        return new Color(n5 + 0.6f, 0.5f, 1.0f);
    }
    
    public static Color fade(final Color color, final int n, final int n2) {
        final float[] hsbvals = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsbvals);
        hsbvals[2] = (0.5f + 0.5f * Math.abs((System.currentTimeMillis() % 2000L / 1000.0f + n / (float)n2 * 2.0f) % 2.0f - 1.0f)) % 2.0f;
        return new Color(Color.HSBtoRGB(hsbvals[0], hsbvals[1], hsbvals[2]));
    }
    
    public static int rainbowNew(final int n, final float s, final float b) {
        return Color.getHSBColor((float)(Math.ceil((double)((System.currentTimeMillis() + n) / 16L)) % 360.0 / 360.0), s, b).getRGB();
    }
    
    public static int Yellowastolfo(final int n, final float n2) {
        final float n3 = 2900.0f;
        final float n4 = System.currentTimeMillis() % (int)n3 + (-n - n2) * 9.0f;
        if (n4 > n3) {
            return 0;
        }
        float n5;
        if ((n5 = n4 / n3) > 0.6) {
            n5 = 0.6f - (n5 - 0.6f);
        }
        return Color.HSBtoRGB(n5 + 0.6f, 0.5f, 1.0f);
    }
    
    public static int getColor(final int n, final int n2, final int n3) {
        return getColor(n, n2, n3, 255);
    }
    
    public static int getColor1(final int n) {
        return getColor(n, n, n, 255);
    }
    
    public static Color blendColors(final float[] array, final Color[] array2, final float n) {
        if (array == null) {
            throw new IllegalArgumentException("Fractions can't be null");
        }
        if (array2 == null) {
            throw new IllegalArgumentException("Colours can't be null");
        }
        if (array.length != array2.length) {
            throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
        }
        final int[] fractionIndicies = getFractionIndicies(array, n);
        final float[] array3 = { array[fractionIndicies[0]], array[fractionIndicies[1]] };
        final Color[] array4 = { array2[fractionIndicies[0]], array2[fractionIndicies[1]] };
        return blend(array4[0], array4[1], 1.0f - (n - array3[0]) / (array3[1] - array3[0]));
    }
    
    public static Color getColorWithOpacity(final Color color, final int a) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
    }
    
    public static Color getGradientOffset(final Color color, final Color color2, double n) {
        if (n > 1.0) {
            final double n2 = n % 1.0;
            n = (((int)n % 2 == 0) ? n2 : (1.0 - n2));
        }
        final double n3 = 1.0 - n;
        return new Color((int)(color.getRed() * n3 + color2.getRed() * n), (int)(color.getGreen() * n3 + color2.getGreen() * n), (int)(color.getBlue() * n3 + color2.getBlue() * n));
    }
    
    public static int rainbow(final int n, final long n2) {
        return Color.getHSBColor((float)(Math.ceil((double)(System.currentTimeMillis() + n2 + n)) / 15.0 % 360.0 / 360.0), 0.4f, 1.0f).getRGB();
    }
    
    public static Color astolfoColors1(final int n, final int n2) {
        final float n3 = 2900.0f;
        final float n4 = System.currentTimeMillis() % (int)n3 + (float)((n2 - n) * 9);
        if (n4 > n3) {
            return null;
        }
        float n5;
        if ((n5 = n4 / n3) > 0.5) {
            n5 = 0.5f - (n5 - 0.5f);
        }
        return new Color(n5 + 0.5f, 0.5f, 1.0f);
    }
    
    public static int getTeamColor(final Entity entity) {
        return Integer.valueOf(("\u043f\u0457\u0405f[\u043f\u0457\u0405cR\u043f\u0457\u0405f]\u043f\u0457\u0405c" + entity.getName()).toUpperCase().hashCode()).equals(entity.getDisplayName().getUnformattedText().toUpperCase().hashCode()) ? getColor(new Color(255, 60, 60)) : (Integer.valueOf(("\u043f\u0457\u0405f[\u043f\u0457\u04059B\u043f\u0457\u0405f]\u043f\u0457\u04059" + entity.getName()).toUpperCase().hashCode()).equals(entity.getDisplayName().getUnformattedText().toUpperCase().hashCode()) ? getColor(new Color(60, 60, 255)) : (Integer.valueOf(("\u043f\u0457\u0405f[\u043f\u0457\u0405eY\u043f\u0457\u0405f]\u043f\u0457\u0405e" + entity.getName()).toUpperCase().hashCode()).equals(entity.getDisplayName().getUnformattedText().toUpperCase().hashCode()) ? getColor(new Color(255, 255, 60)) : (Integer.valueOf(("\u043f\u0457\u0405f[\u043f\u0457\u0405aG\u043f\u0457\u0405f]\u043f\u0457\u0405a" + entity.getName()).toUpperCase().hashCode()).equals(entity.getDisplayName().getUnformattedText().toUpperCase().hashCode()) ? getColor(new Color(60, 255, 60)) : getColor(new Color(255, 255, 255)))));
    }
    
    public static Color rainbowCol(final int n, final float s, final float b) {
        return Color.getHSBColor((float)(Math.ceil((double)((System.currentTimeMillis() + n) / 16L)) % 360.0 / 360.0), s, b);
    }
    
    public static Color getHealthColor(final EntityLivingBase entityLivingBase) {
        final float getHealth = entityLivingBase.getHealth();
        final float[] array = { 0.0f, 0.15f, 0.55f, 0.7f, 0.9f };
        final Color[] array2 = { new Color(133, 0, 0), Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN };
        final float n = getHealth / entityLivingBase.getMaxHealth();
        return (getHealth >= 0.0f) ? blendColors(array, array2, n).brighter() : array2[0];
    }
    
    public static Color fade(final Color color) {
        return fade(color, 2, 100);
    }
    
    public static Color TwoColoreffect(final Color color, final Color color2, final double n) {
        final float clamp = MathUtils.clamp((float)Math.sin(18.84955592153876 * (n / 4.0 % 1.0)) / 2.0f + 0.5f, 0.0f, 1.0f);
        return new Color(MathUtils.lerp(color.getRed() / 255.0f, color2.getRed() / 255.0f, clamp), MathUtils.lerp(color.getGreen() / 255.0f, color2.getGreen() / 255.0f, clamp), MathUtils.lerp(color.getBlue() / 255.0f, color2.getBlue() / 255.0f, clamp));
    }
    
    public static int[] getFractionIndicies(final float[] array, final float n) {
        final int[] array2 = new int[2];
        int n2 = 0;
        if (n2 < array.length && array[n2] <= n) {
            ++n2;
            return null;
        }
        if (n2 >= array.length) {
            n2 = array.length - 1;
        }
        array2[0] = n2 - 1;
        array2[1] = n2;
        return array2;
    }
    
    public static int astolfoColors(final int n, final int n2) {
        final float n3 = 2900.0f;
        final float n4 = System.currentTimeMillis() % (int)n3 + (float)((n2 - n) * 9);
        if (n4 > n3) {
            return 0;
        }
        float n5;
        if ((n5 = n4 / n3) > 0.5) {
            n5 = 0.5f - (n5 - 0.5f);
        }
        return Color.HSBtoRGB(n5 + 0.5f, 0.5f, 1.0f);
    }
    
    public static int astolfo(final int n, final float n2) {
        final float n3 = 3000.0f;
        final float abs = Math.abs(System.currentTimeMillis() % n + -n2 / 21.0f * 2.0f);
        if (abs > n3) {
            return 0;
        }
        float n4;
        if ((n4 = abs / n3) > 0.5) {
            n4 = 0.5f - (n4 - 0.5f);
        }
        return Color.HSBtoRGB(n4 + 0.5f, 0.5f, 1.0f);
    }
    
    public static int color(final int r, final int g, final int b, int a) {
        a = 255;
        return new Color(r, g, b, a).getRGB();
    }
    
    public static int getColor(final Color color) {
        return getColor(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    public static Color blend(final Color color, final Color color2, final double n) {
        final float n2 = (float)n;
        final float n3 = 1.0f - n2;
        final float[] compArray = new float[3];
        final float[] compArray2 = new float[3];
        color.getColorComponents(compArray);
        color2.getColorComponents(compArray2);
        float r = compArray[0] * n2 + compArray2[0] * n3;
        float g = compArray[1] * n2 + compArray2[1] * n3;
        float b = compArray[2] * n2 + compArray2[2] * n3;
        if (r < 0.0f) {
            r = 0.0f;
        }
        else if (r > 255.0f) {
            r = 255.0f;
        }
        if (g < 0.0f) {
            g = 0.0f;
        }
        else if (g > 255.0f) {
            g = 255.0f;
        }
        if (b < 0.0f) {
            b = 0.0f;
        }
        else if (b > 255.0f) {
            b = 255.0f;
        }
        Color color3 = null;
        try {
            color3 = new Color(r, g, b);
        }
        catch (IllegalArgumentException ex) {
            NumberFormat.getNumberInstance();
        }
        return color3;
    }
    
    public static int getRandomColor() {
        final char[] charArray = "012345678".toCharArray();
        final String s = "0x";
        int n = 0;
        if (n < 6) {
            new StringBuilder().append(s).append(charArray[new Random().nextInt(charArray.length)]).toString();
            ++n;
            return 0;
        }
        return Integer.decode(s);
    }
    
    public static int getColor(final int n, final int n2) {
        return getColor(n, n, n, n2);
    }
}

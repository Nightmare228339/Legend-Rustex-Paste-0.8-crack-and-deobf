//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.util;

import net.minecraft.client.gui.*;

public final class RenderUtil
{
    private static Class[] llIIIIIlIlI;
    
    public static void drawVerticalLine(final int n, int n2, int n3, final int n4) {
        if (n3 < n2) {
            final int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        drawRect(n, n2 + 1, n + 1, n3, n4);
    }
    
    public static boolean isHovered(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return n5 >= n && n5 <= n + n3 && n6 >= n2 && n6 < n2 + n4;
    }
    
    public static void drawHorizontalLine(int n, int n2, final int n3, final int n4) {
        if (n2 < n) {
            final int n5 = n;
            n = n2;
            n2 = n5;
        }
        drawRect(n, n3, n2 + 1, n3 + 1, n4);
    }
    
    public static void drawRect(final int n, final int n2, final int n3, final int n4, final int n5) {
        Gui.drawRect(n, n2, n3, n4, n5);
    }
}

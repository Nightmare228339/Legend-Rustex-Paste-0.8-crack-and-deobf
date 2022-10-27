//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Castom.setting;

import org.lwjgl.opengl.*;
import net.minecraft.util.*;
import java.awt.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;

public final class RenderHelper
{
    private static Class[] lIIlIlIlIll;
    
    public static void enableGL2D() {
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glDepthMask(true);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glHint(3155, 4354);
    }
    
    public static void customScaledObject2D(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        GL11.glTranslated((double)(n3 / 2.0f), (double)(n4 / 2.0f), 1.0);
        GL11.glTranslated((double)(-n * n5 + n + n3 / 2.0f * -n5), (double)(-n2 * n6 + n2 + n4 / 2.0f * -n6), 1.0);
        GL11.glScaled((double)n5, (double)n6, 0.0);
    }
    
    public static void disableGL2D() {
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glHint(3154, 4352);
        GL11.glHint(3155, 4352);
    }
    
    public static void drawFullCircle(double n, double n2, double n3, final int n4) {
        n3 *= 2.0;
        n *= 2.0;
        n2 *= 2.0;
        final float n5 = (n4 >> 24 & 0xFF) / 255.0f;
        final float n6 = (n4 >> 16 & 0xFF) / 255.0f;
        final float n7 = (n4 >> 8 & 0xFF) / 255.0f;
        final float n8 = (n4 & 0xFF) / 255.0f;
        enableGL2D();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        GL11.glColor4f(n6, n7, n8, n5);
        GL11.glBegin(6);
        int n9 = 0;
        if (n9 <= 360) {
            GL11.glVertex2d(n + Math.sin(n9 * 3.141592653589793 / 180.0) * n3, n2 + Math.cos(n9 * 3.141592653589793 / 180.0) * n3);
            ++n9;
            return;
        }
        GL11.glEnd();
        GL11.glScalef(2.0f, 2.0f, 2.0f);
        disableGL2D();
    }
    
    public static void customScaledObject2D(final float n, final float n2, final float n3, final float n4, final float n5) {
        GL11.glTranslated((double)(n3 / 2.0f), (double)(n4 / 2.0f), 1.0);
        GL11.glTranslated((double)(-n * n5 + n + n3 / 2.0f * -n5), (double)(-n2 * n5 + n2 + n4 / 2.0f * -n5), 1.0);
        GL11.glScaled((double)n5, (double)n5, 0.0);
    }
    
    public static void drawImage(final ResourceLocation resourceLocation, final float n, final float n2, final float n3, final float n4, final Color color) {
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glDepthMask(false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        DrawHelper.setColor(color.getRGB());
        Gui.drawModalRectWithCustomSizedTexture((int)n, (int)n2, 0.0f, 0.0f, (int)n3, (int)n4, n3, n4);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glEnable(2929);
    }
}

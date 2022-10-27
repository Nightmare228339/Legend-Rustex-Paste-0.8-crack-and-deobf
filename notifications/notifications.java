//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.notifications;

import java.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import ru.sanchez.micotian.utils.*;
import ru.sanchez.micotian.utils.Font.*;
import ru.sanchez.micotian.module.hud.*;

public class notifications
{
    public static List Tests;
    public static List Times;
    private static float height;
    public static List Types;
    public static List Names;
    private static float width;
    
    public static void show() {
        int n = 0;
        if (n < notifications.Names.size()) {
            if ((int)notifications.Times.get(n) != 230) {
                notifications.Times.set(n, (int)notifications.Times.get(n) + 1);
            }
            else {
                notifications.Names.remove(n);
                notifications.Tests.remove(n);
                notifications.Types.remove(n);
                notifications.Times.remove(n);
            }
            ++n;
            return;
        }
        // invokedynamic(32:(F)V, 22.0f)
        int n2 = 0;
        if (n2 < notifications.Names.size()) {
            drawnotif(n2, (String)notifications.Names.get(n2), (String)notifications.Tests.get(n2), (Type)notifications.Types.get(n2), (int)notifications.Times.get(n2));
            ++n2;
        }
    }
    
    static {
        notifications.Names = new ArrayList();
        notifications.Tests = new ArrayList();
        notifications.Types = new ArrayList();
        notifications.Times = new ArrayList();
    }
    // invokedynamic(32:(F)V, 30.0f)
    // invokedynamic(38:(F)V, 100.0f)
    
    public static void add(final String s, final String s2, final Type type) {
        notifications.Names.add(s);
        notifications.Tests.add(s2);
        notifications.Types.add(type);
        notifications.Times.add(0);
    }
    
    public static void drawnotif(final int n, final String s, final String s2, final Type type, final int n2) {
        GlStateManager.enableTexture2D();
        final ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        GL11.glPushMatrix();
        if (n2 >= 110) {
            GL11.glTranslated((double)(scaledResolution.getScaledWidth() - 110), scaledResolution.getScaledHeight() - n2 * 1.5 + 10.0, 0.0);
        }
        else {
            GL11.glTranslated((double)(scaledResolution.getScaledWidth() - n2), scaledResolution.getScaledHeight() - n2 * 1.5 + 10.0, 0.0);
        }
        final int a = (int)(230.0 - (n2 - 7.6));
        if (a >= 0) {
            if (type == Type.Green) {
                RenderUtil.drawSmoothRect(0.0f, 0.0f, invokedynamic(13:()F), invokedynamic(14:()F), new Color(35, 35, 40, a).getRGB());
                RenderUtil.drawSmoothRect(0.0f, 0.0f, 7.0f, invokedynamic(14:()F), new Color(51, 255, 0, a).getRGB());
                CastomFontUtils.fr3.drawStringWithShadow(s, 10.0f, 2.0f, ClickGUI.getColor());
                CastomFontUtils.fr3.drawString(s2, 10.0f, (float)(4 + invokedynamic(21:(Lnet/minecraft/client/gui/FontRenderer;)I, Minecraft.getMinecraft().fontRenderer)), new Color(255, 255, 255, a).getRGB());
            }
            else if (type == Type.Red) {
                RenderUtil.drawSmoothRect(0.0f, 0.0f, invokedynamic(13:()F), invokedynamic(14:()F), new Color(35, 35, 40, a).getRGB());
                RenderUtil.drawSmoothRect(0.0f, 0.0f, 7.0f, invokedynamic(14:()F), new Color(255, 0, 0, a).getRGB());
                CastomFontUtils.fr3.drawStringWithShadow(s, 10.0f, 2.0f, ClickGUI.getColor());
                CastomFontUtils.fr3.drawString(s2, 10.0f, (float)(4 + invokedynamic(21:(Lnet/minecraft/client/gui/FontRenderer;)I, Minecraft.getMinecraft().fontRenderer)), new Color(255, 255, 255, a).getRGB());
            }
            else if (type == Type.OK) {
                RenderUtil.drawSmoothRect(0.0f, 0.0f, invokedynamic(13:()F), invokedynamic(14:()F), new Color(35, 35, 40, a).getRGB());
                RenderUtil.drawSmoothRect(0.0f, 0.0f, 7.0f, invokedynamic(14:()F), new Color(51, 255, 0, a).getRGB());
                CastomFontUtils.fr3.drawStringWithShadow(s, 10.0f, 2.0f, ClickGUI.getColor());
                CastomFontUtils.fr3.drawString(s2, 10.0f, (float)(4 + invokedynamic(21:(Lnet/minecraft/client/gui/FontRenderer;)I, Minecraft.getMinecraft().fontRenderer)), new Color(255, 255, 255, a).getRGB());
            }
        }
        GL11.glPopMatrix();
        GlStateManager.disableTexture2D();
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.settings.*;
import net.minecraftforge.client.event.*;
import java.util.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import ru.sanchez.micotian.utils.*;
import java.awt.*;
import ru.sanchez.micotian.module.hud.*;
import org.lwjgl.util.glu.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ChinaHat extends Module
{
    public static List Modes;
    
    public ChinaHat() {
        super("ChinaHat", Category.RENDER);
        ChinaHat.Modes.add("V2");
        ChinaHat.Modes.add("V1");
        Micotian.instance.settingsManager.rSetting(new Setting("Mode", this, "V2", (ArrayList)ChinaHat.Modes));
    }
    
    static {
        ChinaHat.Modes = new ArrayList();
    }
    
    @SubscribeEvent
    public void onWorldRender(final RenderWorldLastEvent renderWorldLastEvent) {
        final String valString = Micotian.instance.settingsManager.getSettingByName(this, "Mode").getValString();
        if (Objects.equals(valString, "V2")) {
            final double n = ChinaHat.mc.player.isSneaking() ? -0.1 : 0.12;
            if (invokedynamic(13:(Lnet/minecraft/client/settings/GameSettings;)I, ChinaHat.mc.gameSettings) == 1 || invokedynamic(13:(Lnet/minecraft/client/settings/GameSettings;)I, ChinaHat.mc.gameSettings) == 2) {
                GlStateManager.pushMatrix();
                GL11.glBlendFunc(770, 771);
                GlStateManager.disableDepth();
                GlStateManager.disableTexture2D();
                RenderUtils.enableSmoothLine(2.5f);
                GL11.glShadeModel(7425);
                GL11.glDisable(2884);
                GL11.glEnable(3042);
                GL11.glEnable(2929);
                GL11.glTranslatef(0.0f, (float)((double)invokedynamic(22:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, ChinaHat.mc.player) + n), 0.0f);
                GL11.glRotatef(-invokedynamic(24:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, ChinaHat.mc.player), 0.0f, 1.0f, 0.0f);
                final Color white = Color.WHITE;
                final Color color = new Color(105, 55, 255);
                GL11.glBegin(6);
                RenderUtils.glColor(color, 255.0f);
                GL11.glVertex3d(0.0, 0.3, 0.0);
                final float n2 = 0.0f;
                if (n2 < 360.5) {
                    RenderUtils.glColor(ClickGUI.getColor());
                    GL11.glVertex3d(Math.cos(n2 * 3.141592653589793 / 180.0) * 0.66, 0.0, Math.sin(n2 * 3.141592653589793 / 180.0) * 0.66);
                    return;
                }
                GL11.glVertex3d(0.0, 0.3, 0.0);
                GL11.glEnd();
                GL11.glBegin(2);
                final float n3 = 0.0f;
                if (n3 < 360.5) {
                    RenderUtils.glColor(ClickGUI.getColor());
                    GL11.glVertex3d(Math.cos(n3 * 3.141592653589793 / 180.0) * 0.66, 0.0, Math.sin(n3 * 3.141592653589793 / 180.0) * 0.66);
                    return;
                }
                GL11.glEnd();
                GlStateManager.enableAlpha();
                RenderUtils.disableSmoothLine();
                GL11.glShadeModel(7424);
                GL11.glEnable(2884);
                GL11.glDisable(3042);
                GlStateManager.enableTexture2D();
                GlStateManager.enableDepth();
                GlStateManager.resetColor();
                GlStateManager.popMatrix();
            }
        }
        else if (Objects.equals(valString, "V1")) {
            final double n4 = ChinaHat.mc.player.isSneaking() ? -0.18 : 0.04;
            GL11.glPushMatrix();
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glDepthMask(false);
            GL11.glColor4f(Color.magenta.getRed() / 255.0f, Color.magenta.getGreen() / 255.0f, Color.magenta.getBlue() / 255.0f, 0.49019608f);
            GL11.glTranslatef(0.0f, (float)((float)((double)invokedynamic(22:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, ChinaHat.mc.player) + 0.36) + n4), 0.0f);
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            final Cylinder cylinder = new Cylinder();
            cylinder.setDrawStyle(100000);
            cylinder.setDrawStyle(100011);
            cylinder.draw(0.0f, 0.55f, 0.3f, 150, 100);
            GL11.glEnable(3553);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
            GL11.glPopMatrix();
        }
    }
}

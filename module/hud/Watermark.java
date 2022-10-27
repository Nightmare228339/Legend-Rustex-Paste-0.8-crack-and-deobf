//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.hud;

import ru.sanchez.micotian.module.*;
import net.minecraft.client.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.settings.*;
import net.minecraftforge.client.event.*;
import java.text.*;
import java.util.*;
import java.awt.*;
import ru.sanchez.micotian.utils.*;
import net.minecraft.client.gui.*;
import ru.sanchez.micotian.utils.Font.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Watermark extends Module
{
    private final FontRenderer fr;
    public static List Modes;
    
    static {
        Watermark.Modes = new ArrayList();
    }
    
    public static int[] getRainbow(final int n, final float n2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        final float n6 = 6.0f * ((System.currentTimeMillis() - Math.round(n2 * 1000.0f)) % (n * 1000)) / (n * 1000);
        final int round = Math.round(255.0f * (n6 - (float)Math.floor(n6)));
        if (n6 < 1.0f) {
            n3 = 255;
            n4 = round;
        }
        else if (n6 < 2.0f) {
            n3 = 255 - round;
            n4 = 255;
        }
        else if (n6 < 3.0f) {
            n4 = 255;
            n5 = round;
        }
        else if (n6 < 4.0f) {
            n4 = 255 - round;
            n5 = 255;
        }
        else if (n6 < 5.0f) {
            n3 = round;
            n5 = 255;
        }
        else if (n6 < 6.0f) {
            n3 = 255;
            n5 = 255 - round;
        }
        return new int[] { n3, n4, n5 };
    }
    
    public static int RGBtoHex(final int n, final int n2, final int n3) {
        return n << 16 | n2 << 8 | n3;
    }
    
    public Watermark() {
        super("Watermark", Category.HUD);
        this.fr = Minecraft.getMinecraft().fontRenderer;
        Watermark.Modes.add("Skeet");
        Watermark.Modes.add("NaomitianV1");
        Watermark.Modes.add("NaomitianV2");
        Micotian.instance.settingsManager.rSetting(new Setting("Show Name", this, true));
        Micotian.instance.settingsManager.rSetting(new Setting("Mode", this, "NaomitianV2", (ArrayList)Watermark.Modes));
    }
    
    @SubscribeEvent
    public void onOverlayRender(final RenderGameOverlayEvent.Text text) {
        final String valString = Micotian.instance.settingsManager.getSettingByName(this, "Mode").getValString();
        if (text.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            if (Objects.equals(valString, "Skeet")) {
                final String str = Micotian.instance.settingsManager.getSettingByName(this, "Show Name").getValBoolean() ? Watermark.mc.player.getName() : "NoName";
                final int[] rainbow = getRainbow(5, 0.1f);
                RGBtoHex(rainbow[0], rainbow[1], rainbow[2]);
                final StringBuilder obj = new StringBuilder(new StringBuilder().append((Object)new StringBuilder(new StringBuilder().append((Object)new StringBuilder(new StringBuilder().append((Object)new StringBuilder().append("Legend").append(" ").append(" | ").append(str).append(" ").append(" | ").append(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())).append(" | Fps ").append(Minecraft.getDebugFPS())).toString()).append(" | ").append(Watermark.mc.isSingleplayer() ? "localhost" : Watermark.mc.getCurrentServerData().serverIP.toLowerCase())).toString()).append("  ")).toString());
                final Minecraft mc = Watermark.mc;
                final String value = String.valueOf(obj);
                final float n = (float)(Minecraft.getMinecraft().fontRenderer.getStringWidth(value) + 6);
                RenderUtil.drawRect(2.0, 2.0, 2.0f + n + 2.0f, 22.0, new Color(5, 5, 5, 255).getRGB());
                RenderUtil.drawBorderedRect(2.5, 2.5, 2.0f + n + 1.5, 21.5, 0.5, new Color(40, 40, 40, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
                RenderUtil.drawBorderedRect(4.0, 4.0, 2.0f + n, 20.0, 0.5, new Color(22, 22, 22, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
                RenderUtil.drawRect(4.5, 4.5, 2.0f + n - 0.5, 6.5, new Color(9, 9, 9, 255).getRGB());
                RenderUtil.drawGradientSideways(4.0, 5.0, 4.0f + n / 3.0f, 6.0, new Color(81, 149, 219, 255).getRGB(), new Color(180, 49, 218, 255).getRGB());
                RenderUtil.drawGradientSideways(4.0f + n / 3.0f, 5.0, 4.0f + n / 3.0f * 2.0f, 6.0, new Color(180, 49, 218, 255).getRGB(), new Color(236, 93, 128, 255).getRGB());
                RenderUtil.drawGradientSideways(4.0f + n / 3.0f * 2.0f, 5.0, n / 3.0f * 3.0f + 1.0f, 6.0, new Color(236, 93, 128, 255).getRGB(), new Color(235, 255, 0, 255).getRGB());
                mc.fontRenderer.drawStringWithShadow(value, 6.0f, 8.0f, -1);
            }
            else if (Objects.equals(valString, "NaomitianV2")) {
                final String string = "Legend Client V0.8.0 | " + (Micotian.instance.settingsManager.getSettingByName(this, "Show Name").getValBoolean() ? Watermark.mc.player.getName() : "NoName") + " | " + new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
                Gui.drawRect(4, 3, this.fr.getStringWidth(string) + 7, 22, ClickGUI.getColor());
                Gui.drawRect(5, 5, this.fr.getStringWidth(string) + 6, 21, new Color(37, 37, 37, 255).getRGB());
                Gui.drawRect(5, 9, this.fr.getStringWidth(string) + 7, 9, new Color(20, 20, 20, 100).getRGB());
                CastomFontUtils.fr.drawStringWithShadow(string, 6.0f, 13.0f, -1);
            }
            else if (Objects.equals(valString, "NaomitianV1")) {
                final String string2 = "Legend Client V0.8.0 | " + (Micotian.instance.settingsManager.getSettingByName(this, "Show Name").getValBoolean() ? Watermark.mc.player.getName() : "NoName") + " | " + new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
                Gui.drawRect(5, 5, this.fr.getStringWidth(string2) + 9, 21, new Color(37, 37, 37, 255).getRGB());
                Gui.drawRect(6, 6, this.fr.getStringWidth(string2) + 8, 8, ClickGUI.getColor());
                Gui.drawRect(5, 9, this.fr.getStringWidth(string2) + 9, 9, new Color(20, 20, 20, 100).getRGB());
                Watermark.mc.fontRenderer.drawStringWithShadow(string2, 9.0f, 11.0f, -1);
            }
        }
    }
}

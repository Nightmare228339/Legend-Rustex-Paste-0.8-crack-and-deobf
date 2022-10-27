//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.hud;

import java.util.*;
import ru.sanchez.micotian.*;
import java.awt.*;
import ru.sanchez.micotian.utils.*;
import Caesium.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.settings.*;

public class ClickGUI extends Module
{
    public static int red;
    public static int color;
    public static int green;
    public static int blue;
    public static List Modes;
    
    static {
        ClickGUI.Modes = new ArrayList();
    }
    
    public static int getColor() {
        final boolean valBoolean = Micotian.instance.settingsManager.getSettingByName("Rainbow", "Range").getValBoolean();
        Color.HSBtoRGB((new float[] { System.currentTimeMillis() % 11520L / 11520.0f })[0], 1.0f, 1.0f);
        final int rgba = ColourUtils.toRGBA((int)Micotian.instance.settingsManager.getSettingByName("Red", "Range").getValDouble(), (int)Micotian.instance.settingsManager.getSettingByName("Green", "Range").getValDouble(), (int)Micotian.instance.settingsManager.getSettingByName("Blue", "Range").getValDouble(), 255);
        return valBoolean ? ColourUtils.genRainbow() : rgba;
    }
    
    @Override
    public void onEnable() {
        final String valString = Micotian.instance.settingsManager.getSettingByName(this, "Gui").getValString();
        int n = -1;
        switch (valString.hashCode()) {
            case 78208: {
                if (Integer.valueOf(78208).equals(valString.hashCode())) {
                    n = 0;
                    break;
                }
                break;
            }
            case 79367: {
                if (Integer.valueOf(79367).equals(valString.hashCode())) {
                    n = 1;
                    break;
                }
                break;
            }
            case 2011275645: {
                if (Integer.valueOf(2011275645).equals(valString.hashCode())) {
                    n = 2;
                    break;
                }
                break;
            }
        }
        switch (n) {
            case 0: {
                ClickGUI.mc.displayGuiScreen((GuiScreen)new Panel("Caesium", 22));
                break;
            }
            case 1: {
                final Minecraft mc = ClickGUI.mc;
                final Micotian instance = Micotian.instance;
                mc.displayGuiScreen((GuiScreen)Micotian.bobrGui);
                break;
            }
            case 2: {
                final Minecraft mc2 = ClickGUI.mc;
                final Micotian instance2 = Micotian.instance;
                mc2.displayGuiScreen((GuiScreen)Micotian.CastomGui);
                break;
            }
        }
        super.onEnable();
        this.setToggled(false);
    }
    
    public static int getColor2() {
        final boolean valBoolean = Micotian.instance.settingsManager.getSettingByName("Rainbow", "Range").getValBoolean();
        Color.HSBtoRGB((new float[] { System.currentTimeMillis() % 11520L / 11520.0f })[0], 1.0f, 1.0f);
        final int rgba = ColourUtils.toRGBA((int)Micotian.instance.settingsManager.getSettingByName("Red", "Range").getValDouble(), (int)Micotian.instance.settingsManager.getSettingByName("Green", "Range").getValDouble(), (int)Micotian.instance.settingsManager.getSettingByName("Blue", "Range").getValDouble(), 195);
        return valBoolean ? ColourUtils.genRainbowShadow() : rgba;
    }
    
    public static float getColor3() {
        final boolean valBoolean = Micotian.instance.settingsManager.getSettingByName("Rainbow", "Range").getValBoolean();
        final float n = (float)Color.HSBtoRGB((new float[] { System.currentTimeMillis() % 11520L / 11520.0f })[0], 1.0f, 1.0f);
        final int rgba = ColourUtils.toRGBA((float)Micotian.instance.settingsManager.getSettingByName("Red", "Range").getValDouble(), (float)Micotian.instance.settingsManager.getSettingByName("Green", "Range").getValDouble(), (float)Micotian.instance.settingsManager.getSettingByName("Blue", "Range").getValDouble(), 255.0f);
        return valBoolean ? ((float)ColourUtils.genRainbowShadow()) : ((float)rgba);
    }
    
    public ClickGUI() {
        super("ClickGUI", Category.HUD);
        this.setKey(54);
        ClickGUI.Modes.add("Castom");
        ClickGUI.Modes.add("New");
        ClickGUI.Modes.add("Old");
        Micotian.instance.settingsManager.rSetting(new Setting("Gui", this, "Castom", (ArrayList)ClickGUI.Modes));
        Micotian.instance.settingsManager.rSetting(new Setting("Rainbow", this, true));
        Micotian.instance.settingsManager.rSetting(new Setting("Red", this, 225.0, 0.0, 225.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("Green", this, 0.0, 0.0, 225.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("Blue", this, 0.0, 0.0, 225.0, true));
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.hud;

import net.minecraft.client.*;
import net.minecraftforge.client.event.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.utils.Font.*;
import ru.sanchez.micotian.utils.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.settings.*;

public class TEST extends Module
{
    protected Minecraft mc;
    public static int yy;
    public static int xx;
    
    @SubscribeEvent
    public void onRenderGameOverlay(final RenderGameOverlayEvent renderGameOverlayEvent) {
        final int n = (int)Micotian.instance.settingsManager.getSettingByName(this, "xx").getValDouble();
        final int n2 = (int)Micotian.instance.settingsManager.getSettingByName(this, "yy").getValDouble();
        final int n3 = (int)Micotian.instance.settingsManager.getSettingByName(this, "PosX1").getValDouble();
        final int n4 = (int)Micotian.instance.settingsManager.getSettingByName(this, "PosY1").getValDouble();
        final int n5 = (int)Micotian.instance.settingsManager.getSettingByName(this, "PosX2").getValDouble();
        final int n6 = (int)Micotian.instance.settingsManager.getSettingByName(this, "PosY2").getValDouble();
        CastomFontUtils.fr2.drawString("TestTextForCord", (float)(int)Micotian.instance.settingsManager.getSettingByName(this, "PosX").getValDouble(), (float)(int)Micotian.instance.settingsManager.getSettingByName(this, "PosY").getValDouble(), ColourUtils.genRainbow());
        CastomFontUtils.fr2.drawString("TestTextForCord", 5.0f, 5.0f, ColourUtils.genRainbow());
        if (this.mc.player != null && this.mc.world != null) {
            Gui.drawRect(n3, n4, n5, n6, new Color(37, 37, 37, 255).getRGB());
        }
    }
    
    public TEST() {
        super("Castom", Category.HUD);
        this.mc = Minecraft.getMinecraft();
        Micotian.instance.settingsManager.rSetting(new Setting("PosX1", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("PosY1", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("PosX2", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("PosY2", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("PosX", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("PosY", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("xx", this, 10.0, 0.0, 1000.0, true));
        Micotian.instance.settingsManager.rSetting(new Setting("yy", this, 10.0, 0.0, 1000.0, true));
    }
}

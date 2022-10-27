//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import ru.sanchez.micotian.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.settings.*;

public class Zoom extends Module
{
    private static float FOV;
    
    @Override
    public void onEnable() {
        super.onEnable();
        // invokedynamic(7:(F)V, invokedynamic(6:(Lnet/minecraft/client/settings/GameSettings;)F, Zoom.mc.gameSettings))
        Zoom.mc.gameSettings.fovSetting = (float)((double)invokedynamic(10:()F) / Micotian.instance.settingsManager.getSettingByName(this, "Zoom").getValDouble());
    }
    
    public Zoom() {
        super("Zoom", Category.RENDER);
        Micotian.instance.settingsManager.rSetting(new Setting("Zoom", this, 1.0, 1.0, 10.0, true));
    }
    
    @Override
    public void onDisable() {
        Zoom.mc.gameSettings.fovSetting = invokedynamic(10:()F);
    }
}

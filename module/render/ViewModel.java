//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import net.minecraftforge.client.event.*;
import ru.sanchez.micotian.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.settings.*;
import java.util.*;

public class ViewModel extends Module
{
    public static List listA;
    
    @SubscribeEvent
    public void onRender(final RenderSpecificHandEvent renderSpecificHandEvent) {
        GL11.glTranslated((double)(float)Micotian.instance.settingsManager.getSettingByName(this, "PosX").getValDouble(), (double)(float)Micotian.instance.settingsManager.getSettingByName(this, "PosY").getValDouble(), (double)(float)Micotian.instance.settingsManager.getSettingByName(this, "PosZ").getValDouble());
    }
    
    public ViewModel() {
        super("ViewModel", Category.RENDER);
        Micotian.instance.settingsManager.rSetting(new Setting("PosX", this, 0.0, -2.0, 2.0, false));
        Micotian.instance.settingsManager.rSetting(new Setting("PosY", this, 0.0, -2.0, 2.0, false));
        Micotian.instance.settingsManager.rSetting(new Setting("PosZ", this, 0.0, -2.0, 2.0, false));
    }
    
    static {
        ViewModel.listA = new ArrayList();
    }
    
    public void onEnable() {
        super.onEnable();
    }
    
    public void onDisable() {
        super.onDisable();
    }
}

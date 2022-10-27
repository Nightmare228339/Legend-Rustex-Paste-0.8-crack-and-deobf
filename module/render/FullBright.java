//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class FullBright extends Module
{
    public float oldgamma;
    
    public void onDisable() {
        super.onDisable();
        FullBright.mc.gameSettings.gammaSetting = invokedynamic(5:(Lru/sanchez/micotian/module/render/FullBright;)F, this);
    }
    
    public void onEnable() {
        super.onEnable();
        // invokedynamic(4:(Lru/sanchez/micotian/module/render/FullBright;F)V, this, invokedynamic(3:(Lnet/minecraft/client/settings/GameSettings;)F, FullBright.mc.gameSettings))
        FullBright.mc.gameSettings.gammaSetting = 10000.0f;
    }
    
    @SubscribeEvent
    public void onLivingUpdate(final LivingEvent.LivingUpdateEvent livingUpdateEvent) {
    }
    
    public FullBright() {
        super("FullBright", Category.RENDER);
    }
}

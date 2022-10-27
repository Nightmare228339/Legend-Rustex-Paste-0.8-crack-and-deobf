//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.hud;

import net.minecraft.entity.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.*;
import ru.sanchez.micotian.notifications.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class Notifications extends Module
{
    private Entity target;
    private static RenderItem itemRender;
    
    @SubscribeEvent
    public void onRender(final RenderGameOverlayEvent.Text text) {
        if (text.getType() != RenderGameOverlayEvent.ElementType.TEXT || invokedynamic(5:(Lnet/minecraft/client/settings/GameSettings;)Z, Minecraft.getMinecraft().gameSettings)) {
            return;
        }
        notifications.show();
    }
    
    public Notifications() {
        super("Notifications", Category.HUD);
    }
}

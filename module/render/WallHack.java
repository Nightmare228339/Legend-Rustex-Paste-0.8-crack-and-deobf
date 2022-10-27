//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.settings.*;
import net.minecraft.entity.*;
import net.minecraft.client.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class WallHack extends Module
{
    public WallHack() {
        super("WallHackMob", Category.RENDER);
        Micotian.instance.settingsManager.rSetting(new Setting("Mob", this, true));
        Micotian.instance.settingsManager.rSetting(new Setting("Animal", this, false));
    }
    
    void render(final Entity entity, final float n) {
        try {
            if (entity == null || entity == Minecraft.getMinecraft().player) {
                return;
            }
            if (entity == Minecraft.getMinecraft().getRenderViewEntity() && invokedynamic(4:(Lnet/minecraft/client/settings/GameSettings;)I, Minecraft.getMinecraft().gameSettings) == 0) {
                return;
            }
            Minecraft.getMinecraft().entityRenderer.disableLightmap();
            Minecraft.getMinecraft().getRenderManager().renderEntityStatic(entity, n, false);
            Minecraft.getMinecraft().entityRenderer.enableLightmap();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @SubscribeEvent
    public void onRenderWorld(final RenderWorldLastEvent renderWorldLastEvent) {
        final boolean valBoolean = Micotian.instance.settingsManager.getSettingByName(this, "Mob").getValBoolean();
        final boolean valBoolean2 = Micotian.instance.settingsManager.getSettingByName(this, "Animal").getValBoolean();
        GlStateManager.clear(256);
        RenderHelper.enableStandardItemLighting();
        if (valBoolean) {
            final Iterator<Entity> iterator = Minecraft.getMinecraft().world.loadedEntityList.iterator();
            if (iterator.hasNext()) {
                final Entity entity = iterator.next();
                if (entity instanceof EntityMob) {
                    if (entity == Minecraft.getMinecraft().getRenderViewEntity()) {
                        return;
                    }
                    this.render(entity, renderWorldLastEvent.getPartialTicks());
                }
                return;
            }
        }
        if (valBoolean2) {
            final Iterator<Entity> iterator2 = Minecraft.getMinecraft().world.loadedEntityList.iterator();
            if (iterator2.hasNext()) {
                final Entity entity2 = iterator2.next();
                if (entity2 instanceof EntityAnimal) {
                    if (entity2 == Minecraft.getMinecraft().getRenderViewEntity()) {
                        return;
                    }
                    this.render(entity2, renderWorldLastEvent.getPartialTicks());
                }
            }
        }
    }
}

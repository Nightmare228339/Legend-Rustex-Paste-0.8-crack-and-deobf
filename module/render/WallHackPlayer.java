//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import ru.sanchez.micotian.manager.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class WallHackPlayer extends Module
{
    @SubscribeEvent
    public void onRenderWorld(final RenderWorldLastEvent renderWorldLastEvent) {
        GlStateManager.clear(256);
        RenderHelper.enableStandardItemLighting();
        final Iterator<Entity> iterator = Minecraft.getMinecraft().world.loadedEntityList.iterator();
        if (iterator.hasNext()) {
            final Entity entity = iterator.next();
            if (entity instanceof EntityPlayer && entity != Minecraft.getMinecraft().getRenderViewEntity()) {
                if (FriendManager.isFriend(entity.getName())) {
                    this.render(entity, renderWorldLastEvent.getPartialTicks());
                }
                else {
                    this.render(entity, renderWorldLastEvent.getPartialTicks());
                }
            }
        }
    }
    
    void render(final Entity entity, final float n) {
        try {
            if (entity == null || entity == Minecraft.getMinecraft().player) {
                return;
            }
            if (entity == Minecraft.getMinecraft().getRenderViewEntity() && invokedynamic(5:(Lnet/minecraft/client/settings/GameSettings;)I, Minecraft.getMinecraft().gameSettings) == 0) {
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
    
    public WallHackPlayer() {
        super("WallHackPlayer", Category.RENDER);
    }
}

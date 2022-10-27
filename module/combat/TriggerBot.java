//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.combat;

import net.minecraft.entity.*;
import net.minecraftforge.client.event.*;
import net.minecraft.entity.player.*;
import ru.sanchez.micotian.manager.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.*;
import ru.sanchez.micotian.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.settings.*;

public class TriggerBot extends Module
{
    public static List Freand;
    private Entity entity;
    
    @SubscribeEvent
    public void onUpdate(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.isToggled()) {
            final Iterator<EntityPlayer> iterator = TriggerBot.mc.world.playerEntities.iterator();
            if (iterator.hasNext()) {
                final EntityPlayer entityPlayer = iterator.next();
                if (entityPlayer != null && entityPlayer != TriggerBot.mc.player) {
                    if (entityPlayer != null && !FriendManager.isFriend(entityPlayer.getName())) {
                        entityPlayer.setEntityBoundingBox(new AxisAlignedBB(invokedynamic(32:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) - 0.3, invokedynamic(34:(Lnet/minecraft/util/math/AxisAlignedBB;)D, entityPlayer.getEntityBoundingBox()), invokedynamic(35:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) - 0.3, invokedynamic(32:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) + 0.3, invokedynamic(36:(Lnet/minecraft/util/math/AxisAlignedBB;)D, entityPlayer.getEntityBoundingBox()), invokedynamic(35:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) + 0.3));
                    }
                    if (entityPlayer != null && FriendManager.isFriend(entityPlayer.getName())) {
                        entityPlayer.setEntityBoundingBox(new AxisAlignedBB(invokedynamic(32:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) - 0.0, invokedynamic(34:(Lnet/minecraft/util/math/AxisAlignedBB;)D, entityPlayer.getEntityBoundingBox()), invokedynamic(35:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) - 0.0, invokedynamic(32:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) + 0.0, invokedynamic(36:(Lnet/minecraft/util/math/AxisAlignedBB;)D, entityPlayer.getEntityBoundingBox()), invokedynamic(35:(Lnet/minecraft/entity/player/EntityPlayer;)D, entityPlayer) + 0.0));
                    }
                }
            }
        }
    }
    
    static {
        TriggerBot.Freand = new ArrayList();
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        final RayTraceResult objectMouseOver = Minecraft.getMinecraft().objectMouseOver;
        int valBoolean = Micotian.instance.settingsManager.getSettingByName(this, "OnlyCritical").getValBoolean() ? 1 : 0;
        final boolean valBoolean2 = Micotian.instance.settingsManager.getSettingByName(this, "OnGround").getValBoolean();
        if (objectMouseOver != null && objectMouseOver.typeOfHit == RayTraceResult.Type.ENTITY) {
            this.entity = objectMouseOver.entityHit;
            if (this.entity instanceof EntityPlayer) {
                if (valBoolean2) {
                    if (!invokedynamic(15:(Lnet/minecraft/client/entity/EntityPlayerSP;)Z, TriggerBot.mc.player)) {
                        return;
                    }
                    if (valBoolean != 0) {
                        Micotian.instance.settingsManager.getSettingByName(this, "OnGround").setValBoolean(false);
                        valBoolean = 0;
                    }
                }
                if (invokedynamic(15:(Lnet/minecraft/client/entity/EntityPlayerSP;)Z, TriggerBot.mc.player) && valBoolean != 0) {
                    TriggerBot.mc.player.motionY = 0.38;
                }
                if (Minecraft.getMinecraft().player.getCooledAttackStrength(0.0f) == 1.0f) {
                    Minecraft.getMinecraft().playerController.attackEntity((EntityPlayer)Minecraft.getMinecraft().player, this.entity);
                    if (this.entity != null && !FriendManager.isFriend(this.entity.getName())) {
                        Minecraft.getMinecraft().player.swingArm(EnumHand.MAIN_HAND);
                        Minecraft.getMinecraft().player.resetCooldown();
                    }
                }
            }
        }
    }
    
    public TriggerBot() {
        super("TriggerBot", Category.COMBAT);
        Micotian.instance.settingsManager.rSetting(new Setting("OnlyCritical", this, false));
        Micotian.instance.settingsManager.rSetting(new Setting("OnGround", this, true));
    }
}

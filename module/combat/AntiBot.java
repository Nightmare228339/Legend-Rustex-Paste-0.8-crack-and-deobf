//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.combat;

import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.settings.*;
import net.minecraft.entity.*;
import ru.sanchez.micotian.manager.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.block.state.*;

public class AntiBot extends Module
{
    public static List BOTS;
    static final boolean $assertionsDisabled;
    public static boolean toggle;
    
    @Override
    public void onDisable() {
        super.onDisable();
        // invokedynamic(4:(Z)V, false)
        AntiBot.BOTS.clear();
    }
    
    static {
        $assertionsDisabled = !AntiBot.class.desiredAssertionStatus();
        AntiBot.BOTS = new ArrayList();
    }
    
    public static boolean isBot(final String s) {
        if (invokedynamic(7:()Z)) {
            final Iterator<String> iterator = (Iterator<String>)AntiBot.BOTS.iterator();
            return iterator.hasNext() && Integer.valueOf(s.toUpperCase().hashCode()).equals(iterator.next().toUpperCase().hashCode());
        }
        return false;
    }
    
    public static boolean isBlockMaterial(final BlockPos blockPos, final Block block) {
        return getBlock(blockPos) == Blocks.AIR;
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
    }
    // invokedynamic(4:(Z)V, true)
    
    public AntiBot() {
        super("AntiBot", Category.COMBAT);
        Micotian.instance.settingsManager.rSetting(new Setting("Remove", this, true));
    }
    
    public static boolean isBot(final Entity entity) {
        if (!invokedynamic(32:()Z) && entity == null) {
            throw new AssertionError();
        }
        return entity != AntiBot.mc.player && invokedynamic(27:(Lnet/minecraft/entity/Entity;)I, entity) < 5 && !FriendManager.FRIENDS.contains(entity.getName()) && entity instanceof EntityOtherPlayerMP && entity.isInvisible();
    }
    
    @SubscribeEvent
    public void onTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        final boolean valBoolean = Micotian.instance.settingsManager.getSettingByName(this, "Remove").getValBoolean();
        for (final Entity entity : AntiBot.mc.world.loadedEntityList) {
            if (entity != AntiBot.mc.player && invokedynamic(27:(Lnet/minecraft/entity/Entity;)I, entity) < 5) {
                if (!(entity instanceof EntityOtherPlayerMP)) {
                    return;
                }
                if (!entity.isInvisible()) {
                    return;
                }
                AntiBot.BOTS.add(entity.getName());
                if (!valBoolean) {
                    return;
                }
                AntiBot.mc.world.removeEntity(entity);
            }
        }
    }
    
    public static IBlockState getState(final BlockPos blockPos) {
        return AntiBot.mc.world.getBlockState(blockPos);
    }
    
    public static Block getBlock(final BlockPos blockPos) {
        return getState(blockPos).getBlock();
    }
}

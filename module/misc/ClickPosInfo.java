//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import ru.sanchez.micotian.module.*;
import net.minecraftforge.event.entity.player.*;
import ru.sanchez.micotian.utils.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ClickPosInfo extends Module
{
    public ClickPosInfo() {
        super("ClickPosInfo", Category.OUTHER);
    }
    
    @SubscribeEvent
    public void onRightClickBlock(final PlayerInteractEvent.RightClickBlock rightClickBlock) {
        final BlockPos pos = rightClickBlock.getPos();
        ChatUtils.sendMessage((double)pos.getX() + " " + (double)pos.getY() + " " + (double)pos.getZ());
        ChatUtils.sendMessage(String.valueOf(ClickPosInfo.mc.world.getBlockState(pos).getBlock()));
    }
}

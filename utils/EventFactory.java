//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.network.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.block.state.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import ru.sanchez.micotian.events.*;

public class EventFactory
{
    public static Packet onReceivePacket(final Packet packet) {
        final ReceivePacketEvent receivePacketEvent = new ReceivePacketEvent(packet);
        return MinecraftForge.EVENT_BUS.post((Event)receivePacketEvent) ? null : receivePacketEvent.getPacket();
    }
    
    public static float getAmbientOcclusionLightValue(final IBlockState blockState) {
        final GetAmbientOcclusionLightValueEvent getAmbientOcclusionLightValueEvent = new GetAmbientOcclusionLightValueEvent(blockState);
        MinecraftForge.EVENT_BUS.post((Event)getAmbientOcclusionLightValueEvent);
        return getAmbientOcclusionLightValueEvent.getLightValue();
    }
    
    public static boolean isUser() {
        return !MinecraftForge.EVENT_BUS.post((Event)new PlayerIsUserEvent());
    }
    
    public static boolean shouldSideBeRendered(final IBlockState blockState, final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        final ShouldSideBeRenderedEvent shouldSideBeRenderedEvent = new ShouldSideBeRenderedEvent(blockState, blockState.getBlock().shouldSideBeRendered(blockState, blockAccess, blockPos, enumFacing));
        MinecraftForge.EVENT_BUS.post((Event)shouldSideBeRenderedEvent);
        return shouldSideBeRenderedEvent.getShouldBeRendered();
    }
    
    public static boolean onUpdateWalkingPlayer() {
        return MinecraftForge.EVENT_BUS.post((Event)new UpdateWalkingPlayerEvent());
    }
    
    public static boolean setOpaqueCube() {
        return MinecraftForge.EVENT_BUS.post((Event)new SetOpaqueCubeEvent());
    }
    
    public static Packet onSendPacket(final Packet packet) {
        final SendPacketEvent sendPacketEvent = new SendPacketEvent(packet);
        return MinecraftForge.EVENT_BUS.post((Event)sendPacketEvent) ? null : sendPacketEvent.getPacket();
    }
    
    public static AxisAlignedBB getCollisionBoundingBox() {
        final GetLiquidCollisionBoundingBoxEvent getLiquidCollisionBoundingBoxEvent = new GetLiquidCollisionBoundingBoxEvent();
        MinecraftForge.EVENT_BUS.post((Event)getLiquidCollisionBoundingBoxEvent);
        return getLiquidCollisionBoundingBoxEvent.getCollisionBoundingBox();
    }
    
    public static boolean renderBlock(final IBlockState blockState) {
        return MinecraftForge.EVENT_BUS.post((Event)new RenderModelEvent(blockState));
    }
}

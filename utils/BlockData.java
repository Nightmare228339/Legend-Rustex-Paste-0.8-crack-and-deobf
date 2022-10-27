//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.init.*;

public class BlockData
{
    public final BlockPos position;
    public final EnumFacing face;
    
    public BlockData(final BlockPos position, final EnumFacing face) {
        this.position = position;
        this.face = face;
    }
    
    public static BlockData getBlockData(final BlockPos blockPos) {
        if (Minecraft.getMinecraft().world.getBlockState(blockPos.add(0, -1, 0)).getBlock() != Blocks.AIR) {
            return new BlockData(blockPos.add(0, -1, 0), EnumFacing.UP);
        }
        if (Minecraft.getMinecraft().world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() != Blocks.AIR) {
            return new BlockData(blockPos.add(-1, 0, 0), EnumFacing.EAST);
        }
        if (Minecraft.getMinecraft().world.getBlockState(blockPos.add(1, 0, 0)).getBlock() != Blocks.AIR) {
            return new BlockData(blockPos.add(1, 0, 0), EnumFacing.WEST);
        }
        if (Minecraft.getMinecraft().world.getBlockState(blockPos.add(0, 0, -1)).getBlock() != Blocks.AIR) {
            return new BlockData(blockPos.add(0, 0, -1), EnumFacing.SOUTH);
        }
        if (Minecraft.getMinecraft().world.getBlockState(blockPos.add(0, 0, 1)).getBlock() != Blocks.AIR) {
            return new BlockData(blockPos.add(0, 0, 1), EnumFacing.NORTH);
        }
        return null;
    }
}

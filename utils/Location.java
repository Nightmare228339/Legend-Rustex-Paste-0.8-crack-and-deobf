//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.util.math.*;

public class Location
{
    private int y;
    private int id;
    private int z;
    private int x;
    private BlockPos pos;
    
    public void setPos(final BlockPos pos) {
        this.pos = pos;
    }
    
    @Override
    public int hashCode() {
        return (this.pos.getY() + this.pos.getZ() * 859433) * 859433 + this.pos.getX();
    }
    
    public int getX() {
        return this.pos.getX();
    }
    
    public static Location readBytes(final byte[] array) {
        final byte b = array[0];
        int n = (array[1] & 0xFF) | (array[2] << 8 & 0x7FFF);
        if ((array[2] & 0x80) == 0x80) {
            n = -n;
        }
        int n2 = (array[3] & 0xFF) | (array[4] << 8 & 0x7FFF);
        if ((array[4] & 0x80) == 0x80) {
            n2 = -n2;
        }
        int n3 = (array[5] & 0xFF) | (array[6] << 8 & 0x7FFF);
        if ((array[6] & 0x80) == 0x80) {
            n3 = -n3;
        }
        return new Location(n, n2, n3, b);
    }
    
    public Location(final int n, final int n2, final int n3, final int n4) {
        this.pos = new BlockPos(n, n2, n3);
    }
    // invokedynamic(1:(Lru/sanchez/micotian/utils/Location;I)V, this, n4)
    
    public BlockPos getPos() {
        return this.pos;
    }
    
    public byte[] toBytes() {
        final byte[] array = new byte[7];
        final int x = this.getX();
        final int y = this.getY();
        final int z = this.getZ();
        array[0] = (byte)(invokedynamic(6:(Lru/sanchez/micotian/utils/Location;)I, this) & 0xFF);
        array[1] = (byte)(Math.abs(x) & 0xFF);
        array[2] = (byte)((Math.abs(x) >> 8 & 0xFF) | ((x < 0) ? 128 : 0));
        array[3] = (byte)(Math.abs(y) & 0xFF);
        array[4] = (byte)((Math.abs(y) >> 8 & 0x7F) | ((y < 0) ? 128 : 0));
        array[5] = (byte)(Math.abs(z) & 0xFF);
        array[6] = (byte)((Math.abs(z) >> 8 & 0x7F) | ((z < 0) ? 128 : 0));
        return array;
    }
    
    public int getY() {
        return this.pos.getY();
    }
    
    public Location(final BlockPos pos, final int n) {
        this(pos.getX(), pos.getY(), pos.getZ(), n);
        this.pos = pos;
    }
    // invokedynamic(1:(Lru/sanchez/micotian/utils/Location;I)V, this, n)
    
    public Location add(final int n, final int n2, final int n3) {
        return new Location(new BlockPos(this.pos.getX() + n, this.pos.getY() + n2, this.pos.getZ() + n3), invokedynamic(6:(Lru/sanchez/micotian/utils/Location;)I, this));
    }
    
    public Location(final BlockPos blockPos) {
        this(blockPos, -1);
    }
    
    public int getId() {
        return invokedynamic(6:(Lru/sanchez/micotian/utils/Location;)I, this);
    }
    
    public int getZ() {
        return this.pos.getZ();
    }
}

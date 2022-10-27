//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.nbt.*;
import net.minecraft.entity.item.*;

public class ArmorStandBlocks
{
    public static ItemStack getBigBox() {
        final ItemStack itemStack = new ItemStack(Items.DIAMOND_HOE, 1, 60);
        try {
            itemStack.setTagCompound(JsonToNBT.getTagFromJson("{Unbreakable:1b}"));
        }
        catch (Throwable t) {}
        try {
            itemStack.setItemFrame((EntityItemFrame)null);
        }
        catch (Throwable t2) {}
        return itemStack;
    }
    
    public static ItemStack getFurance() {
        final ItemStack itemStack = new ItemStack(Items.DIAMOND_HOE, 1, 221);
        try {
            itemStack.setTagCompound(JsonToNBT.getTagFromJson("{Unbreakable:1b}"));
            System.out.println("TRUE");
        }
        catch (Throwable t) {}
        try {
            itemStack.setItemFrame((EntityItemFrame)null);
        }
        catch (Throwable t2) {}
        return itemStack;
    }
    
    public static ItemStack getSmallBox() {
        final ItemStack itemStack = new ItemStack(Items.DIAMOND_HOE, 1, 55);
        try {
            itemStack.setTagCompound(JsonToNBT.getTagFromJson("{Unbreakable:1b}"));
        }
        catch (Throwable t) {}
        try {
            itemStack.setItemFrame((EntityItemFrame)null);
        }
        catch (Throwable t2) {}
        return itemStack;
    }
    
    public static ItemStack getShkaf() {
        final ItemStack itemStack = new ItemStack(Items.DIAMOND_HOE, 1, 56);
        try {
            itemStack.setTagCompound(JsonToNBT.getTagFromJson("{Unbreakable:1b}"));
        }
        catch (Throwable t) {}
        try {
            itemStack.setItemFrame((EntityItemFrame)null);
        }
        catch (Throwable t2) {}
        return itemStack;
    }
}

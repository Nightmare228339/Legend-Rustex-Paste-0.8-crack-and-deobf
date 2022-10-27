//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.client.*;

public final class RotationManager
{
    private final RotationTaskFactory factory;
    private float pitch;
    private float yaw;
    
    public RotationManager() {
        this.factory = new RotationTaskFactory();
    }
    
    public void finishTask(final RotationTask rotationTask) {
        this.factory.finishTask((BasicTask)rotationTask);
    }
    
    public void removeTask(final RotationTask rotationTask) {
        this.factory.removeTask((BasicTask)rotationTask);
    }
    
    public float getPitch() {
        return invokedynamic(13:(Lru/sanchez/micotian/utils/RotationManager;)F, this);
    }
    
    public void setPlayerPitch(final float rotationPitch) {
        Minecraft.getMinecraft().player.rotationPitch = rotationPitch;
    }
    
    public void addTask(final RotationTask rotationTask) {
        this.factory.addTask((BasicTask)rotationTask);
    }
    
    public float getYaw() {
        return invokedynamic(12:(Lru/sanchez/micotian/utils/RotationManager;)F, this);
    }
    
    public void removeTask(final String s) {
        this.factory.removeTask(s);
    }
    
    public void startTask(final RotationTask rotationTask) {
        this.factory.startTask((BasicTask)rotationTask);
    }
    
    public RotationTaskFactory getFactory() {
        return this.factory;
    }
    
    public void setPlayerYaw(final float n) {
        Minecraft.getMinecraft().player.rotationYaw = n;
        Minecraft.getMinecraft().player.rotationYawHead = n;
    }
    
    public void setPlayerRotations(final float n, final float rotationPitch) {
        Minecraft.getMinecraft().player.rotationYaw = n;
        Minecraft.getMinecraft().player.rotationYawHead = n;
        Minecraft.getMinecraft().player.rotationPitch = rotationPitch;
    }
    
    public void setPitch(final float n) {
    }
    // invokedynamic(11:(Lru/sanchez/micotian/utils/RotationManager;F)V, this, n)
    
    public void restoreRotations() {
        Minecraft.getMinecraft().player.rotationYaw = invokedynamic(12:(Lru/sanchez/micotian/utils/RotationManager;)F, this);
        Minecraft.getMinecraft().player.rotationYawHead = invokedynamic(12:(Lru/sanchez/micotian/utils/RotationManager;)F, this);
        Minecraft.getMinecraft().player.rotationPitch = invokedynamic(13:(Lru/sanchez/micotian/utils/RotationManager;)F, this);
    }
    
    public void setYaw(final float n) {
    }
    // invokedynamic(9:(Lru/sanchez/micotian/utils/RotationManager;F)V, this, n)
    
    public void updateRotations() {
    }
    // invokedynamic(9:(Lru/sanchez/micotian/utils/RotationManager;F)V, this, invokedynamic(8:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, Minecraft.getMinecraft().player))
    // invokedynamic(11:(Lru/sanchez/micotian/utils/RotationManager;F)V, this, invokedynamic(10:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, Minecraft.getMinecraft().player))
}

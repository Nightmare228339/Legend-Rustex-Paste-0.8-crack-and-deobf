//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module;

import net.minecraft.client.*;
import net.minecraftforge.common.*;
import net.minecraft.util.text.*;
import ru.sanchez.micotian.notifications.*;
import net.minecraftforge.client.event.*;

public abstract class Module
{
    private boolean toggled;
    private Category category;
    protected static Minecraft mc;
    private String description;
    private int key;
    public boolean visible;
    private String name;
    
    public void setKey(final int n) {
    }
    // invokedynamic(4:(Lru/sanchez/micotian/module/Module;I)V, this, n)
    
    public void onDisableR() {
        this.onDisable();
    }
    
    public void toggle() {
        // invokedynamic(6:(Lru/sanchez/micotian/module/Module;Z)V, this, !invokedynamic(8:(Lru/sanchez/micotian/module/Module;)Z, this))
        if (!invokedynamic(9:()Z)) {
            if (invokedynamic(8:(Lru/sanchez/micotian/module/Module;)Z, this)) {
                this.onEnableR();
            }
            else {
                this.onDisableR();
                this.onDisable();
            }
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void onEnable() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        notifications.add(this.name, TextFormatting.GREEN + "Enable!", Type.Green);
    }
    
    protected void onCameraSetup(final EntityViewRenderEvent.CameraSetup cameraSetup) {
    }
    
    public Module(final String name, final Category category) {
        // invokedynamic(0:(Lru/sanchez/micotian/module/Module;Z)V, this, true)
        this.name = name;
        this.description = this.description;
        // invokedynamic(4:(Lru/sanchez/micotian/module/Module;I)V, this, false)
        this.category = category;
    }
    // invokedynamic(6:(Lru/sanchez/micotian/module/Module;Z)V, this, false)
    
    public void onDisable() {
        MinecraftForge.EVENT_BUS.unregister((Object)this);
        notifications.add(this.name, TextFormatting.RED + "Enable!", Type.Red);
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public boolean isToggled() {
        return invokedynamic(8:(Lru/sanchez/micotian/module/Module;)Z, this);
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setToggled(final boolean b) {
        // invokedynamic(6:(Lru/sanchez/micotian/module/Module;Z)V, this, b)
        if (!invokedynamic(9:()Z)) {
            if (invokedynamic(8:(Lru/sanchez/micotian/module/Module;)Z, this)) {
                this.onEnable();
            }
            else {
                this.onDisable();
            }
        }
    }
    
    static {
        Module.mc = Minecraft.getMinecraft();
    }
    
    public void onEnableR() {
        this.onEnable();
    }
    
    public int getKey() {
        return invokedynamic(7:(Lru/sanchez/micotian/module/Module;)I, this);
    }
}

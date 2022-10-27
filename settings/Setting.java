//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.settings;

import ru.sanchez.micotian.module.*;
import java.util.*;

public class Setting extends Castom.setting.Setting
{
    private Module parent;
    private String name;
    private double min;
    private ArrayList options;
    private boolean onlyint;
    private double dval;
    private String sval;
    private String mode;
    private boolean bval;
    private double max;
    
    public boolean onlyInt() {
        return invokedynamic(15:(Lru/sanchez/micotian/settings/Setting;)Z, this);
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getMax() {
        return invokedynamic(18:(Lru/sanchez/micotian/settings/Setting;)D, this);
    }
    
    public boolean isCombo() {
        return Integer.valueOf(64305518).equals(this.mode.toUpperCase().hashCode());
    }
    
    public void setValDouble(final double n) {
    }
    // invokedynamic(7:(Lru/sanchez/micotian/settings/Setting;D)V, this, n)
    
    public String getValString() {
        return this.sval;
    }
    
    public Module getParentMod() {
        return this.parent;
    }
    
    public Setting(final String name, final Module parent, final String sval, final ArrayList options) {
        // invokedynamic(0:(Lru/sanchez/micotian/settings/Setting;Z)V, this, false)
        this.name = name;
        this.parent = parent;
        this.sval = sval;
        this.options = options;
        this.mode = "Combo";
    }
    
    public ArrayList getOptions() {
        return this.options;
    }
    
    public void setValBoolean(final boolean b) {
    }
    // invokedynamic(6:(Lru/sanchez/micotian/settings/Setting;Z)V, this, b)
    
    public Setting(final String name, final Module parent, final double n, final double n2, final double n3, final boolean b) {
        // invokedynamic(0:(Lru/sanchez/micotian/settings/Setting;Z)V, this, false)
        this.name = name;
        this.parent = parent;
        // invokedynamic(7:(Lru/sanchez/micotian/settings/Setting;D)V, this, n)
        // invokedynamic(8:(Lru/sanchez/micotian/settings/Setting;D)V, this, n2)
        // invokedynamic(9:(Lru/sanchez/micotian/settings/Setting;D)V, this, n3)
        // invokedynamic(0:(Lru/sanchez/micotian/settings/Setting;Z)V, this, b)
        this.mode = "Slider";
    }
    
    public double getMin() {
        return invokedynamic(17:(Lru/sanchez/micotian/settings/Setting;)D, this);
    }
    
    public Setting(final String name, final Module parent, final boolean b) {
        // invokedynamic(0:(Lru/sanchez/micotian/settings/Setting;Z)V, this, false)
        this.name = name;
        this.parent = parent;
        // invokedynamic(6:(Lru/sanchez/micotian/settings/Setting;Z)V, this, b)
        this.mode = "Check";
    }
    
    public boolean isCheck() {
        return Integer.valueOf(64089320).equals(this.mode.toUpperCase().hashCode());
    }
    
    public void setValString(final String sval) {
        this.sval = sval;
    }
    
    public double getValDouble() {
        if (invokedynamic(15:(Lru/sanchez/micotian/settings/Setting;)Z, this)) {
        }
        // invokedynamic(7:(Lru/sanchez/micotian/settings/Setting;D)V, this, (double)(int)invokedynamic(16:(Lru/sanchez/micotian/settings/Setting;)D, this))
        return invokedynamic(16:(Lru/sanchez/micotian/settings/Setting;)D, this);
    }
    
    public boolean isSlider() {
        return Integer.valueOf(-1846317855).equals(this.mode.toUpperCase().hashCode());
    }
    
    public boolean getValBoolean() {
        return invokedynamic(14:(Lru/sanchez/micotian/settings/Setting;)Z, this);
    }
}

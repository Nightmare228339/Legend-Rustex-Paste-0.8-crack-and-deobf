//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Castom.setting;

import ru.sanchez.micotian.module.*;
import java.util.*;

public class Setting
{
    private String mode;
    private boolean onlyint;
    private String sval;
    private double max;
    private double dval;
    private Module parent;
    private double min;
    private ArrayList options;
    private String name;
    private boolean bval;
    
    public String getName() {
        return this.name;
    }
    
    public double getValDouble() {
        if (invokedynamic(0:(LCastom/setting/Setting;)Z, this)) {
        }
        // invokedynamic(2:(LCastom/setting/Setting;D)V, this, (double)(int)invokedynamic(1:(LCastom/setting/Setting;)D, this))
        return invokedynamic(1:(LCastom/setting/Setting;)D, this);
    }
    
    public ArrayList getOptions() {
        return this.options;
    }
    
    public String getValString() {
        return this.sval;
    }
    
    public boolean isCheck() {
        return Integer.valueOf(64089320).equals(this.mode.toUpperCase().hashCode());
    }
    
    public double getMin() {
        return invokedynamic(3:(LCastom/setting/Setting;)D, this);
    }
    
    public boolean isCombo() {
        return Integer.valueOf(64305518).equals(this.mode.toUpperCase().hashCode());
    }
    
    public Setting(final String name, final Module parent, final boolean b) {
        // invokedynamic(11:(LCastom/setting/Setting;Z)V, this, false)
        this.name = name;
        this.parent = parent;
        // invokedynamic(14:(LCastom/setting/Setting;Z)V, this, b)
        this.mode = "Check";
    }
    
    public double getMax() {
        return invokedynamic(23:(LCastom/setting/Setting;)D, this);
    }
    
    public Setting() {
    }
    // invokedynamic(11:(LCastom/setting/Setting;Z)V, this, false)
    
    public boolean onlyInt() {
        return invokedynamic(0:(LCastom/setting/Setting;)Z, this);
    }
    
    public Module getParentMod() {
        return this.parent;
    }
    
    public void setValBoolean(final boolean b) {
    }
    // invokedynamic(14:(LCastom/setting/Setting;Z)V, this, b)
    
    public Setting(final String name, final Module parent, final double n, final double n2, final double n3, final boolean b) {
        // invokedynamic(11:(LCastom/setting/Setting;Z)V, this, false)
        this.name = name;
        this.parent = parent;
        // invokedynamic(2:(LCastom/setting/Setting;D)V, this, n)
        // invokedynamic(17:(LCastom/setting/Setting;D)V, this, n2)
        // invokedynamic(18:(LCastom/setting/Setting;D)V, this, n3)
        // invokedynamic(11:(LCastom/setting/Setting;Z)V, this, b)
        this.mode = "Slider";
    }
    
    public void setValDouble(final double n) {
    }
    // invokedynamic(2:(LCastom/setting/Setting;D)V, this, n)
    
    public boolean isSlider() {
        return Integer.valueOf(-1846317855).equals(this.mode.toUpperCase().hashCode());
    }
    
    public boolean getValBoolean() {
        return invokedynamic(19:(LCastom/setting/Setting;)Z, this);
    }
    
    public Setting(final String name, final Module parent, final String sval, final ArrayList options) {
        // invokedynamic(11:(LCastom/setting/Setting;Z)V, this, false)
        this.name = name;
        this.parent = parent;
        this.sval = sval;
        this.options = options;
        this.mode = "Combo";
    }
    
    public void setValString(final String sval) {
        this.sval = sval;
    }
}

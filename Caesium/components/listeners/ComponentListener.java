//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components.listeners;

import java.util.*;
import Caesium.components.*;

public abstract class ComponentListener
{
    private final ArrayList components;
    
    public ArrayList getComponents() {
        return this.components;
    }
    
    public ComponentListener() {
        this.components = new ArrayList();
    }
    
    public abstract void addComponents();
    
    protected void add(final GuiComponent e) {
        this.components.add(e);
    }
    
    public void clearComponents() {
        this.components.clear();
    }
}

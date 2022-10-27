//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.settings;

import ru.sanchez.micotian.module.*;
import java.util.*;

public class SettingsManager
{
    private ArrayList settings;
    
    public void fSetting(final Setting e) {
        this.settings.add(e);
    }
    
    public SettingsManager() {
        this.settings = new ArrayList();
    }
    
    public ArrayList getSettingsByMod(final Module obj) {
        final ArrayList<Setting> list = new ArrayList<Setting>();
        final Iterator<Setting> iterator = this.getSettings().iterator();
        if (iterator.hasNext()) {
            final Setting e = iterator.next();
            if (e.getParentMod().equals(obj)) {
                list.add(e);
            }
            return null;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
    
    public ArrayList getSettings() {
        return this.settings;
    }
    
    public Setting getSettingByName(final Module module, final String str) {
        final Iterator<Setting> iterator = (Iterator<Setting>)this.getSettings().iterator();
        if (!iterator.hasNext()) {
            System.err.println("[Tutorial] Error Setting NOT found: '" + str + "'!");
            return null;
        }
        final Setting setting = iterator.next();
        if (Integer.valueOf(str.toUpperCase().hashCode()).equals(setting.getName().toUpperCase().hashCode()) && setting.getParentMod() == module) {
            return setting;
        }
        return null;
    }
    
    public Setting getSettingByName(final String str, final String s) {
        final Iterator<Setting> iterator = (Iterator<Setting>)this.getSettings().iterator();
        if (!iterator.hasNext()) {
            System.out.println("Setting not found! (" + str + ").");
            return null;
        }
        final Setting setting = iterator.next();
        if (Integer.valueOf(str.toUpperCase().hashCode()).equals(setting.getName().toUpperCase().hashCode())) {
            return setting;
        }
        return null;
    }
    
    public void rSetting(final Setting e) {
        this.settings.add(e);
    }
}

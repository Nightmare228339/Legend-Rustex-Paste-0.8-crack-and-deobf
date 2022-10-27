//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module;

public enum Category
{
    HUD("HUD", 4), 
    RENDER("RENDER", 2), 
    MOVEMENT("MOVEMENT", 1), 
    OUTHER("OUTHER", 3), 
    COMBAT("COMBAT", 0), 
    EXPLOIT("EXPLOIT", 5);
    
    private static final Category[] $VALUES;
    
    static {
        $VALUES = new Category[] { Category.COMBAT, Category.MOVEMENT, Category.RENDER, Category.OUTHER, Category.HUD, Category.EXPLOIT };
    }
    
    private Category(final String name, final int ordinal) {
    }
}

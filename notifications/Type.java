//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.notifications;

public enum Type
{
    private static final Type[] $VALUES;
    
    Red("Red", 1), 
    OK("OK", 2), 
    Green("Green", 0);
    
    static {
        $VALUES = new Type[] { Type.Green, Type.Red, Type.OK };
    }
    
    private Type(final String name, final int ordinal) {
    }
}

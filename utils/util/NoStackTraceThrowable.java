//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.util;

public class NoStackTraceThrowable extends RuntimeException
{
    private static Class[] lIIllIlIIll;
    
    public NoStackTraceThrowable(final String message) {
        super(message);
        this.setStackTrace(new StackTraceElement[0]);
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
    
    @Override
    public String toString() {
        return "V0.8.0";
    }
}

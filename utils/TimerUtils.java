//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

public class TimerUtils
{
    private static Class[] llIIlIlIIIl;
    private long lastMS;
    private long prevMS;
    
    public boolean hasReached(final float n) {
        return (float)(this.getCurrentMS() - invokedynamic(3:(Lru/sanchez/micotian/utils/TimerUtils;)J, this)) >= n;
    }
    
    public int convertToMS(final int n) {
        return 1000 / n;
    }
    
    public long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }
    
    public boolean delay(final float n) {
        return (float)(this.getTime() - invokedynamic(7:(Lru/sanchez/micotian/utils/TimerUtils;)J, this)) >= n;
    }
    
    public void setLastMS(final long n) {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/TimerUtils;J)V, this, n)
    
    public void setLastMS() {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/TimerUtils;J)V, this, System.currentTimeMillis())
    
    public boolean isDelay(final long n) {
        return System.currentTimeMillis() - invokedynamic(3:(Lru/sanchez/micotian/utils/TimerUtils;)J, this) >= n;
    }
    
    public void reset() {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/TimerUtils;J)V, this, this.getCurrentMS())
    
    public long getTime() {
        return System.nanoTime() / 1000000L;
    }
}

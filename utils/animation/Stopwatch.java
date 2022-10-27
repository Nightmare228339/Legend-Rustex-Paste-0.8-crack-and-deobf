//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.animation;

public final class Stopwatch
{
    private static Class[] lIIllllIIll;
    private long ms;
    
    public final long getElapsedTime() {
        return this.getCurrentMS() - invokedynamic(2:(Lru/sanchez/micotian/utils/animation/Stopwatch;)J, this);
    }
    
    public final boolean elapsed(final long n) {
        return this.getCurrentMS() - invokedynamic(2:(Lru/sanchez/micotian/utils/animation/Stopwatch;)J, this) > n;
    }
    
    public final void reset() {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/animation/Stopwatch;J)V, this, this.getCurrentMS())
    
    private long getCurrentMS() {
        return System.currentTimeMillis();
    }
}

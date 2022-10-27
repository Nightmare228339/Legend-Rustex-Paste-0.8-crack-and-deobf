//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

public abstract class BasicTask implements Task
{
    private String name;
    private int priority;
    private boolean online;
    
    @Override
    public void setOnline(final boolean b) {
    }
    // invokedynamic(3:(Lru/sanchez/micotian/utils/BasicTask;Z)V, this, b)
    
    public void setPriority(final int n) {
    }
    // invokedynamic(1:(Lru/sanchez/micotian/utils/BasicTask;I)V, this, n)
    
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public boolean isOnline() {
        return invokedynamic(2:(Lru/sanchez/micotian/utils/BasicTask;)Z, this);
    }
    
    public String getName() {
        return this.name;
    }
    
    public BasicTask(final String name, final int n) {
        this.name = name;
    }
    // invokedynamic(1:(Lru/sanchez/micotian/utils/BasicTask;I)V, this, n)
    
    public int getPriority() {
        return invokedynamic(5:(Lru/sanchez/micotian/utils/BasicTask;)I, this);
    }
}

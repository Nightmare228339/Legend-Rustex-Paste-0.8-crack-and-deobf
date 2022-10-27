//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

public class Rotation implements Wrapper
{
    private final Rotate rotate;
    private float yaw;
    private float pitch;
    
    public Rotation(final float n, final float n2) {
        this(n, n2, Rotate.NONE);
    }
    
    public float getYaw() {
        return invokedynamic(3:(Lru/sanchez/micotian/utils/Rotation;)F, this);
    }
    
    public float getPitch() {
        return invokedynamic(4:(Lru/sanchez/micotian/utils/Rotation;)F, this);
    }
    
    public Rotation(final float n, final float n2, final Rotate rotate) {
        // invokedynamic(0:(Lru/sanchez/micotian/utils/Rotation;F)V, this, n)
        // invokedynamic(1:(Lru/sanchez/micotian/utils/Rotation;F)V, this, n2)
        this.rotate = rotate;
    }
    
    public void setYaw(final float n) {
    }
    // invokedynamic(0:(Lru/sanchez/micotian/utils/Rotation;F)V, this, n)
    
    public boolean isValid() {
        return !Float.isNaN(this.getYaw()) && !Float.isNaN(this.getPitch());
    }
    
    public Rotate getRotation() {
        return this.rotate;
    }
    
    public void setPitch(final float n) {
    }
    // invokedynamic(1:(Lru/sanchez/micotian/utils/Rotation;F)V, this, n)
    
    public enum Rotate
    {
        CLIENT("CLIENT", 1), 
        PACKET("PACKET", 0);
        
        private static final Rotate[] $VALUES;
        
        NONE("NONE", 2);
        
        private Rotate(final String name, final int ordinal) {
        }
        
        static {
            $VALUES = new Rotate[] { Rotate.PACKET, Rotate.CLIENT, Rotate.NONE };
        }
    }
}

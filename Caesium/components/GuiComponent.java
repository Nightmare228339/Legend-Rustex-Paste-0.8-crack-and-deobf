//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

public interface GuiComponent
{
    boolean allowScroll();
    
    int getHeight();
    
    void keyTyped(final int p0, final char p1);
    
    int getWidth();
    
    void mouseClicked(final int p0, final int p1, final int p2);
    
    void render(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
}

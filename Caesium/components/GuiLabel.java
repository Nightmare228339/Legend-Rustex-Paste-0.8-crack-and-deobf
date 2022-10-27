//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

import Caesium.*;

public class GuiLabel implements GuiComponent
{
    private String text;
    
    public int getHeight() {
        return invokedynamic(6:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2;
    }
    
    public void render(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        Panel.fR.drawStringWithShadow(this.text, (float)(n + n3 / 2 - Panel.fR.getStringWidth(this.text) / 2), (float)(n2 + 2), invokedynamic(4:()I));
    }
    
    public int getWidth() {
        return Panel.fR.getStringWidth(this.text) + 4;
    }
    
    public boolean allowScroll() {
        return true;
    }
    
    public void keyTyped(final int n, final char c) {
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
    }
    
    public GuiLabel(final String text) {
        this.text = text;
    }
}

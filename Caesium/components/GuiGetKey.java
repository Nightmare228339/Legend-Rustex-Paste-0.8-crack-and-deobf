//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

import org.lwjgl.input.*;
import Caesium.*;
import Caesium.util.*;
import Caesium.components.listeners.*;
import java.util.*;

public class GuiGetKey implements GuiComponent
{
    private int posX;
    private ArrayList keylisteners;
    private String text;
    private boolean wasChanged;
    private int posY;
    private boolean allowChange;
    private int key;
    private int width;
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        Keyboard.getKeyName(invokedynamic(12:(LCaesium/components/GuiGetKey;)I, this));
        Panel.fR.getStringWidth(this.text);
    }
    // invokedynamic(29:(LCaesium/components/GuiGetKey;Z)V, this, RenderUtil.isHovered(invokedynamic(26:(LCaesium/components/GuiGetKey;)I, this), invokedynamic(27:(LCaesium/components/GuiGetKey;)I, this), invokedynamic(23:(LCaesium/components/GuiGetKey;)I, this), 11, n, n2))
    
    public int getHeight() {
        return invokedynamic(34:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 4;
    }
    
    private void renderCaesium(final int n, final int n2) {
        final String keyName = Keyboard.getKeyName(invokedynamic(12:(LCaesium/components/GuiGetKey;)I, this));
        // invokedynamic(16:(LCaesium/components/GuiGetKey;Z)V, this, !invokedynamic(14:(LCaesium/components/GuiGetKey;)Z, this) || !invokedynamic(15:(LCaesium/components/GuiGetKey;)Z, this))
        Panel.fR.drawStringWithShadow(this.text + ":", (float)(n + 3), (float)(n2 + 3), invokedynamic(21:()I));
        if (invokedynamic(15:(LCaesium/components/GuiGetKey;)Z, this)) {
            Panel.fR.drawStringWithShadow(keyName, (float)(n + invokedynamic(23:(LCaesium/components/GuiGetKey;)I, this) - Panel.fR.getStringWidth(keyName) - 3), (float)(n2 + 3), invokedynamic(21:()I));
        }
        else {
            Panel.fR.drawString(keyName, n + invokedynamic(23:(LCaesium/components/GuiGetKey;)I, this) - Panel.fR.getStringWidth(keyName) - 3, n2 + 3, invokedynamic(21:()I));
        }
    }
    
    public boolean allowScroll() {
        return true;
    }
    
    public void render(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        // invokedynamic(5:(LCaesium/components/GuiGetKey;I)V, this, n)
        // invokedynamic(6:(LCaesium/components/GuiGetKey;I)V, this, n2)
        // invokedynamic(7:(LCaesium/components/GuiGetKey;I)V, this, n3)
        final String theme = Panel.theme;
        int n7 = -1;
        switch (theme.hashCode()) {
            case -2087928939: {
                if (Integer.valueOf(-2087928939).equals(theme.hashCode())) {
                    n7 = 0;
                    break;
                }
                break;
            }
        }
        switch (n7) {
            case 0: {
                this.renderCaesium(n, n2);
                break;
            }
        }
    }
    
    public void addKeyListener(final KeyListener e) {
        this.keylisteners.add(e);
    }
    
    public int getWidth() {
        return Panel.fR.getStringWidth(this.text + Keyboard.getKeyName(invokedynamic(12:(LCaesium/components/GuiGetKey;)I, this))) + 15;
    }
    
    public void keyTyped(final int n, final char c) {
        if (invokedynamic(14:(LCaesium/components/GuiGetKey;)Z, this)) {
            final Iterator<KeyListener> iterator = this.keylisteners.iterator();
            if (iterator.hasNext()) {
                iterator.next().keyChanged(n);
                return;
            }
        }
        // invokedynamic(2:(LCaesium/components/GuiGetKey;I)V, this, n)
        // invokedynamic(29:(LCaesium/components/GuiGetKey;Z)V, this, false)
    }
    
    public GuiGetKey(final String text, final int n) {
        this.keylisteners = new ArrayList();
        this.text = text;
        // invokedynamic(2:(LCaesium/components/GuiGetKey;I)V, this, n)
        if (n < 0) {
        }
        // invokedynamic(2:(LCaesium/components/GuiGetKey;I)V, this, false)
    }
}

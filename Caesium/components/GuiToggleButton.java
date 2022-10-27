//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

import Caesium.*;
import ru.sanchez.micotian.module.hud.*;
import java.awt.*;
import ru.sanchez.micotian.utils.*;
import java.awt.event.*;
import java.util.*;

public class GuiToggleButton implements GuiComponent
{
    private String text;
    private int posY;
    private boolean toggled;
    private ArrayList clickListeners;
    private int posX;
    
    public void keyTyped(final int n, final char c) {
    }
    
    public boolean allowScroll() {
        return true;
    }
    
    public int getHeight() {
        return invokedynamic(29:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 5;
    }
    
    private void renderCaesium(final int n, final int n2) {
        RenderUtil.drawFilledCircle(n + 8, n2 + 7, 6.0f, new Color(ClickGUI.getColor()));
        if (!invokedynamic(10:(LCaesium/components/GuiToggleButton;)Z, this)) {
            RenderUtil.drawFilledCircle(n + 8, n2 + 7, 5.0f, new Color(invokedynamic(11:()I)));
        }
        Panel.fR.drawStringWithShadow(this.text, (float)(n + 17), (float)(n2 + 3), invokedynamic(14:()I));
    }
    
    public int getWidth() {
        return Panel.fR.getStringWidth(this.text) + 20;
    }
    
    public void render(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        // invokedynamic(2:(LCaesium/components/GuiToggleButton;I)V, this, n)
        // invokedynamic(3:(LCaesium/components/GuiToggleButton;I)V, this, n2)
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
    
    public void addClickListener(final ActionListener e) {
        this.clickListeners.add(e);
    }
    
    public GuiToggleButton(final String text) {
        this.clickListeners = new ArrayList();
        this.text = text;
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        if (Caesium.util.RenderUtil.isHovered(invokedynamic(17:(LCaesium/components/GuiToggleButton;)I, this), invokedynamic(18:(LCaesium/components/GuiToggleButton;)I, this) + 2, Panel.fR.getStringWidth(this.text) + 10, this.getHeight(), n, n2)) {
            // invokedynamic(21:(LCaesium/components/GuiToggleButton;Z)V, this, !invokedynamic(10:(LCaesium/components/GuiToggleButton;)Z, this))
            final Iterator<ActionListener> iterator = this.clickListeners.iterator();
            if (iterator.hasNext()) {
                iterator.next().actionPerformed(new ActionEvent(this, this.hashCode(), "click", System.currentTimeMillis(), 0));
            }
        }
    }
    
    public boolean isToggled() {
        return invokedynamic(10:(LCaesium/components/GuiToggleButton;)Z, this);
    }
    
    public void setToggled(final boolean b) {
    }
    // invokedynamic(21:(LCaesium/components/GuiToggleButton;Z)V, this, b)
}

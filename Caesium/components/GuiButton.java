//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

import Caesium.util.*;
import java.awt.event.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.module.hud.*;
import Caesium.*;
import Caesium.components.listeners.*;
import java.util.*;

public class GuiButton implements GuiComponent
{
    private int id;
    private int width;
    public static int expandedID;
    private int textWidth;
    private ArrayList guiComponents;
    private int posY;
    private int posX;
    private ArrayList clickListeners;
    private String text;
    
    @Override
    public boolean allowScroll() {
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        // invokedynamic(9:(LCaesium/components/GuiButton;I)V, this, n)
        // invokedynamic(10:(LCaesium/components/GuiButton;I)V, this, n2)
        // invokedynamic(11:(LCaesium/components/GuiButton;I)V, this, n3)
        this.renderCaesium(n, n2, n3, this.getHeight());
    }
    
    @Override
    public void mouseClicked(final int n, final int n2, final int n3) {
        if (invokedynamic(23:()I) == -1 && RenderUtil.isHovered(invokedynamic(24:(LCaesium/components/GuiButton;)I, this), invokedynamic(25:(LCaesium/components/GuiButton;)I, this), invokedynamic(26:(LCaesium/components/GuiButton;)I, this), this.getHeight(), n, n2)) {
            if (n3 != 1) {
                if (n3 == 0) {
                    final Iterator<ActionListener> iterator = this.clickListeners.iterator();
                    if (iterator.hasNext()) {
                        iterator.next().actionPerformed(new ActionEvent((Object)this, invokedynamic(29:(LCaesium/components/GuiButton;)I, this), "click", System.currentTimeMillis(), 0));
                        return;
                    }
                }
            }
        }
        if (invokedynamic(28:()I) == invokedynamic(29:(LCaesium/components/GuiButton;)I, this)) {
            final Iterator<GuiComponent> iterator2 = this.guiComponents.iterator();
            if (iterator2.hasNext()) {
                iterator2.next().mouseClicked(n, n2, n3);
            }
        }
    }
    
    public void addClickListener(final ActionListener e) {
        this.clickListeners.add(e);
    }
    
    public String getText() {
        return this.text;
    }
    
    private void renderCaesium(final int n, final int n2, final int n3, final int n4) {
        RenderUtil.drawRect(n, n2, n + n3 - 1, n2 + n4, invokedynamic(13:()I));
        int color = invokedynamic(15:()I);
        final Micotian instance = Micotian.instance;
        if (Micotian.moduleManager.getModule(this.getText()).isToggled()) {
            color = ClickGUI.getColor();
        }
        Panel.fR.drawStringWithShadow(this.getText(), (float)(n + n3 / 2 - Panel.fR.getStringWidth(this.getText()) / 2), (float)(n2 + 2), color);
    }
    
    @Override
    public void keyTyped(final int n, final char c) {
        if (invokedynamic(28:()I) == invokedynamic(29:(LCaesium/components/GuiButton;)I, this)) {
            final Iterator<GuiComponent> iterator = this.guiComponents.iterator();
            if (iterator.hasNext()) {
                iterator.next().keyTyped(n, c);
            }
        }
    }
    
    public ArrayList getComponents() {
        return this.guiComponents;
    }
    
    public int getButtonID() {
        return invokedynamic(29:(LCaesium/components/GuiButton;)I, this);
    }
    
    public void addExtendListener(final ComponentListener componentListener) {
        componentListener.addComponents();
        this.guiComponents.addAll(componentListener.getComponents());
    }
    
    @Override
    public int getWidth() {
        return 5 + invokedynamic(40:(LCaesium/components/GuiButton;)I, this);
    }
    
    @Override
    public int getHeight() {
        return invokedynamic(41:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 3;
    }
    
    public GuiButton(final String text) {
        this.clickListeners = new ArrayList();
        this.guiComponents = new ArrayList();
        this.text = text;
        // invokedynamic(5:(LCaesium/components/GuiButton;I)V, this, Panel.fR.getStringWidth(text))
        final int n = invokedynamic(6:()I) + 1;
    }
    // invokedynamic(7:(I)V, n)
    // invokedynamic(8:(LCaesium/components/GuiButton;I)V, this, n)
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

import java.util.*;
import Caesium.*;
import ru.sanchez.micotian.module.hud.*;
import org.lwjgl.input.*;
import ru.sanchez.micotian.utils.*;

public class GuiFrame implements Frame
{
    private ArrayList buttons;
    public static int dragID;
    private int prevPosY;
    private boolean isExpaned;
    private int posY;
    private int id;
    private boolean isDragging;
    private int scrollHeight;
    private String title;
    private int prevPosX;
    private int posX;
    
    public boolean isExpaned() {
        return invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this);
    }
    
    public void keyTyped(final int n, final char c) {
        if (invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this)) {
            final Iterator<GuiButton> iterator = this.buttons.iterator();
            if (iterator.hasNext()) {
                iterator.next().keyTyped(n, c);
            }
        }
    }
    
    public void render(final int n, final int n2) {
        final String theme = Panel.theme;
        int n3 = -1;
        switch (theme.hashCode()) {
            case -2087928939: {
                if (Integer.valueOf(-2087928939).equals(theme.hashCode())) {
                    n3 = 0;
                    break;
                }
                break;
            }
        }
        switch (n3) {
            case 0: {
                this.renderCaesium(n, n2);
                break;
            }
        }
    }
    
    public int getPosY() {
        return invokedynamic(33:(LCaesium/components/GuiFrame;)I, this);
    }
    
    public int getPosX() {
        return invokedynamic(32:(LCaesium/components/GuiFrame;)I, this);
    }
    
    public int getButtonID() {
        return invokedynamic(24:(LCaesium/components/GuiFrame;)I, this);
    }
    
    public GuiFrame(final String title, final int n, final int n2, final boolean b) {
        this.buttons = new ArrayList();
        this.title = title;
        // invokedynamic(2:(LCaesium/components/GuiFrame;I)V, this, n)
        // invokedynamic(3:(LCaesium/components/GuiFrame;I)V, this, n2)
        // invokedynamic(4:(LCaesium/components/GuiFrame;Z)V, this, b)
        final int n3 = invokedynamic(5:()I) + 1;
    }
    // invokedynamic(6:(I)V, n3)
    // invokedynamic(7:(LCaesium/components/GuiFrame;I)V, this, n3)
    // invokedynamic(8:(LCaesium/components/GuiFrame;I)V, this, false)
    
    public void initialize() {
    }
    
    public void addButton(final GuiButton guiButton) {
        if (!this.buttons.contains(guiButton)) {
            this.buttons.add(guiButton);
        }
    }
    
    private void renderCaesium(final int n, final int n2) {
        final int color = ClickGUI.getColor();
        final int n3 = invokedynamic(14:()I);
        final int max = Math.max(invokedynamic(15:()I), Panel.fR.getStringWidth(this.title) + 15);
        if (invokedynamic(20:(LCaesium/components/GuiFrame;)Z, this) && Mouse.isButtonDown(0)) {
        }
        // invokedynamic(2:(LCaesium/components/GuiFrame;I)V, this, n - invokedynamic(22:(LCaesium/components/GuiFrame;)I, this))
        // invokedynamic(3:(LCaesium/components/GuiFrame;I)V, this, n2 - invokedynamic(23:(LCaesium/components/GuiFrame;)I, this))
        // invokedynamic(25:(I)V, invokedynamic(24:(LCaesium/components/GuiFrame;)I, this))
        else {
        }
        // invokedynamic(26:(LCaesium/components/GuiFrame;Z)V, this, false)
        // invokedynamic(25:(I)V, -1)
        final Iterator<GuiButton> iterator = this.buttons.iterator();
        if (iterator.hasNext()) {
            Math.max(max, iterator.next().getWidth() + 15);
            return;
        }
        RenderUtil.drawVGradientRect((float)(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + 1), (float)(invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) - 5), (float)(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max), (float)(invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + 12), ClickGUI.getColor(), ClickGUI.getColor2());
        Panel.fR.drawStringWithShadow(this.title, (float)(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max / 2 - Panel.fR.getStringWidth(this.title) / 2), (float)invokedynamic(33:(LCaesium/components/GuiFrame;)I, this), n3);
        Panel.fR.drawStringWithShadow(invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this) ? "-" : "+", (float)(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max - Panel.fR.getStringWidth(invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this) ? "-" : "+") - 4), (float)invokedynamic(33:(LCaesium/components/GuiFrame;)I, this), n3);
        if (invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this)) {
            final int n4 = 0;
            // invokedynamic(38:()I)
            final Iterator<GuiButton> iterator2 = this.buttons.iterator();
            if (iterator2.hasNext()) {
                final GuiButton guiButton = iterator2.next();
                guiButton.render(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + 1, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 12, max, n, n2, 0);
                final ArrayList components;
                if (guiButton.getButtonID() == invokedynamic(41:()I) && !(components = guiButton.getComponents()).isEmpty()) {
                    final int a = 10;
                    final int n5 = 0;
                    final boolean b = true;
                    final Iterator<GuiComponent> iterator3 = components.iterator();
                    if (iterator3.hasNext()) {
                        final GuiComponent guiComponent = iterator3.next();
                        Math.max(a, guiComponent.getWidth());
                        final int n6 = n5 + guiComponent.getHeight();
                        if (guiComponent.allowScroll()) {
                            return;
                        }
                        return;
                    }
                    else {
                        final int n7 = invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max + 2;
                        final int n8 = n7 + a;
                        final int n9 = invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 12;
                        final int n10 = n9 + n5 + 1;
                        int n11 = Mouse.getDWheel() * -1 / 8;
                        if (n10 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this) < 30) {
                            n11 *= -1;
                        }
                        // invokedynamic(8:(LCaesium/components/GuiFrame;I)V, this, invokedynamic(48:(LCaesium/components/GuiFrame;)I, this) + 10)
                        if (b) {
                        }
                        // invokedynamic(8:(LCaesium/components/GuiFrame;I)V, this, invokedynamic(48:(LCaesium/components/GuiFrame;)I, this) + n11)
                        Caesium.util.RenderUtil.drawRect(n7 + 1, n9 + 1 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), n8, n10 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), invokedynamic(49:()I));
                        final int n12 = 0;
                        final Iterator<GuiComponent> iterator4 = components.iterator();
                        if (iterator4.hasNext()) {
                            final GuiComponent guiComponent2 = iterator4.next();
                            guiComponent2.render(n7, n9 + n12 + 2 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), a, n, n2, n11);
                            final int n13 = n12 + guiComponent2.getHeight();
                            return;
                        }
                        Caesium.util.RenderUtil.drawVerticalLine(n7, n9 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), n10 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), color);
                        Caesium.util.RenderUtil.drawVerticalLine(n8, n9 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), n10 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), color);
                        Caesium.util.RenderUtil.drawHorizontalLine(n7, n8, n9 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), color);
                        Caesium.util.RenderUtil.drawHorizontalLine(n7, n8, n10 + invokedynamic(48:(LCaesium/components/GuiFrame;)I, this), color);
                    }
                }
                final int n14 = n4 + guiButton.getHeight();
                return;
            }
            Caesium.util.RenderUtil.drawHorizontalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + 1, invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max - 1, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 12, color);
            Caesium.util.RenderUtil.drawVerticalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) - 5, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 14, invokedynamic(49:()I));
            Caesium.util.RenderUtil.drawVerticalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) - 4, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 14, invokedynamic(49:()I));
            Caesium.util.RenderUtil.drawVerticalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max + 1, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) - 4, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 15, invokedynamic(49:()I));
            Caesium.util.RenderUtil.drawHorizontalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + 2, invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max - 1, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 13, invokedynamic(49:()I));
            Caesium.util.RenderUtil.drawHorizontalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + 2, invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max - 1, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 13, invokedynamic(49:()I));
            Caesium.util.RenderUtil.drawHorizontalLine(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + 3, invokedynamic(32:(LCaesium/components/GuiFrame;)I, this) + max, invokedynamic(33:(LCaesium/components/GuiFrame;)I, this) + n4 + 14, invokedynamic(49:()I));
        }
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        final int a = invokedynamic(15:()I);
        if (invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this)) {
            final Iterator<GuiButton> iterator = this.buttons.iterator();
            if (iterator.hasNext()) {
                final GuiButton guiButton = iterator.next();
                Math.max(a, guiButton.getWidth());
                guiButton.mouseClicked(n, n2, n3);
                return;
            }
        }
        if (Caesium.util.RenderUtil.isHovered(invokedynamic(32:(LCaesium/components/GuiFrame;)I, this), invokedynamic(33:(LCaesium/components/GuiFrame;)I, this), a, 13, n, n2)) {
            if (n3 != 0) {
                if (n3 == 1) {
                }
                // invokedynamic(4:(LCaesium/components/GuiFrame;Z)V, this, !invokedynamic(37:(LCaesium/components/GuiFrame;)Z, this))
                // invokedynamic(8:(LCaesium/components/GuiFrame;I)V, this, false)
                // invokedynamic(26:(LCaesium/components/GuiFrame;Z)V, this, false)
                // invokedynamic(25:(I)V, -1)
            }
        }
    }
    
    public String getTitle() {
        return this.title;
    }
}

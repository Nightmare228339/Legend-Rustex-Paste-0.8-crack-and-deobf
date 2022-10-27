//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.components;

import ru.sanchez.micotian.settings.*;
import Caesium.*;
import Caesium.util.*;
import Caesium.components.listeners.*;
import java.util.*;
import java.awt.*;
import ru.sanchez.micotian.module.hud.*;

public class GuiComboBox implements GuiComponent
{
    private Setting setting;
    private int posY;
    private boolean extended;
    private int posX;
    private int height;
    private ArrayList comboListeners;
    private int width;
    
    @Override
    public int getHeight() {
        return invokedynamic(45:(LCaesium/components/GuiComboBox;)I, this);
    }
    
    @Override
    public void mouseClicked(final int n, final int n2, final int n3) {
        if (RenderUtil.isHovered(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2, n, n2)) {
            if (invokedynamic(12:(LCaesium/components/GuiComboBox;)Z, this)) {
                final boolean b = false;
            }
        }
        // invokedynamic(40:(LCaesium/components/GuiComboBox;Z)V, this, b)
        if (invokedynamic(12:(LCaesium/components/GuiComboBox;)Z, this) && RenderUtil.isHovered(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2, invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), (invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2) * this.setting.getOptions().size(), n, n2) && n3 == 0) {
            final int n4 = invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2;
            int n5 = 1;
            if (n5 <= this.setting.getOptions().size() + 1) {
                if (RenderUtil.isHovered(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + n4 * n5, invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), n4 * n5, n, n2)) {
                    this.setting.setValString((String)this.setting.getOptions().get(n5 - 1));
                }
                ++n5;
                return;
            }
            final Iterator<ComboListener> iterator = (Iterator<ComboListener>)this.comboListeners.iterator();
            if (iterator.hasNext()) {
                iterator.next().comboChanged(this.setting.getValString());
            }
        }
    }
    
    public void renderCaesium() {
        if (invokedynamic(12:(LCaesium/components/GuiComboBox;)Z, this)) {
            RenderUtil.drawRect(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2, invokedynamic(18:()I));
            RenderUtil.drawHorizontalLine(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(20:()I));
            RenderUtil.drawHorizontalLine(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2, new Color(0, 0, 0, 150).getRGB());
            Panel.fR.drawStringWithShadow(this.setting.getName() + "  -", (float)(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this) / 2 - Panel.fR.getStringWidth(this.setting.getName() + "  -") / 2), (float)(invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + 2), invokedynamic(28:()I));
            final int n = invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 5;
            final Iterator<String> iterator = this.setting.getOptions().iterator();
            if (iterator.hasNext()) {
                final String s = iterator.next();
                if (Integer.valueOf(s.toUpperCase().hashCode()).equals(this.setting.getValString().toUpperCase().hashCode())) {
                    Panel.fR.drawStringWithShadow(s, (float)(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + 10), (float)(invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + n), ClickGUI.getColor());
                }
                else {
                    Panel.fR.drawStringWithShadow(s, (float)(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + 5), (float)(invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + n), invokedynamic(28:()I));
                }
                final int n2 = n + (invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2);
                return;
            }
        }
        // invokedynamic(38:(LCaesium/components/GuiComboBox;I)V, this, n + 2)
        else {
            RenderUtil.drawRect(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2, invokedynamic(18:()I));
            RenderUtil.drawHorizontalLine(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(20:()I));
            RenderUtil.drawHorizontalLine(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this), invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 2, invokedynamic(20:()I));
            Panel.fR.drawStringWithShadow(this.setting.getName() + "  +", (float)(invokedynamic(13:(LCaesium/components/GuiComboBox;)I, this) + invokedynamic(15:(LCaesium/components/GuiComboBox;)I, this) / 2 - Panel.fR.getStringWidth(this.setting.getName() + "  +") / 2), (float)(invokedynamic(14:(LCaesium/components/GuiComboBox;)I, this) + 2), invokedynamic(28:()I));
        }
        // invokedynamic(38:(LCaesium/components/GuiComboBox;I)V, this, invokedynamic(17:(Lnet/minecraft/client/gui/FontRenderer;)I, Panel.fR) + 4)
    }
    
    public void addComboListener(final ComboListener e) {
        this.comboListeners.add(e);
    }
    
    public GuiComboBox(final Setting setting) {
        this.comboListeners = new ArrayList();
        this.setting = setting;
    }
    
    @Override
    public void render(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        // invokedynamic(4:(LCaesium/components/GuiComboBox;I)V, this, n)
        // invokedynamic(5:(LCaesium/components/GuiComboBox;I)V, this, n2)
        // invokedynamic(6:(LCaesium/components/GuiComboBox;I)V, this, n3)
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
                this.renderCaesium();
                break;
            }
        }
    }
    
    @Override
    public void keyTyped(final int n, final char c) {
    }
    
    @Override
    public boolean allowScroll() {
        return true;
    }
    
    public void setSetting(final Setting setting) {
        this.setting = setting;
    }
    
    public Setting getSetting() {
        return this.setting;
    }
    
    @Override
    public int getWidth() {
        return 0;
    }
}

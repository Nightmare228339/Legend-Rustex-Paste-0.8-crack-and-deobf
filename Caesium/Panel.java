//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium;

import net.minecraft.client.gui.*;
import Caesium.util.*;
import java.util.*;
import net.minecraft.client.*;
import ru.sanchez.micotian.module.hud.*;
import java.awt.*;
import ru.sanchez.micotian.*;
import ru.sanchez.micotian.module.*;
import Caesium.components.*;
import java.awt.event.*;
import Caesium.listeners.*;
import Caesium.components.listeners.*;

public class Panel extends ClickGui
{
    public static HashMap framePositions;
    public static int color;
    public static int black100;
    public static int FRAME_WIDTH;
    public static FontRenderer fR;
    public static int fontColor;
    public static String theme;
    public static int grey40_240;
    public static int black195;
    
    public void onGuiClosed() {
        if (!this.getFrames().isEmpty()) {
            final Iterator<Frame> iterator = this.getFrames().iterator();
            if (iterator.hasNext()) {
                final GuiFrame guiFrame = (GuiFrame)iterator.next();
                Panel.framePositions.put(guiFrame.getTitle(), new FramePosition(guiFrame.getPosX(), guiFrame.getPosY(), guiFrame.isExpaned()));
            }
        }
    }
    
    public void initGui() {
        int n = 25;
        this.ref(Category.COMBAT, n);
        final Category movement = Category.MOVEMENT;
        n += 135;
        this.ref(movement, n);
        final Category render = Category.RENDER;
        n += 135;
        this.ref(render, n);
        final Category outher = Category.OUTHER;
        n += 135;
        this.ref(outher, n);
        final Category hud = Category.HUD;
        n += 135;
        this.ref(hud, n);
        final Category exploit = Category.EXPLOIT;
        n += 135;
        this.ref(exploit, n);
        super.initGui();
    }
    
    static {
        Panel.framePositions = new HashMap();
        Panel.fR = Minecraft.getMinecraft().fontRenderer;
    }
    // invokedynamic(33:(I)V, 100)
    // invokedynamic(35:(I)V, ClickGUI.getColor())
    // invokedynamic(38:(I)V, Color.white.getRGB())
    // invokedynamic(39:(I)V, new Color(40, 40, 40, 140).getRGB())
    // invokedynamic(40:(I)V, new Color(0, 0, 0, 195).getRGB())
    // invokedynamic(41:(I)V, new Color(0, 0, 0, 100).getRGB())
    
    public Panel(final String theme, final int n) {
        Panel.theme = theme;
    }
    
    public void ref(final Category category, final int n) {
        final GuiFrame guiFrame = new GuiFrame(category.name(), n, 50, true);
        final Micotian instance = Micotian.instance;
        final Iterator<Module> iterator = (Iterator<Module>)Micotian.moduleManager.modules.iterator();
        if (!iterator.hasNext()) {
            this.addFrame((Frame)guiFrame);
            return;
        }
        final Module module = iterator.next();
        if (category != module.getCategory()) {
            return;
        }
        final GuiButton guiButton = new GuiButton(module.getName());
        guiButton.addClickListener((ActionListener)new ClickListener(guiButton));
        guiButton.addExtendListener((ComponentListener)new ComponentsListener(guiButton));
        guiFrame.addButton(guiButton);
    }
}

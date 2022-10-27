//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium;

import net.minecraft.client.*;
import ru.sanchez.micotian.module.hud.*;
import ru.sanchez.micotian.manager.*;
import java.awt.*;
import ru.sanchez.micotian.utils.*;
import org.lwjgl.input.*;
import java.util.*;
import net.minecraft.client.gui.*;
import Caesium.components.*;
import java.io.*;

public class ClickGui extends GuiScreen
{
    private ArrayList frames;
    private final FontRenderer fr;
    public static int compID;
    
    public ClickGui() {
        this.frames = new ArrayList();
        this.fr = Minecraft.getMinecraft().fontRenderer;
    }
    // invokedynamic(3:(I)V, false)
    
    protected ArrayList getFrames() {
        return this.frames;
    }
    
    public void drawinfo(final int n, final int n2) {
        final int n3 = 600;
        final int n4 = 280;
        final int n5 = 0;
        this.fontRenderer.drawStringWithShadow("Friends", (float)(n3 + this.fontRenderer.getStringWidth("Friends") / 2), (float)(n4 - invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer)), ClickGUI.getColor());
        RenderUtil.drawRect((double)n3, (double)n4, (double)(n3 + 100), (double)(n4 + FriendManager.FRIENDS.size() * invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer)), new Color(50, 50, 50, 190).getRGB());
        RenderUtil.drawNewRect((double)(n3 - 1), (double)n4, (double)n3, (double)(n4 + FriendManager.FRIENDS.size() * invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer)), ClickGUI.getColor());
        RenderUtil.drawNewRect((double)(n3 + 100 - 1), (double)n4, (double)(n3 + 100), (double)(n4 + FriendManager.FRIENDS.size() * invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer)), ClickGUI.getColor());
        RenderUtil.drawGlow((double)n3, (double)(n4 - 1), (double)(n3 + 100), (double)n4, ClickGUI.getColor(), 250.0);
        RenderUtil.drawGlow((double)n3, (double)(n4 + FriendManager.FRIENDS.size() * invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer) - 1), (double)(n3 + 100), (double)(n4 + FriendManager.FRIENDS.size() * invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer)), ClickGUI.getColor(), 250.0);
        final Iterator<String> iterator = FriendManager.FRIENDS.iterator();
        if (iterator.hasNext()) {
            final String s = iterator.next();
            final int n6 = 0 + n3;
            final int n7 = 100 + n3;
            final int n8 = n5 + n4;
            final int n9 = n5 + invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer) + n4;
            if (n > n6 && n < n7 && n2 > n8 && n2 < n9) {
                this.fontRenderer.drawString(s, n3 + 50 - this.fontRenderer.getStringWidth(s) / 2, n5 + n4, ClickGUI.getColor());
                if (Mouse.isButtonDown(1)) {
                    FriendManager.toggleFriend(s);
                    return;
                }
            }
            else {
                this.fontRenderer.drawString(s, n3 + 50 - this.fontRenderer.getStringWidth(s) / 2, n5 + n4, Color.white.getRGB());
            }
            final int n10 = n5 + invokedynamic(15:(Lnet/minecraft/client/gui/FontRenderer;)I, this.fontRenderer);
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        final ScaledResolution scaledResolution = new ScaledResolution(this.mc);
        Gui.drawRect(64, 556, 0, 524, new Color(37, 37, 37, 255).getRGB());
        Gui.drawRect(0, 525, 64, 527, ClickGUI.getColor());
        this.mc.fontRenderer.drawString("ByDenger", 4, 529, invokedynamic(31:()I));
        final Iterator<Frame> iterator = this.frames.iterator();
        if (iterator.hasNext()) {
            iterator.next().render(n, n2);
            this.drawinfo(n, n2);
        }
    }
    
    public void initGui() {
        final Iterator<Frame> iterator = this.frames.iterator();
        if (iterator.hasNext()) {
            iterator.next().initialize();
        }
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) throws IOException {
        final Iterator<Frame> iterator = this.frames.iterator();
        if (iterator.hasNext()) {
            iterator.next().mouseClicked(n, n2, n3);
        }
    }
    
    protected void addFrame(final Frame frame) {
        if (!this.frames.contains(frame)) {
            this.frames.add(frame);
        }
    }
    
    protected void keyTyped(final char c, final int n) throws IOException {
        super.keyTyped(c, n);
        final Iterator<Frame> iterator = this.frames.iterator();
        if (iterator.hasNext()) {
            iterator.next().keyTyped(n, c);
        }
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.font;

import net.minecraft.client.renderer.texture.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.geom.*;
import org.lwjgl.opengl.*;

public class CFont
{
    boolean fractionalMetrics;
    CharData[] charData;
    float imgSize;
    int fontHeight;
    DynamicTexture tex;
    boolean antiAlias;
    Font font;
    int charOffset;
    
    protected DynamicTexture setupTexture(final Font font, final boolean b, final boolean b2, final CharData[] array) {
        final BufferedImage generateFontImage = this.generateFontImage(font, b, b2, array);
        try {
            return new DynamicTexture(generateFontImage);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public void setFractionalMetrics(final boolean b) {
        if (invokedynamic(50:(Lru/sanchez/micotian/font/CFont;)Z, this) != b) {
            // invokedynamic(6:(Lru/sanchez/micotian/font/CFont;Z)V, this, b)
            this.tex = this.setupTexture(this.font, invokedynamic(48:(Lru/sanchez/micotian/font/CFont;)Z, this), b, this.charData);
        }
    }
    
    protected BufferedImage generateFontImage(final Font font, final boolean b, final boolean b2, final CharData[] array) {
        final int n = (int)invokedynamic(12:(Lru/sanchez/micotian/font/CFont;)F, this);
        final BufferedImage bufferedImage = new BufferedImage(n, n, 2);
        final Graphics2D context = (Graphics2D)bufferedImage.getGraphics();
        context.setFont(font);
        context.setColor(new Color(255, 255, 255, 0));
        context.fillRect(0, 0, n, n);
        context.setColor(Color.WHITE);
        context.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, b2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        context.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, b ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        context.setRenderingHint(RenderingHints.KEY_ANTIALIASING, b ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        final FontMetrics fontMetrics = context.getFontMetrics();
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        int n5 = 0;
        if (n5 < array.length) {
            final char c = (char)n5;
            final CharData charData = new CharData();
            final Rectangle2D stringBounds = fontMetrics.getStringBounds(String.valueOf(c), context);
            // invokedynamic(33:(Lru/sanchez/micotian/font/CFont$CharData;I)V, charData, invokedynamic(32:(Ljava/awt/Rectangle;)I, stringBounds.getBounds()) + 8)
            // invokedynamic(35:(Lru/sanchez/micotian/font/CFont$CharData;I)V, charData, invokedynamic(34:(Ljava/awt/Rectangle;)I, stringBounds.getBounds()))
            if (n3 + invokedynamic(36:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData) >= n) {
                n3 = 0;
                n4 += n2;
                n2 = 0;
            }
            if (invokedynamic(37:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData) > n2) {
            }
            // invokedynamic(37:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData)
            // invokedynamic(38:(Lru/sanchez/micotian/font/CFont$CharData;I)V, charData, n3)
            // invokedynamic(39:(Lru/sanchez/micotian/font/CFont$CharData;I)V, charData, n4)
            if (invokedynamic(37:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData) > invokedynamic(40:(Lru/sanchez/micotian/font/CFont;)I, this)) {
            }
            // invokedynamic(2:(Lru/sanchez/micotian/font/CFont;I)V, this, invokedynamic(37:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData))
            array[n5] = charData;
            context.drawString(String.valueOf(c), n3 + 2, n4 + fontMetrics.getAscent());
            final int n6 = n3 + invokedynamic(36:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData);
            ++n5;
            return null;
        }
        return bufferedImage;
    }
    
    public void drawChar(final CharData[] array, final char c, final float n, final float n2) throws ArrayIndexOutOfBoundsException {
        try {
            this.drawQuad(n, n2, (float)invokedynamic(36:(Lru/sanchez/micotian/font/CFont$CharData;)I, array[c]), (float)invokedynamic(37:(Lru/sanchez/micotian/font/CFont$CharData;)I, array[c]), (float)invokedynamic(43:(Lru/sanchez/micotian/font/CFont$CharData;)I, array[c]), (float)invokedynamic(44:(Lru/sanchez/micotian/font/CFont$CharData;)I, array[c]), (float)invokedynamic(36:(Lru/sanchez/micotian/font/CFont$CharData;)I, array[c]), (float)invokedynamic(37:(Lru/sanchez/micotian/font/CFont$CharData;)I, array[c]));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void setAntiAlias(final boolean b) {
        if (invokedynamic(48:(Lru/sanchez/micotian/font/CFont;)Z, this) != b) {
            // invokedynamic(5:(Lru/sanchez/micotian/font/CFont;Z)V, this, b)
            this.tex = this.setupTexture(this.font, b, invokedynamic(50:(Lru/sanchez/micotian/font/CFont;)Z, this), this.charData);
        }
    }
    
    public boolean isFractionalMetrics() {
        return invokedynamic(50:(Lru/sanchez/micotian/font/CFont;)Z, this);
    }
    
    public CFont(final Font font, final boolean b, final boolean b2) {
        // invokedynamic(0:(Lru/sanchez/micotian/font/CFont;F)V, this, 512.0f)
        this.charData = new CharData[256];
        // invokedynamic(2:(Lru/sanchez/micotian/font/CFont;I)V, this, -1)
        // invokedynamic(3:(Lru/sanchez/micotian/font/CFont;I)V, this, false)
        this.font = font;
        // invokedynamic(5:(Lru/sanchez/micotian/font/CFont;Z)V, this, b)
        // invokedynamic(6:(Lru/sanchez/micotian/font/CFont;Z)V, this, b2)
        this.tex = this.setupTexture(font, b, b2, this.charData);
    }
    
    protected void drawQuad(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n5 / invokedynamic(12:(Lru/sanchez/micotian/font/CFont;)F, this);
        final float n10 = n6 / invokedynamic(12:(Lru/sanchez/micotian/font/CFont;)F, this);
        final float n11 = n7 / invokedynamic(12:(Lru/sanchez/micotian/font/CFont;)F, this);
        final float n12 = n8 / invokedynamic(12:(Lru/sanchez/micotian/font/CFont;)F, this);
        GL11.glTexCoord2f(n9 + n11, n10);
        GL11.glVertex2d((double)(n + n3), (double)n2);
        GL11.glTexCoord2f(n9, n10);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glTexCoord2f(n9, n10 + n12);
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glTexCoord2f(n9, n10 + n12);
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glTexCoord2f(n9 + n11, n10 + n12);
        GL11.glVertex2d((double)(n + n3), (double)(n2 + n4));
        GL11.glTexCoord2f(n9 + n11, n10);
        GL11.glVertex2d((double)(n + n3), (double)n2);
    }
    
    public void setFont(final Font font) {
        this.font = font;
        this.tex = this.setupTexture(font, invokedynamic(48:(Lru/sanchez/micotian/font/CFont;)Z, this), invokedynamic(50:(Lru/sanchez/micotian/font/CFont;)Z, this), this.charData);
    }
    
    protected static class CharData
    {
        public int width;
        public int storedX;
        public int height;
        public int storedY;
    }
}

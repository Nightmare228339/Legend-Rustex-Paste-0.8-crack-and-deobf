//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.Font;

import net.minecraft.client.renderer.texture.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.geom.*;
import org.lwjgl.opengl.*;

public class CFont
{
    protected CharData[] charData;
    protected boolean antiAlias;
    private float imgSize;
    protected int charOffset;
    protected Font font;
    protected DynamicTexture tex;
    protected int fontHeight;
    protected boolean fractionalMetrics;
    
    public Font getFont() {
        return this.font;
    }
    
    public int getStringWidth(final String s) {
        final int n = 0;
        final char[] charArray = s.toCharArray();
        final int length = charArray.length;
        int n2 = 0;
        if (n2 < length) {
            final char c = charArray[n2];
            if (c < this.charData.length && c >= '\0') {
                final int n3 = n + (invokedynamic(36:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, this.charData[c]) - 8 + invokedynamic(50:(Lru/sanchez/micotian/utils/Font/CFont;)I, this));
            }
            ++n2;
            return 0;
        }
        return n / 2;
    }
    
    public void setFractionalMetrics(final boolean b) {
        if (invokedynamic(53:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this) != b) {
            // invokedynamic(6:(Lru/sanchez/micotian/utils/Font/CFont;Z)V, this, b)
            this.tex = this.setupTexture(this.font, invokedynamic(51:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this), b, this.charData);
        }
    }
    
    public int getHeight() {
        return (invokedynamic(40:(Lru/sanchez/micotian/utils/Font/CFont;)I, this) - 8) / 2;
    }
    
    public boolean isFractionalMetrics() {
        return invokedynamic(53:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this);
    }
    
    public DynamicTexture setupTexture(final Font font, final boolean b, final boolean b2, final CharData[] array) {
        final BufferedImage generateFontImage = this.generateFontImage(font, b, b2, array);
        try {
            return new DynamicTexture(generateFontImage);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public int getStringHeight(final String s) {
        return this.getHeight();
    }
    
    protected BufferedImage generateFontImage(final Font font, final boolean b, final boolean b2, final CharData[] array) {
        final int n = (int)invokedynamic(12:(Lru/sanchez/micotian/utils/Font/CFont;)F, this);
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
            // invokedynamic(33:(Lru/sanchez/micotian/utils/Font/CFont$CharData;I)V, charData, invokedynamic(32:(Ljava/awt/Rectangle;)I, stringBounds.getBounds()) + 8)
            // invokedynamic(35:(Lru/sanchez/micotian/utils/Font/CFont$CharData;I)V, charData, invokedynamic(34:(Ljava/awt/Rectangle;)I, stringBounds.getBounds()))
            if (n3 + invokedynamic(36:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, charData) >= n) {
                n3 = 0;
                n4 += n2;
                n2 = 0;
            }
            if (invokedynamic(37:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, charData) > n2) {
            }
            // invokedynamic(37:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, charData)
            // invokedynamic(38:(Lru/sanchez/micotian/utils/Font/CFont$CharData;I)V, charData, n3)
            // invokedynamic(39:(Lru/sanchez/micotian/utils/Font/CFont$CharData;I)V, charData, n4)
            if (invokedynamic(37:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, charData) > invokedynamic(40:(Lru/sanchez/micotian/utils/Font/CFont;)I, this)) {
            }
            // invokedynamic(1:(Lru/sanchez/micotian/utils/Font/CFont;I)V, this, invokedynamic(37:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, charData))
            array[n5] = charData;
            context.drawString(String.valueOf(c), n3 + 2, n4 + fontMetrics.getAscent());
            final int n6 = n3 + invokedynamic(36:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, charData);
            ++n5;
            return null;
        }
        return bufferedImage;
    }
    
    public void drawChar(final CharData[] array, final char c, final float n, final float n2) throws ArrayIndexOutOfBoundsException {
        try {
            this.drawQuad(n, n2, (float)invokedynamic(36:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, array[c]), (float)invokedynamic(37:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, array[c]), (float)invokedynamic(43:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, array[c]), (float)invokedynamic(44:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, array[c]), (float)invokedynamic(36:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, array[c]), (float)invokedynamic(37:(Lru/sanchez/micotian/utils/Font/CFont$CharData;)I, array[c]));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public CFont(final Font font, final boolean b, final boolean b2) {
        this.charData = new CharData[256];
        // invokedynamic(1:(Lru/sanchez/micotian/utils/Font/CFont;I)V, this, -1)
        // invokedynamic(2:(Lru/sanchez/micotian/utils/Font/CFont;I)V, this, false)
        // invokedynamic(3:(Lru/sanchez/micotian/utils/Font/CFont;F)V, this, 512.0f)
        this.font = font;
        // invokedynamic(5:(Lru/sanchez/micotian/utils/Font/CFont;Z)V, this, b)
        // invokedynamic(6:(Lru/sanchez/micotian/utils/Font/CFont;Z)V, this, b2)
        this.tex = this.setupTexture(font, b, b2, this.charData);
    }
    
    public void setFont(final Font font) {
        this.font = font;
        this.tex = this.setupTexture(font, invokedynamic(51:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this), invokedynamic(53:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this), this.charData);
    }
    
    protected void drawQuad(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n5 / invokedynamic(12:(Lru/sanchez/micotian/utils/Font/CFont;)F, this);
        final float n10 = n6 / invokedynamic(12:(Lru/sanchez/micotian/utils/Font/CFont;)F, this);
        final float n11 = n7 / invokedynamic(12:(Lru/sanchez/micotian/utils/Font/CFont;)F, this);
        final float n12 = n8 / invokedynamic(12:(Lru/sanchez/micotian/utils/Font/CFont;)F, this);
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
    
    public boolean isAntiAlias() {
        return invokedynamic(51:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this);
    }
    
    public void setAntiAlias(final boolean b) {
        if (invokedynamic(51:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this) != b) {
            // invokedynamic(5:(Lru/sanchez/micotian/utils/Font/CFont;Z)V, this, b)
            this.tex = this.setupTexture(this.font, b, invokedynamic(53:(Lru/sanchez/micotian/utils/Font/CFont;)Z, this), this.charData);
        }
    }
    
    protected class CharData
    {
        public int width;
        public int storedY;
        public int storedX;
        public int height;
        final CFont this$0;
        
        protected CharData(final CFont this$0) {
            this.this$0 = this$0;
        }
    }
}

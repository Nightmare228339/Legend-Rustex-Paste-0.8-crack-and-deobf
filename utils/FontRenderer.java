//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.client.renderer.texture.*;
import org.lwjgl.opengl.*;
import java.util.*;
import java.awt.*;
import net.minecraft.client.renderer.*;

public class FontRenderer extends CFont
{
    protected DynamicTexture texItalicBold;
    protected DynamicTexture texItalic;
    protected DynamicTexture texBold;
    protected CFont.CharData[] italicChars;
    protected CFont.CharData[] boldChars;
    private final int[] colorCode;
    protected CFont.CharData[] boldItalicChars;
    
    public float drawCenteredStringWithShadow(final String s, final double n, final double n2, final int n3) {
        this.drawString(s, n - this.getStringWidth(s) / 2.0f + 0.45, n2 + 0.5, n3, true);
        return this.drawString(s, n - this.getStringWidth(s) / 2.0f, n2, n3);
    }
    
    private void drawLine(final double n, final double n2, final double n3, final double n4, final float n5) {
        GL11.glDisable(3553);
        GL11.glLineWidth(n5);
        GL11.glBegin(1);
        GL11.glVertex2d(n, n2);
        GL11.glVertex2d(n3, n4);
        GL11.glEnd();
        GL11.glEnable(3553);
    }
    
    public int getStringWidthCust(final String s) {
        if (s == null) {
            return 0;
        }
        final int n = 0;
        final CFont.CharData[] charData = this.charData;
        final boolean b = false;
        final boolean b2 = false;
        final int length = s.length();
        int index = 0;
        if (index < length) {
            final char char1 = s.charAt(index);
            if (Integer.valueOf(167).equals(String.valueOf(char1).hashCode()) && index < length) {
                final int index2 = "0123456789abcdefklmnor".indexOf(char1);
                if (index2 >= 16) {
                    if (index2 == 17) {
                        final CFont.CharData[] array = b2 ? this.boldItalicChars : this.boldChars;
                    }
                    else if (index2 == 20) {
                        final CFont.CharData[] array2 = b ? this.boldItalicChars : this.italicChars;
                    }
                    else if (index2 == 21) {
                        final CFont.CharData[] charData2 = this.charData;
                    }
                }
                ++index;
            }
            else if (char1 < charData.length) {
                if (char1 >= '\0') {
                    final int n2 = n + (invokedynamic(40:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 8 + invokedynamic(41:(Lru/sanchez/micotian/utils/FontRenderer;)I, this));
                }
            }
            ++index;
            return 0;
        }
        return (n - invokedynamic(41:(Lru/sanchez/micotian/utils/FontRenderer;)I, this)) / 2;
    }
    
    public List wrapWords(final String e, final double n) {
        final ArrayList<String> list = new ArrayList<String>();
        if (this.getStringWidth(e) > n) {
            final String[] split = e.split(" ");
            final String s = "";
            final char c = '\uffff';
            final String[] array = split;
            final int length = split.length;
            int n2 = 0;
            if (n2 < length) {
                final String str = array[n2];
                int n3 = 0;
                if (n3 < str.toCharArray().length) {
                    if (Integer.valueOf(167).equals(String.valueOf(str.toCharArray()[n3]).hashCode())) {
                        if (n3 < str.toCharArray().length - 1) {
                            final char c2 = str.toCharArray()[n3 + 1];
                        }
                    }
                    ++n3;
                    return null;
                }
                if (this.getStringWidth(s + str + " ") < n) {
                    new StringBuilder().append(s).append(str).append(" ").toString();
                }
                else {
                    list.add(s);
                    new StringBuilder().append("").append(c).append(str).append(" ").toString();
                }
                ++n2;
                return null;
            }
            else if (s.length() > 0) {
                if (this.getStringWidth(s) < n) {
                    list.add("" + c + s + " ");
                }
                else {
                    final Iterator iterator = this.formatString(s, n).iterator();
                    if (iterator.hasNext()) {
                        list.add(iterator.next());
                        return null;
                    }
                }
            }
        }
        else {
            list.add(e);
        }
        return list;
    }
    
    public float drawCenteredStringWithShadow(final String s, final float n, final float n2, final int n3) {
        this.drawString(s, n - this.getStringWidth(s) / 2.0f + 0.45, n2 + 0.5, n3, true);
        return this.drawString(s, n - this.getStringWidth(s) / 2.0f, n2, n3);
    }
    
    private void setupMinecraftColorcodes() {
        int n = 0;
        if (n < 32) {
            final int n2 = (n >> 3 & 0x1) * 85;
            int n3 = (n >> 2 & 0x1) * 170 + n2;
            int n4 = (n >> 1 & 0x1) * 170 + n2;
            int n5 = (n >> 0 & 0x1) * 170 + n2;
            if (n == 6) {
                n3 += 85;
            }
            if (n >= 16) {
                n3 /= 4;
                n4 /= 4;
                n5 /= 4;
            }
            this.colorCode[n] = ((n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | (n5 & 0xFF));
            ++n;
        }
    }
    
    public float drawString(final String s, final double n, final double n2, final int n3) {
        return this.drawString(s, n, n2, n3, false);
    }
    
    public int getStringWidth(final String s) {
        if (s == null) {
            return 0;
        }
        final int n = 0;
        final CFont.CharData[] charData = this.charData;
        final boolean b = false;
        final boolean b2 = false;
        final int length = s.length();
        int index = 0;
        if (index < length) {
            final char char1 = s.charAt(index);
            if (Integer.valueOf(167).equals(String.valueOf(char1).hashCode())) {
                final int index2 = "0123456789abcdefklmnor".indexOf(char1);
                if (index2 >= 16) {
                    if (index2 == 17) {
                        final CFont.CharData[] array = b2 ? this.boldItalicChars : this.boldChars;
                    }
                    else if (index2 == 20) {
                        final CFont.CharData[] array2 = b ? this.boldItalicChars : this.italicChars;
                    }
                    else if (index2 == 21) {
                        final CFont.CharData[] charData2 = this.charData;
                    }
                }
                ++index;
            }
            else if (char1 < charData.length) {
                final int n2 = n + (invokedynamic(40:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 8 + invokedynamic(41:(Lru/sanchez/micotian/utils/FontRenderer;)I, this));
            }
            ++index;
            return 0;
        }
        return n / 2;
    }
    
    private void setupBoldItalicIDs() {
        this.texBold = this.setupTexture(this.font.deriveFont(1), invokedynamic(45:(Lru/sanchez/micotian/utils/FontRenderer;)Z, this), invokedynamic(46:(Lru/sanchez/micotian/utils/FontRenderer;)Z, this), this.boldChars);
        this.texItalic = this.setupTexture(this.font.deriveFont(2), invokedynamic(45:(Lru/sanchez/micotian/utils/FontRenderer;)Z, this), invokedynamic(46:(Lru/sanchez/micotian/utils/FontRenderer;)Z, this), this.italicChars);
        this.texItalicBold = this.setupTexture(this.font.deriveFont(3), invokedynamic(45:(Lru/sanchez/micotian/utils/FontRenderer;)Z, this), invokedynamic(46:(Lru/sanchez/micotian/utils/FontRenderer;)Z, this), this.boldItalicChars);
    }
    
    public float drawCenteredString(final String s, final double n, final double n2, final int n3) {
        return this.drawString(s, n - this.getStringWidth(s) / 2.0f, n2, n3);
    }
    
    public FontRenderer(final Font font, final boolean b, final boolean b2) {
        super(font, b, b2);
        this.boldChars = new CFont.CharData[256];
        this.italicChars = new CFont.CharData[256];
        this.boldItalicChars = new CFont.CharData[256];
        this.colorCode = new int[32];
        this.setupMinecraftColorcodes();
        this.setupBoldItalicIDs();
    }
    
    public float drawStringWithShadow(final String s, final float n, final float n2, final int n3) {
        return Math.max(this.drawString(s, n + 0.5, n2 + 0.5, n3, true), this.drawString(s, n, n2, n3, false));
    }
    
    public void setFont(final Font font) {
        super.setFont(font);
        this.setupBoldItalicIDs();
    }
    
    public float drawStringWithShadow(final String s, final double n, final double n2, final int n3) {
        return Math.max(this.drawString(s, n + 0.5, n2 + 0.5, n3, true), this.drawString(s, n, n2, n3, false));
    }
    
    public float drawCenteredString(final String s, final float n, final float n2, final int n3) {
        return this.drawString(s, n - this.getStringWidth(s) / 2.0f, n2, n3);
    }
    
    public float drawString(final String s, double n, double n2, int n3, final boolean b) {
        --n;
        if (s == null) {
            return 0.0f;
        }
        if (n3 == 553648127) {
            n3 = 16777215;
        }
        if ((n3 & 0xFC000000) == 0x0) {
            n3 |= 0xFF000000;
        }
        if (b) {
            n3 = ((n3 & 0xFCFCFC) >> 2 | (n3 & new Color(20, 20, 20, 200).getRGB()));
        }
        final CFont.CharData[] charData = this.charData;
        final float n4 = (n3 >> 24 & 0xFF) / 255.0f;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        n *= 2.0;
        n2 = (n2 - 3.0) * 2.0;
        GL11.glPushMatrix();
        GlStateManager.scale(0.5, 0.5, 0.5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.color((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n4);
        final int length = s.length();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(this.tex.getGlTextureId());
        GL11.glBindTexture(3553, this.tex.getGlTextureId());
        int index = 0;
        if (index < length) {
            final char char1 = s.charAt(index);
            if (Integer.valueOf(167).equals(String.valueOf(char1).hashCode())) {
                int index2 = 21;
                try {
                    index2 = "0123456789abcdefklmnor".indexOf(s.charAt(index + 1));
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                if (index2 < 16) {
                    GlStateManager.bindTexture(this.tex.getGlTextureId());
                    final CFont.CharData[] charData2 = this.charData;
                    if (index2 < 0) {
                        index2 = 15;
                    }
                    if (b) {
                        index2 += 16;
                    }
                    final int n5 = this.colorCode[index2];
                    GlStateManager.color((n5 >> 16 & 0xFF) / 255.0f, (n5 >> 8 & 0xFF) / 255.0f, (n5 & 0xFF) / 255.0f, n4);
                }
                else if (index2 == 17) {
                    if (b3) {
                        GlStateManager.bindTexture(this.texItalicBold.getGlTextureId());
                        final CFont.CharData[] boldItalicChars = this.boldItalicChars;
                    }
                    else {
                        GlStateManager.bindTexture(this.texBold.getGlTextureId());
                        final CFont.CharData[] boldChars = this.boldChars;
                    }
                }
                else if (index2 != 18) {
                    if (index2 != 19) {
                        if (index2 == 20) {
                            if (b2) {
                                GlStateManager.bindTexture(this.texItalicBold.getGlTextureId());
                                final CFont.CharData[] boldItalicChars2 = this.boldItalicChars;
                            }
                            else {
                                GlStateManager.bindTexture(this.texItalic.getGlTextureId());
                                final CFont.CharData[] italicChars = this.italicChars;
                            }
                        }
                        else if (index2 == 21) {
                            GlStateManager.color((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n4);
                            GlStateManager.bindTexture(this.tex.getGlTextureId());
                            final CFont.CharData[] charData3 = this.charData;
                        }
                    }
                }
                ++index;
            }
            else if (char1 < charData.length) {
                GL11.glBegin(4);
                this.drawChar(charData, char1, (float)n, (float)n2);
                GL11.glEnd();
                if (b4) {
                    this.drawLine(n, n2 + (float)invokedynamic(39:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) / 2.0f, n + (double)invokedynamic(40:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (float)invokedynamic(39:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) / 2.0f, 1.0f);
                }
                if (b5) {
                    this.drawLine(n, n2 + (double)invokedynamic(39:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 2.0, n + (double)invokedynamic(40:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)invokedynamic(39:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 2.0, 1.0f);
                }
                n += (double)(invokedynamic(40:(Lru/sanchez/micotian/utils/CFont$CharData;)I, charData[char1]) - 8 + invokedynamic(41:(Lru/sanchez/micotian/utils/FontRenderer;)I, this));
            }
            ++index;
            return 0.0f;
        }
        GL11.glPopMatrix();
        return (float)n / 2.0f;
    }
    
    public float drawString(final String s, final float n, final float n2, final int n3) {
        return this.drawString(s, n, n2, n3, false);
    }
    
    public void drawCenteredStringWithOutline(final String s, final double n, final double n2, final int n3) {
        this.drawCenteredString(s, n - 0.5, n2, 0);
        this.drawCenteredString(s, n + 0.5, n2, 0);
        this.drawCenteredString(s, n, n2 - 0.5, 0);
        this.drawCenteredString(s, n, n2 + 0.5, 0);
        this.drawCenteredString(s, n, n2, n3);
    }
    
    public void setFractionalMetrics(final boolean fractionalMetrics) {
        super.setFractionalMetrics(fractionalMetrics);
        this.setupBoldItalicIDs();
    }
    
    public List formatString(final String s, final double n) {
        final ArrayList<String> list = new ArrayList<String>();
        final String s2 = "";
        char c = '\uffff';
        final char[] charArray = s.toCharArray();
        int n2 = 0;
        if (n2 < charArray.length) {
            final char c2 = charArray[n2];
            if (Integer.valueOf(167).equals(String.valueOf(c2).hashCode()) && n2 < charArray.length - 1) {
                c = charArray[n2 + 1];
            }
            if (this.getStringWidth(s2 + c2) < n) {
                new StringBuilder().append(s2).append(c2).toString();
            }
            else {
                list.add(s2);
                new StringBuilder().append("").append(c).append(c2).toString();
            }
            ++n2;
            return null;
        }
        if (s2.length() > 0) {
            list.add(s2);
        }
        return list;
    }
    
    public void setAntiAlias(final boolean antiAlias) {
        super.setAntiAlias(antiAlias);
        this.setupBoldItalicIDs();
    }
    
    public void drawStringWithOutline(final String s, final double n, final double n2, final int n3) {
        this.drawString(s, n - 0.5, n2, 0);
        this.drawString(s, n + 0.5, n2, 0);
        this.drawString(s, n, n2 - 0.5, 0);
        this.drawString(s, n, n2 + 0.5, 0);
        this.drawString(s, n, n2, n3);
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.font;

import net.minecraft.client.renderer.texture.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import java.awt.*;
import java.util.*;

public class MinecraftFontRenderer extends CFont
{
    CFont.CharData[] italicChars;
    DynamicTexture texItalicBold;
    CFont.CharData[] boldItalicChars;
    CFont.CharData[] boldChars;
    String colorcodeIdentifiers;
    int[] colorCode;
    DynamicTexture texBold;
    DynamicTexture texItalic;
    
    private void setupBoldItalicIDs() {
        this.texBold = this.setupTexture(this.font.deriveFont(1), invokedynamic(50:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)Z, this), invokedynamic(51:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)Z, this), this.boldChars);
        this.texItalic = this.setupTexture(this.font.deriveFont(2), invokedynamic(50:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)Z, this), invokedynamic(51:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)Z, this), this.italicChars);
        this.texItalicBold = this.setupTexture(this.font.deriveFont(3), invokedynamic(50:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)Z, this), invokedynamic(51:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)Z, this), this.boldItalicChars);
    }
    
    public double getStringWidth(final String s, final float n) {
        if (s == null) {
            return 0.0;
        }
        final float n2 = 0.0f;
        final CFont.CharData[] charData = this.charData;
        int index = 0;
        if (index < s.length()) {
            final char char1 = s.charAt(index);
            if (char1 == '§') {
                "0123456789abcdefklmnor".indexOf(char1);
                ++index;
            }
            else if (char1 < charData.length) {
                final float n3 = n2 + ((float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - n + (float)invokedynamic(42:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)I, this));
            }
            ++index;
            return 0.0;
        }
        return n2 / 2.0f;
    }
    
    public float drawSmoothString(final String s, double n, double n2, final int n3, final boolean b) {
        --n;
        if (s == null) {
            return 0.0f;
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
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(this.tex.getGlTextureId());
        GL11.glBindTexture(3553, this.tex.getGlTextureId());
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        int index = 0;
        if (index < s.length()) {
            final char char1 = s.charAt(index);
            if (char1 == '§') {
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
                else if (index2 != 16) {
                    if (index2 == 17) {
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
                            else {
                                GlStateManager.color((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n4);
                                GlStateManager.bindTexture(this.tex.getGlTextureId());
                                final CFont.CharData[] charData3 = this.charData;
                            }
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
                    this.drawLine(n, n2 + (double)(invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) / 2), n + (double)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)(invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) / 2), 1.0f);
                }
                if (b5) {
                    this.drawLine(n, n2 + (double)invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 2.0, n + (double)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 2.0, 1.0f);
                }
                n += (float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.3f + (float)invokedynamic(42:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)I, this);
            }
            ++index;
            return 0.0f;
        }
        GL11.glHint(3155, 4352);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        return (float)n / 2.0f;
    }
    
    public float drawString(final String s, double n, double n2, int n3, final boolean b, final float n4) {
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
            n3 = ((n3 & 0xFCFCFC) >> 2 | (n3 & 0xFF000000));
        }
        final CFont.CharData[] charData = this.charData;
        final float n5 = (n3 >> 24 & 0xFF) / 255.0f;
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
        GlStateManager.color((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n5);
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(this.tex.getGlTextureId());
        GL11.glBindTexture(3553, this.tex.getGlTextureId());
        int index = 0;
        if (index < s.length()) {
            final char char1 = s.charAt(index);
            if (char1 == '§') {
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
                    final int n6 = this.colorCode[index2];
                    GlStateManager.color((n6 >> 16 & 0xFF) / 255.0f, (n6 >> 8 & 0xFF) / 255.0f, (n6 & 0xFF) / 255.0f, n5);
                }
                else if (index2 != 16) {
                    if (index2 == 17) {
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
                            else {
                                GlStateManager.color((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n5);
                                GlStateManager.bindTexture(this.tex.getGlTextureId());
                                final CFont.CharData[] charData3 = this.charData;
                            }
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
                    this.drawLine(n, n2 + (double)(invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) / 2), n + (double)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)(invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) / 2), 1.0f);
                }
                if (b5) {
                    this.drawLine(n, n2 + (double)invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 2.0, n + (double)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 2.0, 1.0f);
                }
                n += (float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - n4 + (float)invokedynamic(42:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)I, this);
            }
            ++index;
            return 0.0f;
        }
        GL11.glHint(3155, 4352);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        return (float)n / 2.0f;
    }
    
    public void setFractionalMetrics(final boolean fractionalMetrics) {
        super.setFractionalMetrics(fractionalMetrics);
        this.setupBoldItalicIDs();
    }
    
    public void setFont(final Font font) {
        super.setFont(font);
        this.setupBoldItalicIDs();
    }
    
    public String trimStringToWidth(final String s, final int n) {
        return this.trimStringToWidth(s, n, false);
    }
    
    public int getHeight() {
        return (invokedynamic(47:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)I, this) - 8) / 2;
    }
    
    public float drawNoBSString(final String s, double n, double n2, final int n3, final boolean b) {
        --n;
        if (s == null) {
            return 0.0f;
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
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(this.tex.getGlTextureId());
        GL11.glBindTexture(3553, this.tex.getGlTextureId());
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        int index = 0;
        if (index < s.length()) {
            final char char1 = s.charAt(index);
            if (char1 == '§') {
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
                else if (index2 != 16) {
                    if (index2 == 17) {
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
                            else {
                                GlStateManager.color((n3 >> 16 & 0xFF) / 255.0f, (n3 >> 8 & 0xFF) / 255.0f, (n3 & 0xFF) / 255.0f, n4);
                                GlStateManager.bindTexture(this.tex.getGlTextureId());
                                final CFont.CharData[] charData3 = this.charData;
                            }
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
                    this.drawLine(n, n2 + (double)(invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) / 2), n + (double)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)(invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) / 2), 1.0f);
                }
                if (b5) {
                    this.drawLine(n, n2 + (double)invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 2.0, n + (double)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.0, n2 + (double)invokedynamic(40:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 2.0, 1.0f);
                }
                n += (float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.3f + (float)invokedynamic(42:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)I, this);
            }
            ++index;
            return 0.0f;
        }
        GL11.glHint(3155, 4352);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        return (float)n / 2.0f;
    }
    
    public String trimStringToWidthPassword(String replaceAll, final int n, final boolean b) {
        replaceAll = replaceAll.replaceAll(".", ".");
        return this.trimStringToWidth(replaceAll, n, b);
    }
    
    public MinecraftFontRenderer(final Font font, final boolean b, final boolean b2) {
        super(font, b, b2);
        this.boldChars = new CFont.CharData[256];
        this.italicChars = new CFont.CharData[256];
        this.boldItalicChars = new CFont.CharData[256];
        this.colorCode = new int[32];
        this.colorcodeIdentifiers = "0123456789abcdefklmnor";
        this.setupMinecraftColorcodes();
        this.setupBoldItalicIDs();
    }
    
    public int drawString(final String s, final double n, final float n2, final int n3) {
        return (int)this.drawString(s, n, n2, n3, false, 8.3f);
    }
    
    public double getPasswordWidth(final String s) {
        return this.getStringWidth(s.replaceAll(".", "."), 8.0f);
    }
    
    public double getStringWidth(final String s) {
        if (s == null) {
            return 0.0;
        }
        final float n = 0.0f;
        final CFont.CharData[] charData = this.charData;
        int index = 0;
        if (index < s.length()) {
            final char char1 = s.charAt(index);
            if (char1 == '§') {
                "0123456789abcdefklmnor".indexOf(char1);
                ++index;
            }
            else if (char1 < charData.length) {
                final float n2 = n + ((float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, charData[char1]) - 8.3f + (float)invokedynamic(42:(Lru/sanchez/micotian/font/MinecraftFontRenderer;)I, this));
            }
            ++index;
            return 0.0;
        }
        return n / 2.0f;
    }
    
    public int drawSmoothString(final String s, final double n, final float n2, final int n3) {
        return (int)this.drawSmoothString(s, n, n2, n3, false);
    }
    
    public int drawStringWithShadow(final String s, final double n, final float n2, final int n3) {
        return (int)Math.max(this.drawString(s, n + 0.8999999761581421, n2 + 0.5, n3, true, 8.3f), this.drawString(s, n, n2, n3, false, 8.3f));
    }
    
    public float drawCenteredString(final String s, final float n, final float n2, final int n3) {
        return (float)this.drawString(s, n - (float)(this.getStringWidth(s) / 2.0), n2, n3);
    }
    
    public List formatString(final String s, final double n) {
        final ArrayList<String> list = new ArrayList<String>();
        final StringBuilder sb = new StringBuilder();
        char c = '\uffff';
        final char[] charArray = s.toCharArray();
        int n2 = 0;
        if (n2 < charArray.length) {
            final char c2 = charArray[n2];
            if (c2 == '§' && n2 < charArray.length - 1) {
                c = charArray[n2 + 1];
            }
            if (this.getStringWidth(sb.toString() + c2) < n) {
                sb.append(c2);
            }
            else {
                list.add(sb.toString());
                final StringBuilder sb2 = new StringBuilder("§" + c + c2);
            }
            ++n2;
            return null;
        }
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        return list;
    }
    
    public int drawNoBSString(final String s, final double n, final float n2, final int n3) {
        return (int)this.drawNoBSString(s, n, n2, n3, false);
    }
    
    public int drawPassword(final String s, final double n, final float n2, final int n3) {
        return (int)this.drawString(s.replaceAll(".", "."), n, n2, n3, false, 8.0f);
    }
    
    public void setAntiAlias(final boolean antiAlias) {
        super.setAntiAlias(antiAlias);
        this.setupBoldItalicIDs();
    }
    
    private void setupMinecraftColorcodes() {
        int n = 0;
        if (n < 32) {
            final int n2 = (n >> 3 & 0x1) * 85;
            int n3 = (n >> 2 & 0x1) * 170 + n2;
            int n4 = (n >> 1 & 0x1) * 170 + n2;
            int n5 = (n & 0x1) * 170 + n2;
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
    
    public List wrapWords(final String e, final double n) {
        final ArrayList<String> list = new ArrayList<String>();
        if (this.getStringWidth(e) > n) {
            final String[] split = e.split(" ");
            final StringBuilder sb = new StringBuilder();
            final char c = '\uffff';
            final String[] array = split;
            final int length = array.length;
            int n2 = 0;
            if (n2 < length) {
                final String str = array[n2];
                int n3 = 0;
                if (n3 < str.toCharArray().length) {
                    if (str.toCharArray()[n3] == '§' && n3 < str.toCharArray().length - 1) {
                        final char c2 = str.toCharArray()[n3 + 1];
                    }
                    ++n3;
                    return null;
                }
                if (this.getStringWidth((Object)sb + str + " ") < n) {
                    sb.append(str).append(" ");
                }
                else {
                    list.add(sb.toString());
                    final StringBuilder sb2 = new StringBuilder("§" + c + str + " ");
                }
                ++n2;
                return null;
            }
            else if (sb.length() > 0) {
                if (this.getStringWidth(sb.toString()) < n) {
                    list.add("§" + c + (Object)sb + " ");
                    final StringBuilder sb3 = new StringBuilder();
                }
                else {
                    list.addAll(this.formatString(sb.toString(), n));
                }
            }
        }
        else {
            list.add(e);
        }
        return list;
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
    
    public String trimStringToWidth(final String s, final int n, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        float n2 = 0.0f;
        final int n3 = b ? (s.length() - 1) : 0;
        final int n4 = b ? -1 : 1;
        final boolean b2 = false;
        final boolean b3 = false;
        final int index = n3;
        if (index >= 0 && index < s.length() && n2 < n) {
            final char char1 = s.charAt(index);
            final float charWidthFloat = this.getCharWidthFloat(char1);
            if (b2) {
                if (char1 != 'l' && char1 != 'L') {
                    if (char1 == 'r' || char1 == 'R') {}
                }
            }
            else if (charWidthFloat >= 0.0f) {
                n2 += charWidthFloat;
                if (b3) {
                    ++n2;
                }
            }
            if (n2 <= n) {
                if (b) {
                    sb.insert(0, char1);
                }
                else {
                    sb.append(char1);
                }
                return null;
            }
        }
        return sb.toString();
    }
    
    public float drawCenteredStringWithShadow(final String s, final float n, final float n2, final int n3) {
        return (float)this.drawStringWithShadow(s, n - (float)(this.getStringWidth(s) / 2.0), n2, n3);
    }
    
    private float getCharWidthFloat(final char ch) {
        if (ch == '§') {
            return -1.0f;
        }
        if (ch == ' ') {
            return 2.0f;
        }
        final int index = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".indexOf(ch);
        if (ch > '\0' && index != -1) {
            return (float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, this.charData[index]) / 2.0f - 4.0f;
        }
        if ((float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, this.charData[ch]) / 2.0f - 4.0f != 0.0f) {
            final int n = (int)((float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, this.charData[ch]) / 2.0f - 4.0f) >>> 4;
            int n2 = (int)((float)invokedynamic(41:(Lru/sanchez/micotian/font/CFont$CharData;)I, this.charData[ch]) / 2.0f - 4.0f) & 0xF;
            return (float)((++n2 - (n & 0xF)) / 2 + 1);
        }
        return 0.0f;
    }
    
    public float drawNoBSCenteredString(final String s, final float n, final float n2, final int n3) {
        return (float)this.drawNoBSString(s, n - (float)(this.getStringWidth(s) / 2.0), n2, n3);
    }
}

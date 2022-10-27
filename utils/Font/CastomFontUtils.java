//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.Font;

import net.minecraft.util.*;
import java.awt.*;
import net.minecraft.client.*;

public final class CastomFontUtils
{
    public static CustomFontRenderer fr3;
    public static CustomFontRenderer fr2;
    public static CustomFontRenderer fr;
    public static CustomFontRenderer fr4;
    
    static {
        CastomFontUtils.fr = new CustomFontRenderer(getFontFromTTF(new ResourceLocation("font.otf"), 20.0f, 0), true, true);
        CastomFontUtils.fr2 = new CustomFontRenderer(getFontFromTTF(new ResourceLocation("main.ttf"), 20.0f, 0), true, true);
        CastomFontUtils.fr3 = new CustomFontRenderer(getFontFromTTF(new ResourceLocation("rerty.ttf"), 20.0f, 0), true, true);
        CastomFontUtils.fr4 = new CustomFontRenderer(getFontFromTTF(new ResourceLocation("latoregular.ttf"), 20.0f, 0), true, true);
    }
    
    public static Font getFontFromTTF(final ResourceLocation resourceLocation, final float size, final int fontFormat) {
        try {
            return Font.createFont(fontFormat, Minecraft.getMinecraft().getResourceManager().getResource(resourceLocation).getInputStream()).deriveFont(size);
        }
        catch (Exception ex) {
            return null;
        }
    }
}

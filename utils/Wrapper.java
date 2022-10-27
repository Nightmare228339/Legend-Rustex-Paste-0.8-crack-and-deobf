//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import net.minecraft.client.*;
import ru.sanchez.micotian.*;

public interface Wrapper
{
    public static final Minecraft mc = Minecraft.getMinecraft();
    
    default Micotian getCosmos() {
        return Micotian.instance;
    }
    
    default boolean nullCheck() {
        return Wrapper.mc.player != null || Wrapper.mc.world != null;
    }
}

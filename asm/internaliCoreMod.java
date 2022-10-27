//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm;

import net.minecraftforge.fml.relauncher.*;
import java.util.*;
import javax.annotation.*;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.TransformerExclusions({ "com.denger.micotian.asm" })
public class internaliCoreMod implements IFMLLoadingPlugin
{
    public String getAccessTransformerClass() {
        return null;
    }
    
    public void injectData(final Map map) {
    }
    
    public String[] getASMTransformerClass() {
        return new String[] { "com.denger.micotian.asm.InternaliClassTransformer" };
    }
    
    @Nullable
    public String getSetupClass() {
        return null;
    }
    
    public String getModContainerClass() {
        return null;
    }
}

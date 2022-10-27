//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import ru.sanchez.micotian.manager.*;
import ru.sanchez.micotian.*;

@Mod(modid = "micotian", version = "V0.8.0", name = "Legend")
public class Main
{
    @Mod.EventHandler
    public void init(final FMLInitializationEvent fmlInitializationEvent) throws Exception {
        HWIDManager.hwidCheck();
        (Micotian.instance = new Micotian()).init();
    }
}

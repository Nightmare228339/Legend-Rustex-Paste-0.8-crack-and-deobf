//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.manager;

import ru.sanchez.micotian.utils.util.*;
import java.util.*;

public class HWIDManager
{
    public static final String pastebinURL;
    public static List hwids;
    
    public static void hwidCheck() {
        HWIDManager.hwids = URLReader.readURL();
        if (!HWIDManager.hwids.toString().contains(SystemUtil.getSystemInfo())) {
            DisplayUtil.Display();
            throw new NoStackTraceThrowable("");
        }
    }
    
    static {
        pastebinURL = "https://pastebin.com/aRa622Q3";
        HWIDManager.hwids = new ArrayList();
    }
}

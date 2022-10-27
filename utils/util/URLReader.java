//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.util;

import java.util.*;
import java.net.*;
import java.io.*;

public class URLReader
{
    private static Class[] lllllllIIl;
    
    public static List readURL() {
        final ArrayList<String> list = new ArrayList<String>();
        try {
            final String line;
            if ((line = new BufferedReader(new InputStreamReader(new URL("https://pastebin.com/aRa622Q3").openStream())).readLine()) != null) {
                list.add(line);
                return null;
            }
        }
        catch (Exception ex) {}
        return list;
    }
}

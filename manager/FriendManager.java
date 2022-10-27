//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.manager;

import net.minecraft.util.text.*;
import ru.sanchez.micotian.notifications.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import java.util.*;

public class FriendManager
{
    public static List FRIENDS;
    
    public static void toggleFriend(final String s) {
        if (isFriend(s)) {
            FriendManager.FRIENDS.remove(s);
            notifications.add(TextFormatting.RED + s, "Remove from Friend list", Type.OK);
        }
        else {
            FriendManager.FRIENDS.add(s);
            notifications.add(TextFormatting.GREEN + s, "add in Friends list", Type.OK);
        }
    }
    
    public static boolean isFriend(final String s) {
        return FriendManager.FRIENDS.contains(s);
    }
    
    public static Entity ifFreand2(final String s) {
        EntityPlayer.getOfflineUUID(s);
        return ifFreand2(s);
    }
    
    static {
        FriendManager.FRIENDS = new ArrayList();
    }
}

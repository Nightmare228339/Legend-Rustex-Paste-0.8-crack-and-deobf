//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.commands;

import net.minecraft.server.*;
import net.minecraft.util.math.*;
import javax.annotation.*;
import ru.sanchez.micotian.module.exploit.*;
import net.minecraft.client.network.*;
import java.util.*;
import ru.sanchez.micotian.utils.*;
import net.minecraft.command.*;

public class CommandOffline extends CommandBase
{
    private static ArrayList nick;
    
    static {
        CommandOffline.nick = new ArrayList();
    }
    
    public String getUsage(final ICommandSender commandSender) {
        return "/offline help";
    }
    
    public String getName() {
        return "offline";
    }
    
    public List getTabCompletions(final MinecraftServer minecraftServer, final ICommandSender commandSender, final String[] array, @Nullable final BlockPos blockPos) {
        try {
            if (array.length == 1) {
                return getListOfStringsMatchingLastWord(array, new String[] { "help", "clear", "add", "remove", "check", "list" });
            }
            final ArrayList<String> list = new ArrayList<String>();
            final Iterator<NetworkPlayerInfo> iterator = OfflineCheck.getList().iterator();
            if (iterator.hasNext()) {
                list.add(iterator.next().getGameProfile().getName());
                return null;
            }
            return (array.length == 2) ? getListOfStringsMatchingLastWord(array, (Collection)list) : Collections.emptyList();
        }
        catch (Throwable t) {
            return Collections.emptyList();
        }
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public void execute(final MinecraftServer minecraftServer, final ICommandSender commandSender, final String[] array) throws CommandException {
        if (array.length == 1) {
            final String s = array[0];
            int n = -1;
            switch (s.hashCode()) {
                case 3322014: {
                    if (Integer.valueOf(3322014).equals(s.hashCode())) {
                        n = 0;
                        break;
                    }
                    break;
                }
                case 94746189: {
                    if (Integer.valueOf(94746189).equals(s.hashCode())) {
                        n = 1;
                        break;
                    }
                    break;
                }
                case 3198785: {
                    if (Integer.valueOf(3198785).equals(s.hashCode())) {
                        n = 2;
                        break;
                    }
                    break;
                }
            }
            switch (n) {
                case 0: {
                    ChatUtils.sendMessage(CommandOffline.nick.toString());
                    break;
                }
                case 1: {
                    CommandOffline.nick.clear();
                    OfflineCheck.offlined.clear();
                    ChatUtils.sendMessage("list cleared");
                    break;
                }
                case 2: {
                    ChatUtils.sendMessage("/offline list - write list");
                    ChatUtils.sendMessage("/offline clear - clear list");
                    ChatUtils.sendMessage("/offline add <name> - add <name> to list");
                    ChatUtils.sendMessage("/offline remove <name> - remove <name> from the list");
                    ChatUtils.sendMessage("/offline check <name> - check online");
                    break;
                }
            }
        }
        else {
            if (array.length != 2) {
                throw new WrongUsageException("/offline help", new Object[0]);
            }
            if (Integer.valueOf(96417).equals(array[0].hashCode())) {
                CommandOffline.nick.add(array[1]);
                ChatUtils.sendMessage(array[1] + " added to the list");
            }
            else if (Integer.valueOf(-934610812).equals(array[0].hashCode())) {
                OfflineCheck.offlined.remove(array[1]);
                CommandOffline.nick.remove(array[1]);
                ChatUtils.sendMessage(array[1] + " removed from the list");
            }
            else if (Integer.valueOf(94627080).equals(array[0].hashCode())) {
                ChatUtils.sendMessage(OfflineCheck.check(array[1]));
            }
        }
    }
    
    public static ArrayList getNick() {
        return CommandOffline.nick;
    }
}

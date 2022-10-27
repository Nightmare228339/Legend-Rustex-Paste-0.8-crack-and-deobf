//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils.commands;

import net.minecraft.server.*;
import net.minecraft.client.*;
import net.minecraft.nbt.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.command.*;
import net.minecraft.client.entity.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.math.*;
import javax.annotation.*;
import net.minecraft.client.network.*;
import java.util.*;

public class CommandGive extends CommandBase
{
    public void execute(final MinecraftServer minecraftServer, final ICommandSender commandSender, final String[] array) throws CommandException {
        if (array.length < 2) {
            throw new WrongUsageException("commands.give.usage", new Object[0]);
        }
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        final Item getItemByText = getItemByText(commandSender, array[1]);
        final int i = (array.length >= 3) ? parseInt(array[2], 1, 64) : 1;
        final ItemStack itemStack = new ItemStack(getItemByText, i, (array.length >= 4) ? parseInt(array[3]) : 0);
        if (array.length >= 5) {
            final String buildString = buildString(array, 4);
            try {
                itemStack.setTagCompound(JsonToNBT.getTagFromJson(buildString));
            }
            catch (NBTException ex) {
                throw new CommandException("commands.give.tagError", new Object[] { ex.getMessage() });
            }
        }
        final boolean addItemStackToInventory = ((EntityPlayer)player).inventory.addItemStackToInventory(itemStack);
        if (addItemStackToInventory) {
            ((EntityPlayer)player).world.playSound((EntityPlayer)null, invokedynamic(12:(Lnet/minecraft/entity/player/EntityPlayer;)D, player), invokedynamic(13:(Lnet/minecraft/entity/player/EntityPlayer;)D, player), invokedynamic(14:(Lnet/minecraft/entity/player/EntityPlayer;)D, player), SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 0.2f, ((((EntityPlayer)player).getRNG().nextFloat() - ((EntityPlayer)player).getRNG().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            ((EntityPlayer)player).inventoryContainer.detectAndSendChanges();
        }
        if (addItemStackToInventory && itemStack.isEmpty()) {
            itemStack.setCount(1);
            commandSender.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, i);
            final EntityItem dropItem = ((EntityPlayer)player).dropItem(itemStack, false);
            if (dropItem != null) {
                dropItem.makeFakeItem();
            }
        }
        else {
            commandSender.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, i - itemStack.getCount());
            final EntityItem dropItem2 = ((EntityPlayer)player).dropItem(itemStack, false);
            if (dropItem2 != null) {
                dropItem2.setNoPickupDelay();
                dropItem2.setOwner(((EntityPlayer)player).getName());
            }
        }
        notifyCommandListener(commandSender, (ICommand)this, "commands.give.success", new Object[] { itemStack.getTextComponent(), i, ((EntityPlayer)player).getName() });
    }
    
    public boolean isUsernameIndex(final String[] array, final int n) {
        return n == 0;
    }
    
    public String getUsage(final ICommandSender commandSender) {
        return "commands.give.usage";
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public List getTabCompletions(final MinecraftServer minecraftServer, final ICommandSender commandSender, final String[] array, @Nullable final BlockPos blockPos) {
        if (array.length != 1) {
            return (array.length == 2) ? getListOfStringsMatchingLastWord(array, (Collection)Item.REGISTRY.getKeys()) : Collections.emptyList();
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<NetworkPlayerInfo> iterator = Minecraft.getMinecraft().player.connection.getPlayerInfoMap().iterator();
        if (iterator.hasNext()) {
            list.add(iterator.next().getGameProfile().getName());
            return null;
        }
        return list;
    }
    
    public String getName() {
        return "give";
    }
}

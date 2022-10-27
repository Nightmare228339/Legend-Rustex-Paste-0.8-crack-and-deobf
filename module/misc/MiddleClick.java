//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import ru.sanchez.micotian.manager.*;
import net.minecraft.util.text.*;
import ru.sanchez.micotian.notifications.*;
import ru.sanchez.micotian.module.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class MiddleClick extends Module
{
    private void clickFriend() {
        final String getName = MiddleClick.mc.objectMouseOver.entityHit.getName();
        if (FriendManager.isFriend(getName)) {
            FriendManager.FRIENDS.remove(getName);
            notifications.add(TextFormatting.RED + getName, "Remove from Friend list", Type.OK);
        }
        else {
            FriendManager.FRIENDS.add(getName);
            notifications.add(TextFormatting.GREEN + getName, "add in Friends list", Type.OK);
        }
    }
    
    public MiddleClick() {
        super("MCF", Category.OUTHER);
    }
    
    @SubscribeEvent
    public void onMiddleClick(final InputEvent.MouseInputEvent mouseInputEvent) {
        if (MiddleClick.mc.player == null || MiddleClick.mc.world == null) {
            return;
        }
        if (Mouse.getEventButtonState() && Mouse.getEventButton() == 2 && MiddleClick.mc.objectMouseOver.entityHit instanceof EntityPlayer) {
            this.clickFriend();
        }
    }
}

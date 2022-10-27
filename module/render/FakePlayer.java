//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.render;

import net.minecraft.client.entity.*;
import ru.sanchez.micotian.module.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;

public class FakePlayer extends Module
{
    EntityOtherPlayerMP fakePlayer;
    
    public FakePlayer() {
        super("FakePlayer", Category.RENDER);
    }
    
    public void onEnable() {
        (this.fakePlayer = new EntityOtherPlayerMP((World)FakePlayer.mc.world, FakePlayer.mc.player.getGameProfile())).setEntityId(-1882);
        this.fakePlayer.copyLocationAndAnglesFrom((Entity)FakePlayer.mc.player);
        this.fakePlayer.rotationYawHead = invokedynamic(9:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, FakePlayer.mc.player);
        FakePlayer.mc.world.addEntityToWorld(this.fakePlayer.getEntityId(), (Entity)this.fakePlayer);
    }
    
    public void onDisable() {
        FakePlayer.mc.world.removeEntityFromWorld(this.fakePlayer.getEntityId());
    }
}

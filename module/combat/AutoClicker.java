//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.combat;

import ru.sanchez.micotian.*;
import io.netty.util.internal.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraft.util.*;
import net.minecraft.client.settings.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;
import ru.sanchez.micotian.settings.*;

public class AutoClicker extends Module
{
    private double holdLength;
    private double max;
    private long hold;
    private double speed;
    private long lastClick;
    private double min;
    
    private void updateVals() {
        // invokedynamic(6:(Lru/sanchez/micotian/module/combat/AutoClicker;D)V, this, Micotian.instance.settingsManager.getSettingByName((Module)this, "MinCPS").getValDouble())
        // invokedynamic(7:(Lru/sanchez/micotian/module/combat/AutoClicker;D)V, this, Micotian.instance.settingsManager.getSettingByName((Module)this, "MaxCPS").getValDouble())
        if (invokedynamic(8:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this) >= invokedynamic(9:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this)) {
        }
        // invokedynamic(7:(Lru/sanchez/micotian/module/combat/AutoClicker;D)V, this, invokedynamic(8:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this) + 1.0)
    }
    // invokedynamic(12:(Lru/sanchez/micotian/module/combat/AutoClicker;D)V, this, 1.0 / ThreadLocalRandom.current().nextDouble(invokedynamic(8:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this) - 0.2, invokedynamic(9:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this)))
    // invokedynamic(14:(Lru/sanchez/micotian/module/combat/AutoClicker;D)V, this, invokedynamic(13:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this) / ThreadLocalRandom.current().nextDouble(invokedynamic(8:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this), invokedynamic(9:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this)))
    
    @SubscribeEvent
    public void onTick(final TickEvent.RenderTickEvent renderTickEvent) {
        if (Mouse.isButtonDown(0) && AutoClicker.mc.currentScreen == null) {
            if ((double)(System.currentTimeMillis() - invokedynamic(19:(Lru/sanchez/micotian/module/combat/AutoClicker;)J, this)) > invokedynamic(13:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this) * 1000.0) {
                // invokedynamic(20:(Lru/sanchez/micotian/module/combat/AutoClicker;J)V, this, System.currentTimeMillis())
                if (invokedynamic(21:(Lru/sanchez/micotian/module/combat/AutoClicker;)J, this) < invokedynamic(19:(Lru/sanchez/micotian/module/combat/AutoClicker;)J, this)) {
                }
                // invokedynamic(22:(Lru/sanchez/micotian/module/combat/AutoClicker;J)V, this, invokedynamic(19:(Lru/sanchez/micotian/module/combat/AutoClicker;)J, this))
                AutoClicker.mc.player.swingArm(EnumHand.MAIN_HAND);
                this.updateVals();
            }
            else if ((double)(System.currentTimeMillis() - invokedynamic(21:(Lru/sanchez/micotian/module/combat/AutoClicker;)J, this)) > invokedynamic(26:(Lru/sanchez/micotian/module/combat/AutoClicker;)D, this) * 1000.0) {
                KeyBinding.setKeyBindState(AutoClicker.mc.gameSettings.keyBindAttack.getKeyCode(), false);
                this.updateVals();
            }
        }
    }
    
    public AutoClicker() {
        super("AutoClicker", Category.COMBAT);
        Micotian.instance.settingsManager.rSetting(new Setting("MinCPS", this, 8.0, 1.0, 20.0, false));
        Micotian.instance.settingsManager.rSetting(new Setting("MaxCPS", this, 12.0, 1.0, 20.0, false));
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
        this.updateVals();
    }
}

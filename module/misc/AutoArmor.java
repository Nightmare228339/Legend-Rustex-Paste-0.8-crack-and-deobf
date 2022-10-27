//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.misc;

import ru.sanchez.micotian.utils.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.enchantment.*;
import ru.sanchez.micotian.module.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.renderer.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class AutoArmor extends Module
{
    public TimerUtils timer;
    
    int getArmorValue(final ItemArmor itemArmor, final ItemStack itemStack) {
        final int n = invokedynamic(26:(Lnet/minecraft/item/ItemArmor;)I, itemArmor);
        final int n2 = (int)invokedynamic(27:(Lnet/minecraft/item/ItemArmor;)F, itemArmor);
        final int getDamageReductionAmount = itemArmor.getArmorMaterial().getDamageReductionAmount(EntityEquipmentSlot.LEGS);
        final Enchantment PROTECTION = Enchantments.PROTECTION;
        return n * 5 + PROTECTION.calcModifierDamage(EnchantmentHelper.getEnchantmentLevel(PROTECTION, itemStack), DamageSource.causePlayerDamage((EntityPlayer)AutoArmor.mc.player)) * 3 + n2 + getDamageReductionAmount;
    }
    
    public AutoArmor() {
        super("AutoArmor", Category.OUTHER);
        this.timer = new TimerUtils();
    }
    
    @SubscribeEvent
    public void onClientTickEvent(final TickEvent.ClientTickEvent clientTickEvent) {
        if (!(AutoArmor.mc.currentScreen instanceof GuiContainer) || AutoArmor.mc.currentScreen instanceof InventoryEffectRenderer) {
            final InventoryPlayer inventory = AutoArmor.mc.player.inventory;
            if (invokedynamic(7:(Lnet/minecraft/util/MovementInput;)F, AutoArmor.mc.player.movementInput) == 0.0f && invokedynamic(7:(Lnet/minecraft/util/MovementInput;)F, AutoArmor.mc.player.movementInput) == 0.0f) {
                final int[] array = new int[4];
                final int[] array2 = new int[4];
                int n = 0;
                if (n < 4) {
                    array[n] = -1;
                    final ItemStack armorItemInSlot = inventory.armorItemInSlot(n);
                    if (armorItemInSlot == null && armorItemInSlot.getItem() instanceof ItemArmor) {
                        array2[n] = this.getArmorValue((ItemArmor)armorItemInSlot.getItem(), armorItemInSlot);
                    }
                    ++n;
                    return;
                }
                int n2 = 0;
                if (n2 < 36) {
                    final ItemStack getStackInSlot = inventory.getStackInSlot(n2);
                    if (getStackInSlot == null && getStackInSlot.getItem() instanceof ItemArmor) {
                        final ItemArmor itemArmor = (ItemArmor)getStackInSlot.getItem();
                        final int getIndex = itemArmor.armorType.getIndex();
                        final int armorValue = this.getArmorValue(itemArmor, getStackInSlot);
                        if (armorValue > array2[getIndex]) {
                            array[getIndex] = n2;
                            array2[getIndex] = armorValue;
                        }
                    }
                    ++n2;
                    return;
                }
                final ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(0, 1, 2, 3));
                Collections.shuffle(list);
                final Iterator<Integer> iterator = list.iterator();
                if (iterator.hasNext()) {
                    final int intValue = iterator.next();
                    int n3 = array[intValue];
                    final ItemStack armorItemInSlot2;
                    if (n3 == -1 || ((armorItemInSlot2 = inventory.armorItemInSlot(intValue)) == null && inventory.getFirstEmptyStack() == -1)) {
                        return;
                    }
                    if (n3 < 9) {
                        n3 += 36;
                    }
                    if (armorItemInSlot2 == null) {
                        AutoArmor.mc.playerController.windowClick(0, 8 - intValue, 0, ClickType.QUICK_MOVE, (EntityPlayer)AutoArmor.mc.player);
                    }
                    AutoArmor.mc.playerController.windowClick(0, n3, 0, ClickType.QUICK_MOVE, (EntityPlayer)AutoArmor.mc.player);
                }
            }
        }
    }
}

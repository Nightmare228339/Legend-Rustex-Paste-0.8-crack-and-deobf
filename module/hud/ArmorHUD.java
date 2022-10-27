//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.hud;

import ru.sanchez.micotian.module.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

public class ArmorHUD extends Module
{
    private static RenderItem itemRender;
    
    public ArmorHUD() {
        super("ArmorHUD", Category.HUD);
    }
    
    @SubscribeEvent
    public void onRender(final RenderGameOverlayEvent.Text text) {
        GlStateManager.enableTexture2D();
        final ScaledResolution scaledResolution = new ScaledResolution(ArmorHUD.mc);
        final int n = scaledResolution.getScaledWidth() / 2;
        int n2 = 0;
        final int n3 = scaledResolution.getScaledHeight() - 55 - 10;
        final Iterator iterator = ArmorHUD.mc.player.inventory.armorInventory.iterator();
        if (!iterator.hasNext()) {
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
            return;
        }
        final ItemStack itemStack = iterator.next();
        ++n2;
        if (itemStack.isEmpty()) {
            return;
        }
        final int n4 = n - 90 + (9 - n2) * 20 + 2;
        GlStateManager.enableDepth();
        ArmorHUD.itemRender.zLevel = 200.0f;
        ArmorHUD.itemRender.renderItemAndEffectIntoGUI(itemStack, n4, n3);
        ArmorHUD.itemRender.renderItemOverlayIntoGUI(ArmorHUD.mc.fontRenderer, itemStack, n4, n3, "");
        ArmorHUD.itemRender.zLevel = 0.0f;
        GlStateManager.enableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        final String s = (itemStack.getCount() > 1) ? (itemStack.getCount() + "") : "";
        ArmorHUD.mc.fontRenderer.drawStringWithShadow(s, (float)(n4 + 19 - 2 - ArmorHUD.mc.fontRenderer.getStringWidth(s)), (float)(n3 + 9), 16777215);
        final float n5 = (itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / itemStack.getMaxDamage();
        final float n6 = 1.0f - n5;
        final int n7 = 100 - (int)(n6 * 100.0f);
        ArmorHUD.mc.fontRenderer.drawStringWithShadow(n7 + "", (float)(n4 + 8 - ArmorHUD.mc.fontRenderer.getStringWidth(n7 + "") / 2), (float)(n3 - 11), toHex((int)(n6 * 255.0f), (int)(n5 * 255.0f), 0));
    }
    
    public static int toHex(final int n, final int n2, final int n3) {
        return 0xFF000000 | (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | (n3 & 0xFF);
    }
    
    static {
        ArmorHUD.itemRender = Minecraft.getMinecraft().getRenderItem();
    }
}

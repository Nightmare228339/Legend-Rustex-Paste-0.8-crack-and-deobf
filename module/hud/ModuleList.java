//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.hud;

import ru.sanchez.micotian.*;
import ru.sanchez.micotian.module.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import ru.sanchez.micotian.utils.Font.*;
import java.util.*;
import org.lwjgl.opengl.*;
import ru.sanchez.micotian.utils.*;
import java.awt.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ModuleList extends Module
{
    ArrayList modules;
    
    @Override
    public void onEnable() {
        super.onEnable();
        this.modules.clear();
        final Iterator<Module> iterator = Micotian.moduleManager.modules.iterator();
        if (iterator.hasNext()) {
            this.modules.add(new SubModule(iterator.next()));
        }
    }
    
    public ModuleList() {
        super("ArrayList", Category.HUD);
        this.modules = new ArrayList();
    }
    
    @SubscribeEvent
    public void onOverlayRender(final RenderGameOverlayEvent.Text text) {
        final int n = new ScaledResolution(ModuleList.mc).getScaledWidth() - 2;
        final Iterator<SubModule> iterator = this.modules.iterator();
        if (iterator.hasNext()) {
            final SubModule subModule = iterator.next();
            if (subModule.getModule().isToggled() && invokedynamic(10:(Lru/sanchez/micotian/module/Module;)Z, subModule.getModule())) {
                subModule.setAnim(MathUtils.lerp(subModule.getAnim(), 1.0f, 0.1f));
                subModule.setY((int)MathUtils.lerp((float)subModule.getY(), (float)(CastomFontUtils.fr4.getHeight() + 10), 0.1f));
            }
            else {
                subModule.setAnim(MathUtils.lerp(subModule.getAnim(), 0.0f, 0.1f));
                subModule.setY((int)MathUtils.lerp((float)subModule.getY(), 0.0f, 0.1f));
            }
            return;
        }
        this.modules.sort(new Comparator() {
            final ModuleList this$0;
            
            @Override
            public int compare(final Object o, final Object o2) {
                return this.compare((SubModule)o, (SubModule)o2);
            }
            
            public int compare(final SubModule subModule, final SubModule subModule2) {
                return CastomFontUtils.fr4.getStringWidth(subModule2.getModule().getName()) - CastomFontUtils.fr4.getStringWidth(subModule.getModule().getName());
            }
        });
        final int n2 = 0;
        final Iterator<SubModule> iterator2 = this.modules.iterator();
        if (iterator2.hasNext()) {
            final SubModule subModule2 = iterator2.next();
            GL11.glPushMatrix();
            final float n3 = (float)(n - CastomFontUtils.fr4.getStringWidth(subModule2.getModule().getName()));
            final float n4 = (float)(22 + n2);
            final float n5 = (float)CastomFontUtils.fr4.getStringWidth(subModule2.getModule().getName());
            GL11.glTranslated((double)n5, 10.0, 1.0);
            GL11.glTranslated((double)(-n3 * subModule2.getAnim() + n3 + n5 * -subModule2.getAnim()), (double)(-n4 * 1.0f + n4 - 10.0f), 1.0);
            GL11.glScaled((double)subModule2.getAnim(), 1.0, 0.0);
            RenderUtils.drawShadowRect(n - CastomFontUtils.fr4.getStringWidth(subModule2.getModule().getName()), 22 + n2, n, 22 + n2 + 10, 2);
            RenderUtils.drawRect((float)(n - CastomFontUtils.fr4.getStringWidth(subModule2.getModule().getName())), (float)(22 + n2), (float)n, (float)(22 + n2 + 9), new Color(30, 30, 30, 200).getRGB());
            CastomFontUtils.fr4.drawString(subModule2.getModule().getName(), (float)(n - CastomFontUtils.fr4.getStringWidth(subModule2.getModule().getName())), (float)(22 + n2), ClickGUI.getColor());
            GL11.glPopMatrix();
            final int n6 = n2 + subModule2.getY();
        }
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
    }
    
    static class SubModule
    {
        float anim;
        Module module;
        int y;
        
        public void setAnim(final float n) {
        }
        // invokedynamic(1:(Lru/sanchez/micotian/module/hud/ModuleList$SubModule;F)V, this, n)
        
        public void setY(final int n) {
        }
        // invokedynamic(0:(Lru/sanchez/micotian/module/hud/ModuleList$SubModule;I)V, this, n)
        
        public float getAnim() {
            return invokedynamic(3:(Lru/sanchez/micotian/module/hud/ModuleList$SubModule;)F, this);
        }
        
        public Module getModule() {
            return this.module;
        }
        
        public int getY() {
            return invokedynamic(5:(Lru/sanchez/micotian/module/hud/ModuleList$SubModule;)I, this);
        }
        
        public SubModule(final Module module) {
            // invokedynamic(0:(Lru/sanchez/micotian/module/hud/ModuleList$SubModule;I)V, this, false)
            // invokedynamic(1:(Lru/sanchez/micotian/module/hud/ModuleList$SubModule;F)V, this, 0.0f)
            this.module = module;
        }
    }
}

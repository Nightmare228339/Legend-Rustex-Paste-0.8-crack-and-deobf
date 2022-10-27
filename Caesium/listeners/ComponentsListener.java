//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.listeners;

import ru.sanchez.micotian.*;
import ru.sanchez.micotian.settings.*;
import java.awt.event.*;
import Caesium.components.*;
import Caesium.components.listeners.*;
import ru.sanchez.micotian.module.*;
import java.util.*;

public class ComponentsListener extends ComponentListener
{
    private GuiButton button;
    
    public void addComponents() {
        this.add((GuiComponent)new GuiLabel("Settings >"));
        final Micotian instance = Micotian.instance;
        final Module module = Micotian.moduleManager.getModule(this.button.getText());
        if (Micotian.instance.settingsManager.getSettingsByMod(module) != null) {
            final Iterator iterator = Micotian.instance.settingsManager.getSettingsByMod(module).iterator();
            if (iterator.hasNext()) {
                final Setting setting = iterator.next();
                if (setting.isSlider()) {
                    final GuiSlider guiSlider = new GuiSlider(setting.getName(), (float)setting.getMin(), (float)setting.getMax(), (float)setting.getValDouble(), setting.onlyInt() ? 0 : 2);
                    guiSlider.addValueListener((ValueListener)new ValueListener(setting) {
                        final Setting val$set;
                        final ComponentsListener this$0;
                        
                        private static void lambda$valueChanged$0() {
                        }
                        
                        public void valueUpdated(final float n) {
                            this.val$set.setValDouble((double)n);
                        }
                        
                        public void valueChanged(final float n) {
                            this.val$set.setValDouble((double)n);
                            new Thread(ComponentsListener$1::lambda$valueChanged$0).start();
                        }
                    });
                    this.add((GuiComponent)guiSlider);
                }
                if (setting.isCheck()) {
                    final GuiToggleButton guiToggleButton = new GuiToggleButton(setting.getName());
                    guiToggleButton.setToggled(setting.getValBoolean());
                    guiToggleButton.addClickListener((ActionListener)new ActionListener(setting, guiToggleButton) {
                        final Setting val$set;
                        final GuiToggleButton val$toggleButton;
                        final ComponentsListener this$0;
                        
                        @Override
                        public void actionPerformed(final ActionEvent actionEvent) {
                            this.val$set.setValBoolean(this.val$toggleButton.isToggled());
                        }
                    });
                    this.add((GuiComponent)guiToggleButton);
                }
                if (!setting.isCombo()) {
                    return;
                }
                final GuiComboBox guiComboBox = new GuiComboBox(setting);
                guiComboBox.addComboListener((ComboListener)new ComboListener() {
                    final ComponentsListener this$0;
                    
                    public void comboChanged(final String s) {
                    }
                });
                this.add((GuiComponent)guiComboBox);
                return;
            }
        }
        final GuiGetKey guiGetKey = new GuiGetKey("KeyBind", module.getKey());
        guiGetKey.addKeyListener((KeyListener)new KeyListener(module) {
            final ComponentsListener this$0;
            final Module val$m;
            
            private static void lambda$keyChanged$0() {
            }
            
            public void keyChanged(final int key) {
                this.val$m.setKey(key);
                new Thread(ComponentsListener$4::lambda$keyChanged$0).start();
            }
        });
        this.add((GuiComponent)guiGetKey);
        final GuiToggleButton guiToggleButton2 = new GuiToggleButton("Visable");
        guiToggleButton2.setToggled(invokedynamic(27:(Lru/sanchez/micotian/module/Module;)Z, module));
        guiToggleButton2.addClickListener((ActionListener)new ActionListener(module, guiToggleButton2) {
            final Module val$m;
            final ComponentsListener this$0;
            final GuiToggleButton val$toggleButton;
            
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
            }
            // invokedynamic(3:(Lru/sanchez/micotian/module/Module;Z)V, this.val$m, this.val$toggleButton.isToggled())
        });
        this.add((GuiComponent)guiToggleButton2);
    }
    
    public ComponentsListener(final GuiButton button) {
        this.button = button;
    }
}

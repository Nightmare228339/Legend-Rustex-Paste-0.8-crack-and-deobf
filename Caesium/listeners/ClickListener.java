//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package Caesium.listeners;

import Caesium.components.*;
import java.awt.event.*;
import ru.sanchez.micotian.*;

public class ClickListener implements ActionListener
{
    private GuiButton button;
    
    public ClickListener(final GuiButton button) {
        this.button = button;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        final Micotian instance = Micotian.instance;
        Micotian.moduleManager.getModule(this.button.getText()).toggle();
    }
}

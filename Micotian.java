//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian;

import ru.sanchez.micotian.settings.*;
import Castom.*;
import ru.sanchez.micotian.manager.*;
import ru.sanchez.micotian.events.event.*;
import java.awt.*;
import Bobr.*;
import ru.sanchez.micotian.utils.*;
import net.minecraft.client.*;
import net.minecraftforge.client.*;
import net.minecraft.command.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import ru.sanchez.micotian.module.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.common.*;
import ru.sanchez.micotian.utils.commands.*;
import net.minecraft.util.text.*;
import ru.sanchez.micotian.notifications.*;
import org.lwjgl.opengl.*;

public class Micotian
{
    public SettingsManager settingsManager;
    public static CastomGui CastomGui;
    public static ModuleManager moduleManager;
    public static Micotian instance;
    public static EventManager eventManager;
    public static Color color;
    public static BobrGui bobrGui;
    private RotationManager rotationManager;
    
    public Minecraft mc() {
        return Minecraft.getMinecraft();
    }
    
    static {
        Micotian.color = Color.red;
    }
    
    private void registerCommand() {
        ClientCommandHandler.instance.registerCommand((ICommand)new CommandOffline());
        ClientCommandHandler.instance.registerCommand((ICommand)new CommandGive());
    }
    
    @SubscribeEvent
    public void key(final InputEvent.KeyInputEvent keyInputEvent) {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) {
            return;
        }
        try {
            if (Keyboard.isCreated() && Keyboard.getEventKeyState()) {
                final int eventKey = Keyboard.getEventKey();
                if (eventKey <= 0) {
                    return;
                }
                final Iterator<Module> iterator = Micotian.moduleManager.modules.iterator();
                if (iterator.hasNext()) {
                    final Module module = iterator.next();
                    if (module.getKey() == eventKey && eventKey > 0) {
                        module.toggle();
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void init() throws Exception {
        MinecraftForge.EVENT_BUS.register((Object)this);
        this.registerCommand();
        MinecraftForge.EVENT_BUS.register((Object)new ChatEvent());
        this.settingsManager = new SettingsManager();
        Micotian.moduleManager = new ModuleManager();
        this.rotationManager = new RotationManager();
        Micotian.bobrGui = new BobrGui();
        Micotian.CastomGui = new CastomGui();
        notifications.add(String.valueOf(TextFormatting.RED), "successful injection!", Type.OK);
        Display.setTitle("|| Legend V0.8.0 ||");
    }
    
    public RotationManager getRotationManager() {
        if (this.rotationManager == null) {
            this.rotationManager = new RotationManager();
        }
        return this.rotationManager;
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import java.awt.*;

public class notification
{
    public static void main(final String text) throws Exception {
        if (SystemTray.isSupported()) {
            final SystemTray systemTray = SystemTray.getSystemTray();
            final TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("images/bor.png"));
            systemTray.add(trayIcon);
            trayIcon.displayMessage("Legend", text, TrayIcon.MessageType.INFO);
        }
    }
}

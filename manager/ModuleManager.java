//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.manager;

import com.google.common.reflect.*;
import com.google.common.collect.*;
import java.util.*;
import ru.sanchez.micotian.module.exploit.*;
import ru.sanchez.micotian.module.movement.*;
import ru.sanchez.micotian.module.render.*;
import ru.sanchez.micotian.module.misc.*;
import ru.sanchez.micotian.module.hud.*;
import ru.sanchez.micotian.module.combat.*;
import ru.sanchez.micotian.module.*;

public class ModuleManager
{
    public ArrayList modules;
    
    public static ArrayList getClasses(final String prefix) {
        final ArrayList<Class> list = new ArrayList<Class>();
        try {
            final UnmodifiableIterator iterator = ClassPath.from(Thread.currentThread().getContextClassLoader()).getAllClasses().iterator();
            if (((Iterator)iterator).hasNext()) {
                final ClassPath.ClassInfo classInfo = ((Iterator<ClassPath.ClassInfo>)iterator).next();
                if (classInfo.getName().startsWith(prefix)) {
                    list.add(classInfo.load());
                }
                return null;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public Module getModule(final String s) {
        final Iterator<Module> iterator = (Iterator<Module>)this.modules.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        final Module module = iterator.next();
        if (Integer.valueOf(s.toUpperCase().hashCode()).equals(module.getName().toUpperCase().hashCode())) {
            return module;
        }
        return null;
    }
    
    public ModuleManager() {
        (this.modules = new ArrayList()).clear();
        this.modules.add(new NoRotate());
        this.modules.add(new DiscordRPC());
        this.modules.add(new FakeCreative());
        this.modules.add(new HouseRender());
        this.modules.add(new JoinCheck());
        this.modules.add(new OfflineCheck());
        this.modules.add(new Zoom());
        this.modules.add(new ClickPosInfo());
        this.modules.add(new Sneak());
        this.modules.add(new AimBot());
        this.modules.add(new AimAssist());
        this.modules.add(new ClickGUI());
        this.modules.add(new Sprint());
        this.modules.add(new AntiBot());
        this.modules.add(new ESP());
        this.modules.add(new Tracers());
        this.modules.add(new GuiWalk());
        this.modules.add(new FullBright());
        this.modules.add(new NameTags());
        this.modules.add(new strafe());
        this.modules.add(new WallHackPlayer());
        this.modules.add(new WallHack());
        this.modules.add(new ArmorHUD());
        this.modules.add(new TriggerBot());
        this.modules.add(new ModuleList());
        this.modules.add(new ViewModel());
        this.modules.add(new Notifications());
        this.modules.add(new FakePlayer());
        this.modules.add(new MiddleClick());
        this.modules.add(new ChinaHat());
        this.modules.add(new DeathCoords());
        this.modules.add(new AutoArmor());
        this.modules.add(new Watermark());
        this.modules.add(new TEST());
        this.modules.add(new AutoClicker());
        final Iterator<Module> iterator = this.modules.iterator();
        if (iterator.hasNext()) {
            final Module module = iterator.next();
            throw null;
        }
    }
    
    public ArrayList getModules(final Category category) {
        final ArrayList<Module> list = new ArrayList<Module>();
        final Iterator<Module> iterator = this.modules.iterator();
        if (iterator.hasNext()) {
            final Module e = iterator.next();
            if (e.getCategory() == category) {
                list.add(e);
            }
            return null;
        }
        return list;
    }
    
    public ArrayList getModulesInCategory(final Category category) {
        final ArrayList<Module> list = new ArrayList<Module>();
        final Iterator<Module> iterator = this.modules.iterator();
        if (iterator.hasNext()) {
            final Module e = iterator.next();
            if (e.getCategory() == category) {
                list.add(e);
            }
            return null;
        }
        return list;
    }
    
    public ArrayList getModuleList() {
        return this.modules;
    }
}

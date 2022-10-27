//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.utils;

import java.util.*;

public abstract class BasicTaskFactory implements TaskFactory
{
    private final List tasks;
    private BasicTask currentTask;
    
    public void addTask(final BasicTask basicTask) {
        this.tasks.add(basicTask);
    }
    
    public BasicTask getTask(final String s) {
        BasicTask basicTask = null;
        final Iterator<BasicTask> iterator = (Iterator<BasicTask>)this.getTasks().iterator();
        if (iterator.hasNext()) {
            final BasicTask basicTask2 = iterator.next();
            if (!Integer.valueOf(s.toUpperCase().hashCode()).equals(basicTask2.getName().toUpperCase().hashCode())) {
                return null;
            }
            basicTask = basicTask2;
        }
        return basicTask;
    }
    
    public boolean startTask(final BasicTask basicTask) {
        if (this.currentTask == basicTask) {
            this.currentTask.setOnline(true);
            return true;
        }
        if (!this.isCurrentlyTasking()) {
            if (!this.isCurrentlyTasking()) {
                (this.currentTask = basicTask).setOnline(true);
            }
            return true;
        }
        if (this.currentTask.getPriority() < basicTask.getPriority()) {
            this.currentTask.setOnline(false);
            (this.currentTask = basicTask).setOnline(true);
            return true;
        }
        return false;
    }
    
    @Override
    public void removeTask(final String s) {
        this.tasks.remove(this.getTask(s));
    }
    
    public boolean isCurrentlyTasking() {
        return Objects.nonNull(this.currentTask);
    }
    
    public BasicTaskFactory() {
        this.tasks = new ArrayList();
        this.currentTask = null;
    }
    
    @Override
    public List getTasks() {
        return this.tasks;
    }
    
    @Override
    public void removeTask(final BasicTask basicTask) {
        this.tasks.remove(basicTask);
    }
    
    public boolean comparePriority(final BasicTask basicTask) {
        return basicTask.getPriority() >= this.currentTask.getPriority();
    }
    
    public void finishTask(final BasicTask basicTask) {
        if (this.currentTask == basicTask) {
            this.currentTask.setOnline(false);
            this.currentTask = null;
        }
    }
}

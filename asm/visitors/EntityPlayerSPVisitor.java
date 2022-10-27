//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm.visitors;

import org.objectweb.asm.*;

public class EntityPlayerSPVisitor extends ClassVisitor
{
    final String MOVE;
    final String IS_USER_DESC;
    final String MOVE_DESC;
    final String IS_USER;
    final String ON_UPDATE_WALKING_PLAYER;
    final String ON_UPDATE_WALKING_PLAYER_DESC;
    
    public MethodVisitor visitMethod(final int n, final String str, final String s, final String s2, final String[] array) {
        MethodVisitor visitMethod = super.visitMethod(n, str, s, s2, array);
        if (Integer.valueOf(this.IS_USER.hashCode()).equals(str.hashCode()) && Integer.valueOf(this.IS_USER_DESC.hashCode()).equals(s.hashCode())) {
            System.out.println("Method " + str + " transformed");
            visitMethod = new IsUserVisitor(visitMethod);
        }
        else if (Integer.valueOf(this.MOVE.hashCode()).equals(str.hashCode()) && Integer.valueOf(this.MOVE_DESC.hashCode()).equals(s.hashCode())) {
            System.out.println("Method " + str + " transformed");
            visitMethod = new MoveVisitor(visitMethod);
        }
        else if (Integer.valueOf(this.ON_UPDATE_WALKING_PLAYER.hashCode()).equals(str.hashCode()) && Integer.valueOf(this.ON_UPDATE_WALKING_PLAYER_DESC.hashCode()).equals(s.hashCode())) {
            System.out.println("Method " + str + " transformed");
            visitMethod = new OnUpdateWalkingPlayer(visitMethod);
        }
        return visitMethod;
    }
    
    public EntityPlayerSPVisitor(final ClassVisitor classVisitor, final boolean b) {
        super(327680, classVisitor);
        this.IS_USER = (b ? "cZ" : "isUser");
        this.IS_USER_DESC = "()Z";
        this.MOVE = (b ? "a" : "move");
        this.MOVE_DESC = (b ? "(Lvv;DDD)V" : "(Lnet/minecraft/entity/MoverType;DDD)V");
        this.ON_UPDATE_WALKING_PLAYER = (b ? "N" : "onUpdateWalkingPlayer");
        this.ON_UPDATE_WALKING_PLAYER_DESC = "()V";
    }
    
    public static class IsUserVisitor extends MethodVisitor
    {
        public void visitInsn(final int n) {
            if (n == 172) {
                this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "isUser", "()Z", false);
            }
            super.visitInsn(n);
        }
        
        public IsUserVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
    }
    
    public static class OnUpdateWalkingPlayer extends MethodVisitor
    {
        public OnUpdateWalkingPlayer(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
        
        public void visitCode() {
            super.visitCode();
            this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "onUpdateWalkingPlayer", "()Z", false);
            final Label label = new Label();
            this.mv.visitJumpInsn(153, label);
            this.mv.visitInsn(177);
            this.mv.visitLabel(label);
        }
    }
    
    public static class MoveVisitor extends MethodVisitor
    {
        public void visitCode() {
            this.mv.visitTypeInsn(187, "ru/terrar/bobr/events/PlayerMoveEvent");
            this.mv.visitInsn(89);
            this.mv.visitVarInsn(24, 2);
            this.mv.visitVarInsn(24, 4);
            this.mv.visitVarInsn(24, 6);
            this.mv.visitMethodInsn(183, "ru/internali/events/PlayerMoveEvent", "<init>", "(DDD)V", false);
            this.mv.visitVarInsn(58, 8);
            this.mv.visitFieldInsn(178, "net/minecraftforge/common/MinecraftForge", "EVENT_BUS", "Lnet/minecraftforge/fml/common/eventhandler/EventBus;");
            this.mv.visitVarInsn(25, 8);
            this.mv.visitMethodInsn(182, "net/minecraftforge/fml/common/eventhandler/EventBus", "post", "(Lnet/minecraftforge/fml/common/eventhandler/Event;)Z", false);
            final Label label = new Label();
            this.mv.visitJumpInsn(153, label);
            this.mv.visitInsn(177);
            this.mv.visitLabel(label);
            this.mv.visitFrame(1, 1, new Object[] { "ru/internali/events/PlayerMoveEvent" }, 0, (Object[])null);
            this.mv.visitVarInsn(25, 8);
            this.mv.visitFieldInsn(180, "ru/internali/events/PlayerMoveEvent", "x", "D");
            this.mv.visitVarInsn(57, 2);
            this.mv.visitVarInsn(25, 8);
            this.mv.visitFieldInsn(180, "ru/internali/events/PlayerMoveEvent", "y", "D");
            this.mv.visitVarInsn(57, 4);
            this.mv.visitVarInsn(25, 8);
            this.mv.visitFieldInsn(180, "ru/internali/events/PlayerMoveEvent", "z", "D");
            this.mv.visitVarInsn(57, 6);
            super.visitCode();
        }
        
        public MoveVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
    }
}

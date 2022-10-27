//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm.visitors;

import org.objectweb.asm.*;

public class VisGraphVisitor extends ClassVisitor
{
    final String SET_OPAQUE_DESCRIPTOR;
    final String SET_OPAQUE;
    
    public VisGraphVisitor(final ClassVisitor classVisitor, final boolean b) {
        super(327680, classVisitor);
        this.SET_OPAQUE = (b ? "a" : "setOpaqueCube");
        this.SET_OPAQUE_DESCRIPTOR = (b ? "(Let;)V" : "(Lnet/minecraft/util/math/BlockPos;)V");
    }
    
    public MethodVisitor visitMethod(final int n, final String s, final String s2, final String s3, final String[] array) {
        MethodVisitor visitMethod = this.cv.visitMethod(n, s, s2, s3, array);
        if (Integer.valueOf(this.SET_OPAQUE.hashCode()).equals(s.hashCode()) && Integer.valueOf(this.SET_OPAQUE_DESCRIPTOR.hashCode()).equals(s2.hashCode())) {
            visitMethod = new SetOpaqueCubeVisitor(visitMethod);
            System.out.println("Method " + this.SET_OPAQUE + " transformed");
        }
        return visitMethod;
    }
    
    public static class SetOpaqueCubeVisitor extends MethodVisitor
    {
        public SetOpaqueCubeVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
        
        public void visitCode() {
            super.visitCode();
            final Label label = new Label();
            this.mv.visitLabel(label);
            this.mv.visitLineNumber(29, label);
            this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "setOpaqueCube", "()Z", false);
            final Label label2 = new Label();
            this.mv.visitJumpInsn(153, label2);
            final Label label3 = new Label();
            this.mv.visitLabel(label3);
            this.mv.visitLineNumber(30, label3);
            this.mv.visitInsn(177);
            this.mv.visitLabel(label2);
            this.mv.visitLineNumber(32, label2);
            this.mv.visitFrame(3, 0, (Object[])null, 0, (Object[])null);
        }
    }
}

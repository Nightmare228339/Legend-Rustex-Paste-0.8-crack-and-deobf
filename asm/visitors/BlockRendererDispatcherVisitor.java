//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm.visitors;

import org.objectweb.asm.*;

public class BlockRendererDispatcherVisitor extends ClassVisitor
{
    final String RENDER_BLOCK_DESCRIPTOR;
    final String RENDER_MODEL_FLAT;
    
    public BlockRendererDispatcherVisitor(final ClassVisitor classVisitor, final boolean b) {
        super(327680, classVisitor);
        this.RENDER_MODEL_FLAT = (b ? "a" : "renderBlock");
        this.RENDER_BLOCK_DESCRIPTOR = (b ? "(Lawt;Let;Lamy;Lbuk;)Z" : "(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/BufferBuilder;)Z");
    }
    
    public MethodVisitor visitMethod(final int n, final String str, final String s, final String s2, final String[] array) {
        MethodVisitor visitMethod = super.visitMethod(n, str, s, s2, array);
        if (Integer.valueOf(this.RENDER_MODEL_FLAT.hashCode()).equals(str.hashCode()) && Integer.valueOf(this.RENDER_BLOCK_DESCRIPTOR.hashCode()).equals(s.hashCode())) {
            System.out.println("Method " + str + " transformed");
            visitMethod = new RenderBlockVisitor(visitMethod);
        }
        return visitMethod;
    }
    
    public static class RenderBlockVisitor extends MethodVisitor
    {
        public RenderBlockVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
        
        public void visitCode() {
            super.visitCode();
            this.mv.visitVarInsn(25, 1);
            this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "renderBlock", "(Lnet/minecraft/block/state/IBlockState;)Z", false);
            final Label label = new Label();
            this.mv.visitJumpInsn(153, label);
            final Label label2 = new Label();
            this.mv.visitLabel(label2);
            this.mv.visitLineNumber(17, label2);
            this.mv.visitInsn(3);
            this.mv.visitInsn(172);
            this.mv.visitLabel(label);
            this.mv.visitLineNumber(19, label);
            this.mv.visitFrame(3, 0, (Object[])null, 0, (Object[])null);
        }
    }
}

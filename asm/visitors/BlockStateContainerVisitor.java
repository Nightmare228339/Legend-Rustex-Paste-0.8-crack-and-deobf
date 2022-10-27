//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm.visitors;

import org.objectweb.asm.*;

public class BlockStateContainerVisitor extends ClassVisitor
{
    final String SHOULD_SIDE_DESCRIPTOR;
    final String SHOULD_SIDE;
    final String GET_LIGHT_DESCRIPTOR;
    final String GET_LIGHT;
    
    public MethodVisitor visitMethod(final int n, final String s, final String s2, final String s3, final String[] array) {
        MethodVisitor visitMethod = super.visitMethod(n, s, s2, s3, array);
        if (Integer.valueOf(this.SHOULD_SIDE.hashCode()).equals(s.hashCode()) && Integer.valueOf(this.SHOULD_SIDE_DESCRIPTOR.hashCode()).equals(s2.hashCode())) {
            visitMethod = new ShouldSideBeRenderedVisitor(visitMethod);
            System.out.println("Method " + s + " transformed");
        }
        else if (Integer.valueOf(this.GET_LIGHT.hashCode()).equals(s.hashCode()) && Integer.valueOf(this.GET_LIGHT_DESCRIPTOR.hashCode()).equals(s2.hashCode())) {
            visitMethod = new GetAmbientOcclusionLightValueVisitor(visitMethod);
            System.out.println("Method " + s + " transformed");
        }
        return visitMethod;
    }
    
    public BlockStateContainerVisitor(final ClassVisitor classVisitor, final boolean b) {
        super(327680, classVisitor);
        this.SHOULD_SIDE = (b ? "c" : "shouldSideBeRendered");
        this.SHOULD_SIDE_DESCRIPTOR = (b ? "(Lamy;Let;Lfa;)Z" : "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z");
        this.GET_LIGHT = (b ? "j" : "getAmbientOcclusionLightValue");
        this.GET_LIGHT_DESCRIPTOR = "()F";
    }
    
    public static class ShouldSideBeRenderedVisitor extends MethodVisitor
    {
        public ShouldSideBeRenderedVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
        
        public void visitInsn(final int n) {
            if (n == 172) {
                this.mv.visitVarInsn(25, 0);
                this.mv.visitVarInsn(25, 1);
                this.mv.visitVarInsn(25, 2);
                this.mv.visitVarInsn(25, 3);
                this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "shouldSideBeRendered", "(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z", false);
            }
            super.visitInsn(n);
        }
    }
    
    public static class GetAmbientOcclusionLightValueVisitor extends MethodVisitor
    {
        public GetAmbientOcclusionLightValueVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
        
        public void visitInsn(final int n) {
            if (n == 174) {
                this.mv.visitVarInsn(25, 0);
                this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "getAmbientOcclusionLightValue", "(Lnet/minecraft/block/state/IBlockState;)F", false);
            }
            super.visitInsn(n);
        }
    }
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm.visitors;

import org.objectweb.asm.*;

public class BlockLiquidVisitor extends ClassVisitor
{
    final String GET_COLLISION;
    final String GET_COLLISION_DESC;
    
    public BlockLiquidVisitor(final ClassVisitor classVisitor, final boolean b) {
        super(327680, classVisitor);
        this.GET_COLLISION = (b ? "a" : "getCollisionBoundingBox");
        this.GET_COLLISION_DESC = (b ? "(Lawt;Lamy;Let;)Lbhb;" : "(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;");
    }
    
    public MethodVisitor visitMethod(final int n, final String str, final String s, final String s2, final String[] array) {
        MethodVisitor visitMethod = super.visitMethod(n, str, s, s2, array);
        if (Integer.valueOf(this.GET_COLLISION.hashCode()).equals(str.hashCode()) && Integer.valueOf(this.GET_COLLISION_DESC.hashCode()).equals(s.hashCode())) {
            System.out.println("Method " + str + " transformed");
            visitMethod = new GetCollisionBoundingBoxVisitor(visitMethod);
        }
        return visitMethod;
    }
    
    public static class GetCollisionBoundingBoxVisitor extends MethodVisitor
    {
        public void visitInsn(final int n) {
            if (n == 176) {
                this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "getCollisionBoundingBox", "()Lnet/minecraft/util/math/AxisAlignedBB;", false);
            }
            super.visitInsn(n);
        }
        
        public GetCollisionBoundingBoxVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
    }
}

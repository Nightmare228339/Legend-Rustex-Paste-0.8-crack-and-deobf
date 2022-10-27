//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.module.movement;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import ru.sanchez.micotian.module.*;

public class strafe extends Module
{
    public static void strafe() {
        strafe(getSpeed());
    }
    
    public static double getDirection() {
        float n = invokedynamic(12:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, strafe.mc.player);
        if (invokedynamic(13:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, strafe.mc.player) < 0.0f) {
            n += 180.0f;
        }
        float n2 = 1.0f;
        if (invokedynamic(13:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, strafe.mc.player) < 0.0f) {
            n2 = -0.5f;
        }
        else if (invokedynamic(13:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, strafe.mc.player) > 0.0f) {
            n2 = 0.5f;
        }
        if (invokedynamic(14:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, strafe.mc.player) > 0.0f) {
            n -= 90.0f * n2;
        }
        if (invokedynamic(14:(Lnet/minecraft/client/entity/EntityPlayerSP;)F, strafe.mc.player) < 0.0f) {
            n += 90.0f * n2;
        }
        return Math.toRadians(n);
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent playerTickEvent) {
        strafe();
    }
    
    public static void strafe(final float p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: return         
        //     4: invokestatic    ru/sanchez/micotian/module/movement/strafe.getDirection:()D
        //     7: dstore_1       
        //     8: getstatic       ru/sanchez/micotian/module/movement/strafe.mc:Lnet/minecraft/client/Minecraft;
        //    11: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    14: dload_1        
        //    15: invokestatic    java/lang/Math.sin:(D)D
        //    18: dneg           
        //    19: fload_0        
        //    20: f2d            
        //    21: dmul           
        //    22: putfield        net/minecraft/client/entity/EntityPlayerSP.motionX:D
        //    25: getstatic       ru/sanchez/micotian/module/movement/strafe.mc:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: dload_1        
        //    32: invokestatic    java/lang/Math.cos:(D)D
        //    35: fload_0        
        //    36: f2d            
        //    37: dmul           
        //    38: putfield        net/minecraft/client/entity/EntityPlayerSP.motionZ:D
        //    41: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:359)
        //     at java.base/java.util.ArrayList.remove(ArrayList.java:504)
        //     at com.strobel.assembler.ir.StackMappingVisitor.pop(StackMappingVisitor.java:267)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static float getSpeed() {
        return (float)Math.sqrt(invokedynamic(9:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, strafe.mc.player) * invokedynamic(9:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, strafe.mc.player) + invokedynamic(10:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, strafe.mc.player) * invokedynamic(10:(Lnet/minecraft/client/entity/EntityPlayerSP;)D, strafe.mc.player));
    }
    
    public strafe() {
        super("Strafe", Category.MOVEMENT);
    }
}

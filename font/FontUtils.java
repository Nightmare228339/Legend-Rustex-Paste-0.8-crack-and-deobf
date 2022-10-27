//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.font;

import java.awt.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class FontUtils
{
    public static volatile int completed;
    private static Font normal_;
    public static MinecraftFontRenderer normal;
    
    public static void bootstrap() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokedynamic   BootstrapMethod #0, run:()Ljava/lang/Runnable;
        //     9: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //    12: invokevirtual   java/lang/Thread.start:()V
        //    15: new             Ljava/lang/Thread;
        //    18: dup            
        //    19: invokedynamic   BootstrapMethod #1, run:()Ljava/lang/Runnable;
        //    24: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //    27: invokevirtual   java/lang/Thread.start:()V
        //    30: new             Ljava/lang/Thread;
        //    33: dup            
        //    34: invokedynamic   BootstrapMethod #2, run:()Ljava/lang/Runnable;
        //    39: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //    42: invokevirtual   java/lang/Thread.start:()V
        //    45: if_icmplt       61
        //    48: ldc2_w          5
        //    51: invokestatic    java/lang/Thread.sleep:(J)V
        //    54: return         
        //    55: astore_0       
        //    56: aload_0        
        //    57: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //    60: return         
        //    61: new             Lru/sanchez/micotian/font/MinecraftFontRenderer;
        //    64: dup            
        //    65: getstatic       ru/sanchez/micotian/font/FontUtils.normal_:Ljava/awt/Font;
        //    68: iconst_1       
        //    69: iconst_1       
        //    70: invokespecial   ru/sanchez/micotian/font/MinecraftFontRenderer.<init>:(Ljava/awt/Font;ZZ)V
        //    73: putstatic       ru/sanchez/micotian/font/FontUtils.normal:Lru/sanchez/micotian/font/MinecraftFontRenderer;
        //    76: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  48     54     55     61     Ljava/lang/InterruptedException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:599)
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
    
    private static void lambda$bootstrap$2() {
        final HashMap hashMap = new HashMap();
    }
    // invokedynamic(17:(I)V, invokedynamic(10:()I) + 1)
    
    private static void lambda$bootstrap$0() {
        FontUtils.normal_ = getFont(new HashMap(), "font.otf", 10);
    }
    // invokedynamic(17:(I)V, invokedynamic(10:()I) + 1)
    
    private static Font getFont(final Map map, final String s, final int n) {
        Font font;
        try {
            if (map.containsKey(s)) {
                font = map.get(s).deriveFont(0, (float)n);
            }
            else {
                final Font font2 = Font.createFont(0, Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(s)).getInputStream());
                map.put(s, font2);
                font = font2.deriveFont(0, (float)n);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            font = new Font("default", 0, 10);
        }
        return font;
    }
    
    private static void lambda$bootstrap$1() {
        final HashMap hashMap = new HashMap();
    }
    // invokedynamic(17:(I)V, invokedynamic(10:()I) + 1)
}

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm;

import net.minecraft.launchwrapper.*;
import org.objectweb.asm.*;
import ru.sanchez.micotian.asm.visitors.*;
import java.util.*;

public class InternaliClassTransformer implements IClassTransformer
{
    private static final String[] transformedClasses;
    
    public byte[] transform(final int n, final byte[] array, final boolean b) {
        System.out.println("Transforming " + InternaliClassTransformer.transformedClasses[n]);
        try {
            final ClassReader classReader = new ClassReader(array);
            final ClassWriter classWriter = new ClassWriter(3);
            Object o = null;
            switch (n) {
                case 0: {
                    o = new VisGraphVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                case 1: {
                    o = new EntityRendererVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                case 2: {
                    o = new NetworkManagerVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                case 3: {
                    o = new BlockRendererDispatcherVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                case 4: {
                    o = new BlockStateContainerVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                case 5: {
                    o = new BlockLiquidVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                case 6: {
                    o = new EntityPlayerSPVisitor((ClassVisitor)classWriter, b);
                    break;
                }
                default: {
                    o = new ClassVisitor(327680, (ClassVisitor)classWriter) {
                        final InternaliClassTransformer this$0;
                    };
                    break;
                }
            }
            classReader.accept((ClassVisitor)o, 0);
            return classWriter.toByteArray();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return array;
        }
    }
    
    public byte[] transform(final String s, final String s2, final byte[] array) {
        final boolean b = !Integer.valueOf(s2.hashCode()).equals(s.hashCode());
        final int index = Arrays.asList(InternaliClassTransformer.transformedClasses).indexOf(s2);
        return (index != -1) ? this.transform(index, array, b) : array;
    }
    
    static {
        transformedClasses = new String[] { "net.minecraft.client.renderer.chunk.VisGraph", "net.minecraft.client.renderer.EntityRenderer", "net.minecraft.network.NetworkManager", "net.minecraft.client.renderer.BlockRendererDispatcher", "net.minecraft.block.state.BlockStateContainer$StateImplementation", "net.minecraft.block.BlockLiquid", "net.minecraft.client.entity.EntityPlayerSP" };
    }
}

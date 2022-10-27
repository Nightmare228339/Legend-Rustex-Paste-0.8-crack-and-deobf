//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.asm.visitors;

import org.objectweb.asm.*;

public class NetworkManagerVisitor extends ClassVisitor
{
    final String CHANNEL_READ_0_DESCRIPTOR;
    final String SEND_PACKET_DESCRIPTOR2;
    final String SEND_PACKET;
    final String SEND_PACKET_DESCRIPTOR;
    final String CHANNEL_READ_0;
    
    public MethodVisitor visitMethod(final int n, final String s, final String s2, final String s3, final String[] array) {
        MethodVisitor visitMethod = this.cv.visitMethod(n, s, s2, s3, array);
        if (Integer.valueOf(this.SEND_PACKET.hashCode()).equals(s.hashCode()) && (Integer.valueOf(this.SEND_PACKET_DESCRIPTOR.hashCode()).equals(s2.hashCode()) || Integer.valueOf(this.SEND_PACKET_DESCRIPTOR2.hashCode()).equals(s2.hashCode()))) {
            visitMethod = new SendPacketVisitor(visitMethod);
            System.out.println("Method " + this.SEND_PACKET + " transformed");
        }
        else if (Integer.valueOf(this.CHANNEL_READ_0.hashCode()).equals(s.hashCode()) && Integer.valueOf(this.CHANNEL_READ_0_DESCRIPTOR.hashCode()).equals(s2.hashCode())) {
            visitMethod = new ChannelRead0Visitor(visitMethod);
        }
        return visitMethod;
    }
    
    public NetworkManagerVisitor(final ClassVisitor classVisitor, final boolean b) {
        super(327680, classVisitor);
        this.SEND_PACKET = (b ? "a" : "sendPacket");
        this.SEND_PACKET_DESCRIPTOR = (b ? "(Lht;)V" : "(Lnet/minecraft/network/Packet;)V");
        this.SEND_PACKET_DESCRIPTOR2 = (b ? "(Lht;Lio/netty/util/concurrent/GenericFutureListener;[Lio/netty/util/concurrent/GenericFutureListener;)V" : "(Lnet/minecraft/network/Packet;Lio/netty/util/concurrent/GenericFutureListener;[Lio/netty/util/concurrent/GenericFutureListener;)V");
        this.CHANNEL_READ_0 = (b ? "a" : "channelRead0");
        this.CHANNEL_READ_0_DESCRIPTOR = (b ? "(Lio/netty/channel/ChannelHandlerContext;Lht;)V" : "(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/Packet;)V");
    }
    
    public static class SendPacketVisitor extends MethodVisitor
    {
        public void visitCode() {
            super.visitCode();
            this.mv.visitVarInsn(25, 1);
            this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "onSendPacket", "(Lnet/minecraft/network/Packet;)Lnet/minecraft/network/Packet;", false);
            this.mv.visitVarInsn(58, 1);
            this.mv.visitVarInsn(25, 1);
            final Label label = new Label();
            this.mv.visitJumpInsn(199, label);
            this.mv.visitInsn(177);
            this.mv.visitLabel(label);
            this.mv.visitFrame(3, 0, (Object[])null, 0, (Object[])null);
        }
        
        public SendPacketVisitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
    }
    
    public static class ChannelRead0Visitor extends MethodVisitor
    {
        public void visitCode() {
            super.visitCode();
            this.mv.visitVarInsn(25, 2);
            this.mv.visitMethodInsn(184, "ru/internali/utils/EventFactory", "onReceivePacket", "(Lnet/minecraft/network/Packet;)Lnet/minecraft/network/Packet;", false);
            this.mv.visitVarInsn(58, 2);
            this.mv.visitVarInsn(25, 2);
            final Label label = new Label();
            this.mv.visitJumpInsn(199, label);
            this.mv.visitInsn(177);
            this.mv.visitLabel(label);
            this.mv.visitFrame(3, 0, (Object[])null, 0, (Object[])null);
        }
        
        public ChannelRead0Visitor(final MethodVisitor methodVisitor) {
            super(327680, methodVisitor);
        }
    }
}

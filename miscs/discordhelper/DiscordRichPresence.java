//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.miscs.discordhelper;

import com.sun.jna.*;
import java.util.*;

public class DiscordRichPresence extends Structure
{
    public String joinSecret;
    public byte instance;
    public String smallImageText;
    public String partyId;
    public long startTimestamp;
    public int partySize;
    public int partyMax;
    public String details;
    public String state;
    public String matchSecret;
    public String smallImageKey;
    public String largeImageText;
    public String spectateSecret;
    private static final List FIELD_ORDER;
    public long endTimestamp;
    public String largeImageKey;
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscordRichPresence)) {
            return false;
        }
        final DiscordRichPresence discordRichPresence = (DiscordRichPresence)o;
        return invokedynamic(1:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)J, this) == invokedynamic(1:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)J, discordRichPresence) && invokedynamic(2:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)J, this) == invokedynamic(2:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)J, discordRichPresence) && invokedynamic(3:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)I, this) == invokedynamic(3:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)I, discordRichPresence) && invokedynamic(4:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)I, this) == invokedynamic(4:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)I, discordRichPresence) && invokedynamic(5:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)B, this) == invokedynamic(5:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)B, discordRichPresence) && Objects.equals(this.state, discordRichPresence.state) && Objects.equals(this.details, discordRichPresence.details) && Objects.equals(this.largeImageKey, discordRichPresence.largeImageKey) && Objects.equals(this.largeImageText, discordRichPresence.largeImageText) && Objects.equals(this.smallImageKey, discordRichPresence.smallImageKey) && Objects.equals(this.smallImageText, discordRichPresence.smallImageText) && Objects.equals(this.partyId, discordRichPresence.partyId) && Objects.equals(this.matchSecret, discordRichPresence.matchSecret) && Objects.equals(this.joinSecret, discordRichPresence.joinSecret) && Objects.equals(this.spectateSecret, discordRichPresence.spectateSecret);
    }
    
    protected List getFieldOrder() {
        return DiscordRichPresence.FIELD_ORDER;
    }
    
    public DiscordRichPresence() {
        this("UTF-8");
    }
    
    public int hashCode() {
        return Objects.hash(this.state, this.details, Long.valueOf(invokedynamic(1:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)J, this)), Long.valueOf(invokedynamic(2:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)J, this)), this.largeImageKey, this.largeImageText, this.smallImageKey, this.smallImageText, this.partyId, Integer.valueOf(invokedynamic(3:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)I, this)), Integer.valueOf(invokedynamic(4:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)I, this)), this.matchSecret, this.joinSecret, this.spectateSecret, Byte.valueOf(invokedynamic(5:(Lru/sanchez/micotian/miscs/discordhelper/DiscordRichPresence;)B, this)));
    }
    
    public DiscordRichPresence(final String stringEncoding) {
        this.setStringEncoding(stringEncoding);
    }
    
    static {
        FIELD_ORDER = Collections.unmodifiableList((List<?>)Arrays.asList("state", "details", "startTimestamp", "endTimestamp", "largeImageKey", "largeImageText", "smallImageKey", "smallImageText", "partyId", "partySize", "partyMax", "matchSecret", "joinSecret", "spectateSecret", "instance"));
    }
}

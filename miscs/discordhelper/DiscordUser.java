//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.miscs.discordhelper;

import com.sun.jna.*;
import java.util.*;

public class DiscordUser extends Structure
{
    private static final List FIELD_ORDER;
    public String username;
    public String discriminator;
    public String avatar;
    public String userId;
    
    protected List getFieldOrder() {
        return DiscordUser.FIELD_ORDER;
    }
    
    public int hashCode() {
        return Objects.hash(this.userId, this.username, this.discriminator, this.avatar);
    }
    
    static {
        FIELD_ORDER = Collections.unmodifiableList((List<?>)Arrays.asList("userId", "username", "discriminator", "avatar"));
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscordUser)) {
            return false;
        }
        final DiscordUser discordUser = (DiscordUser)o;
        return Objects.equals(this.userId, discordUser.userId) && Objects.equals(this.username, discordUser.username) && Objects.equals(this.discriminator, discordUser.discriminator) && Objects.equals(this.avatar, discordUser.avatar);
    }
    
    public DiscordUser(final String stringEncoding) {
        this.setStringEncoding(stringEncoding);
    }
    
    public DiscordUser() {
        this("UTF-8");
    }
}

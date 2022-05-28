package x.KenKOfficial.Censure.Listeners;

import org.bukkit.event.player.*;
import x.KenKOfficial.Censure.Main.*;
import x.KenKOfficial.Censure.Utils.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] Il;
    private static final /* synthetic */ String[] I;
    
    static {
        IlIl();
        lIIl();
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IIlIllIllllllll) {
        final Player lIlIllIllllllll = IIlIllIllllllll.getPlayer();
        if (llIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.I[PlayerJoin.Il[0]]) ? 1 : 0) && llIl(lIlIllIllllllll.hasPermission(PlayerJoin.I[PlayerJoin.Il[1]]) ? 1 : 0)) {
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[2]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[3]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[4]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[5]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[6]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[7]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.I[PlayerJoin.Il[8]]).append(Bukkit.getBukkitVersion()))));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[9]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[10]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[11]]));
            lIlIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.Il[12]]));
        }
    }
    
    private static String l(String llIIIlIllllllll, final String lllIIlIllllllll) {
        llIIIlIllllllll = new String(Base64.getDecoder().decode(llIIIlIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIIlIllllllll = new StringBuilder();
        final char[] lIlIIlIllllllll = lllIIlIllllllll.toCharArray();
        int IIlIIlIllllllll = PlayerJoin.Il[0];
        final float IllllIIllllllll = (Object)llIIIlIllllllll.toCharArray();
        final Exception lIlllIIllllllll = (Exception)IllllIIllllllll.length;
        short IIlllIIllllllll = (short)PlayerJoin.Il[0];
        while (IIll(IIlllIIllllllll, (int)lIlllIIllllllll)) {
            final char lIIlIlIllllllll = IllllIIllllllll[IIlllIIllllllll];
            IllIIlIllllllll.append((char)(lIIlIlIllllllll ^ lIlIIlIllllllll[IIlIIlIllllllll % lIlIIlIllllllll.length]));
            "".length();
            ++IIlIIlIllllllll;
            ++IIlllIIllllllll;
            "".length();
            if ("   ".length() > (66 + 61 - 90 + 122 ^ 147 + 77 - 142 + 73)) {
                return null;
            }
        }
        return String.valueOf(IllIIlIllllllll);
    }
    
    private static String ll(final String llIIlIIllllllll, final String IlIIlIIllllllll) {
        try {
            final SecretKeySpec IllIlIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIlIIllllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.Il[8]), "DES");
            final Cipher lIlIlIIllllllll = Cipher.getInstance("DES");
            lIlIlIIllllllll.init(PlayerJoin.Il[2], IllIlIIllllllll);
            return new String(lIlIlIIllllllll.doFinal(Base64.getDecoder().decode(llIIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlIIllllllll) {
            IIlIlIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIll(final int IllllllIlllllll, final int lIlllllIlllllll) {
        return IllllllIlllllll < lIlllllIlllllll;
    }
    
    private static void IlIl() {
        (Il = new int[14])[0] = ((0x45 ^ 0x3) & ~(0x34 ^ 0x72));
        PlayerJoin.Il[1] = " ".length();
        PlayerJoin.Il[2] = "  ".length();
        PlayerJoin.Il[3] = "   ".length();
        PlayerJoin.Il[4] = (0x6C ^ 0x68);
        PlayerJoin.Il[5] = (0xC1 ^ 0xB5 ^ (0x3C ^ 0x4D));
        PlayerJoin.Il[6] = (0xAE ^ 0xA8);
        PlayerJoin.Il[7] = (0x2E ^ 0x19 ^ (0x64 ^ 0x54));
        PlayerJoin.Il[8] = (0xEE ^ 0xA8 ^ (0xD3 ^ 0x9D));
        PlayerJoin.Il[9] = (0xB8 ^ 0x91 ^ (0xB1 ^ 0x91));
        PlayerJoin.Il[10] = (0xA3 ^ 0xA9);
        PlayerJoin.Il[11] = (0x4C ^ 0x47);
        PlayerJoin.Il[12] = (0xBF ^ 0xB3);
        PlayerJoin.Il[13] = (0xE4 ^ 0x95 ^ (0x38 ^ 0x44));
    }
    
    private static String Ill(final String IIlIIIIllllllll, final String lIlIIIIllllllll) {
        try {
            final SecretKeySpec lIIlIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIlIIIllllllll = Cipher.getInstance("Blowfish");
            IIIlIIIllllllll.init(PlayerJoin.Il[2], lIIlIIIllllllll);
            return new String(IIIlIIIllllllll.doFinal(Base64.getDecoder().decode(IIlIIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIllllllll) {
            lllIIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIl() {
        (I = new String[PlayerJoin.Il[13]])[PlayerJoin.Il[0]] = l("IikCDR88Gh4EED0=", "REwjv");
        PlayerJoin.I[PlayerJoin.Il[1]] = l("ECoPIgANLxk5EQ1vCygOAS9EPA8dJgMi", "hAjLc");
        PlayerJoin.I[PlayerJoin.Il[2]] = ll("zMsIgAkBrs7k+wO4OXqPEW5TgrQZEVZg840Vn1dG1DomSIeV/31BSuT7A7g5eo8Rbz3/8TBVTAU=", "ZzzfM");
        PlayerJoin.I[PlayerJoin.Il[3]] = Ill("oJ8xiFQTV0o=", "ymlkS");
        PlayerJoin.I[PlayerJoin.Il[4]] = ll("CVP3IKLZMx6mEymyFSXpE3yoMzgy/C25xlq7TRzoyV8=", "KFqzL");
        PlayerJoin.I[PlayerJoin.Il[5]] = Ill("qJ98yOn9nuw=", "UEgyo");
        PlayerJoin.I[PlayerJoin.Il[6]] = ll("b6LMvM2/AhZLknCgwIk5dX5oQgdVAZX1", "gEUzQ");
        PlayerJoin.I[PlayerJoin.Il[7]] = Ill("0AGpLmXjizc=", "XbHWS");
        PlayerJoin.I[PlayerJoin.Il[8]] = l("Un9NOTUZKwMaLVIuHxw/GDhaLDkZMhMaakpjWkgu", "rYznL");
        PlayerJoin.I[PlayerJoin.Il[9]] = l("RA==", "dJzFP");
        PlayerJoin.I[PlayerJoin.Il[10]] = l("c0huNgYnDy0XHDJOGBIBJg81EA8yDTMYU2tUeV8XYVZ3SUB9XGlLR3MJNh0PfU5oQU9nXQ==", "SnYyu");
        PlayerJoin.I[PlayerJoin.Il[11]] = Ill("Jdt09X/ISUk=", "aFnVN");
        PlayerJoin.I[PlayerJoin.Il[12]] = ll("oGf3xAwHVj7wUoFbR3DvCRUlLV5J/j9VSvm5vsc0tFcYTPcYWdTnIfBSgVtHcO8JjtAHt0iYfnM=", "yDiWs");
    }
    
    private static boolean llIl(final int llIllllIlllllll) {
        return llIllllIlllllll != 0;
    }
}

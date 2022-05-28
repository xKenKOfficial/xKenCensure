package x.KenKOfficial.Censure.Listeners;

import java.nio.charset.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Censure.Main.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class AsyncPlayerChat implements Listener
{
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] l;
    
    private static boolean lll(final int lIllllIllllllll) {
        return lIllllIllllllll != 0;
    }
    
    private static void lIl() {
        (l = new int[4])[0] = ((0x8B ^ 0x87 ^ (0x4D ^ 0x23)) & (0xCA ^ 0x8D ^ (0x22 ^ 0x7) ^ -" ".length()));
        AsyncPlayerChat.l[1] = " ".length();
        AsyncPlayerChat.l[2] = "  ".length();
        AsyncPlayerChat.l[3] = "   ".length();
    }
    
    private static void IIl() {
        (I = new String[AsyncPlayerChat.l[3]])[AsyncPlayerChat.l[0]] = I("IyU+AR4LPiM6DzEVLwADJz8+AAk=", "TJLem");
        AsyncPlayerChat.I[AsyncPlayerChat.l[1]] = Il("DhnAj+yCClxwP7tR9YijkE5nFfyo8LjP1x83SlmDn4E=", "bQgQR");
        AsyncPlayerChat.I[AsyncPlayerChat.l[2]] = Il("NEVtzw+5Iag=", "bxWaN");
    }
    
    private static String I(String IIIllIlllllllll, final String IIlllIlllllllll) {
        IIIllIlllllllll = new String(Base64.getDecoder().decode(IIIllIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIllIlllllllll = new StringBuilder();
        final char[] IlIllIlllllllll = IIlllIlllllllll.toCharArray();
        int lIIllIlllllllll = AsyncPlayerChat.l[0];
        final long llIIlIlllllllll = (Object)IIIllIlllllllll.toCharArray();
        final char IlIIlIlllllllll = (char)llIIlIlllllllll.length;
        Exception lIIIlIlllllllll = (Exception)AsyncPlayerChat.l[0];
        while (IIIl((int)lIIIlIlllllllll, IlIIlIlllllllll)) {
            final char IllllIlllllllll = llIIlIlllllllll[lIIIlIlllllllll];
            llIllIlllllllll.append((char)(IllllIlllllllll ^ IlIllIlllllllll[lIIllIlllllllll % IlIllIlllllllll.length]));
            "".length();
            ++lIIllIlllllllll;
            ++lIIIlIlllllllll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llIllIlllllllll);
    }
    
    private static boolean IIIl(final int IIIIIIlllllllll, final int llllllIllllllll) {
        return IIIIIIlllllllll < llllllIllllllll;
    }
    
    static {
        lIl();
        IIl();
    }
    
    @EventHandler
    public void onCensure(final AsyncPlayerChatEvent lIIIlllllllllll) {
        final Player IIIIlllllllllll = lIIIlllllllllll.getPlayer();
        final List<String> llllIllllllllll = (List<String>)Main.getPlugin().getConfig().getStringList(AsyncPlayerChat.I[AsyncPlayerChat.l[0]]);
        final double llIlIllllllllll = (double)llllIllllllllll.iterator();
        while (lll(((Iterator)llIlIllllllllll).hasNext() ? 1 : 0)) {
            final String llIIlllllllllll = ((Iterator<String>)llIlIllllllllll).next();
            if (lll(lIIIlllllllllll.getMessage().toLowerCase().contains(llIIlllllllllll.toLowerCase()) ? 1 : 0)) {
                if (lll(IIIIlllllllllll.hasPermission(AsyncPlayerChat.I[AsyncPlayerChat.l[1]]) ? 1 : 0)) {
                    return;
                }
                final String lIlIlllllllllll = Main.getPlugin().getConfig().getString(AsyncPlayerChat.I[AsyncPlayerChat.l[2]]);
                final String IIlIlllllllllll = lIIIlllllllllll.getMessage().toLowerCase().replace(llIIlllllllllll.toLowerCase(), lIlIlllllllllll);
                lIIIlllllllllll.setMessage(IIlIlllllllllll);
            }
            "".length();
            if (-(68 + 8 + 60 + 8 ^ 105 + 124 - 130 + 50) >= 0) {
                return;
            }
        }
    }
    
    private static String Il(final String IllIIIlllllllll, final String lllIIIlllllllll) {
        try {
            final SecretKeySpec llIlIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIlIIlllllllll = Cipher.getInstance("Blowfish");
            IlIlIIlllllllll.init(AsyncPlayerChat.l[2], llIlIIlllllllll);
            return new String(IlIlIIlllllllll.doFinal(Base64.getDecoder().decode(IllIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIlllllllll) {
            lIIlIIlllllllll.printStackTrace();
            return null;
        }
    }
}

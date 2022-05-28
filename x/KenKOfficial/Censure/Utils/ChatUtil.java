package x.KenKOfficial.Censure.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] IIl;
    private static final /* synthetic */ String[] ll;
    
    private static void IIIIl() {
        (ll = new String[ChatUtil.IIl[8]])[ChatUtil.IIl[0]] = lIll("qkeijK7QXuU=", "xcLTT");
        ChatUtil.ll[ChatUtil.IIl[1]] = Illl("7PjN0w6XzLo=", "Mfgro");
        ChatUtil.ll[ChatUtil.IIl[2]] = Illl("/gMzhJYHBxs=", "biRzT");
        ChatUtil.ll[ChatUtil.IIl[3]] = llll("w5Y=", "maJkq");
        ChatUtil.ll[ChatUtil.IIl[4]] = lIll("01Eg9x/sddM=", "jimiE");
        ChatUtil.ll[ChatUtil.IIl[5]] = llll("w74=", "ULDwG");
        ChatUtil.ll[ChatUtil.IIl[6]] = lIll("Fg2wvPDKEro=", "dLxgq");
        ChatUtil.ll[ChatUtil.IIl[7]] = lIll("dCdnxlAwURw=", "ByQux");
    }
    
    private static String llll(String IIIllIlIlllllll, final String IIlllIlIlllllll) {
        IIIllIlIlllllll = (boolean)new String(Base64.getDecoder().decode(((String)IIIllIlIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIllIlIlllllll = new StringBuilder();
        final char[] IlIllIlIlllllll = IIlllIlIlllllll.toCharArray();
        int lIIllIlIlllllll = ChatUtil.IIl[0];
        final char llIIlIlIlllllll = (Object)((String)IIIllIlIlllllll).toCharArray();
        final char IlIIlIlIlllllll = (char)llIIlIlIlllllll.length;
        char lIIIlIlIlllllll = (char)ChatUtil.IIl[0];
        while (IlIIl(lIIIlIlIlllllll, IlIIlIlIlllllll)) {
            final char IllllIlIlllllll = llIIlIlIlllllll[lIIIlIlIlllllll];
            llIllIlIlllllll.append((char)(IllllIlIlllllll ^ IlIllIlIlllllll[lIIllIlIlllllll % IlIllIlIlllllll.length]));
            "".length();
            ++lIIllIlIlllllll;
            ++lIIIlIlIlllllll;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llIllIlIlllllll);
    }
    
    private static boolean IlIIl(final int IIIIIIlIlllllll, final int llllllIIlllllll) {
        return IIIIIIlIlllllll < llllllIIlllllll;
    }
    
    private static String lIll(final String IIIlIIlIlllllll, final String lllIIIlIlllllll) {
        try {
            final SecretKeySpec llIlIIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIlIIlIlllllll = Cipher.getInstance("Blowfish");
            IlIlIIlIlllllll.init(ChatUtil.IIl[2], llIlIIlIlllllll);
            return new String(IlIlIIlIlllllll.doFinal(Base64.getDecoder().decode(IIIlIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIlIlllllll) {
            lIIlIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    public static String fixColor(final String IllIlllIlllllll) {
        return IllIlllIlllllll.replaceAll(ChatUtil.ll[ChatUtil.IIl[0]], ChatUtil.ll[ChatUtil.IIl[1]]).replace(ChatUtil.ll[ChatUtil.IIl[2]], ChatUtil.ll[ChatUtil.IIl[3]]).replace(ChatUtil.ll[ChatUtil.IIl[4]], ChatUtil.ll[ChatUtil.IIl[5]]).replace(ChatUtil.ll[ChatUtil.IIl[6]], ChatUtil.ll[ChatUtil.IIl[7]]);
    }
    
    private static String Illl(final String lIllIllIlllllll, final String IIllIllIlllllll) {
        try {
            final SecretKeySpec IIIIlllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIllIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.IIl[8]), "DES");
            final Cipher llllIllIlllllll = Cipher.getInstance("DES");
            llllIllIlllllll.init(ChatUtil.IIl[2], IIIIlllIlllllll);
            return new String(llllIllIlllllll.doFinal(Base64.getDecoder().decode(lIllIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIllIlllllll) {
            IlllIllIlllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIl();
        IIIIl();
    }
    
    private static void lIIIl() {
        (IIl = new int[9])[0] = ((49 + 12 + 13 + 120 ^ 110 + 125 - 151 + 54) & (0x9D ^ 0xC7 ^ (0x3 ^ 0x11) ^ -" ".length()));
        ChatUtil.IIl[1] = " ".length();
        ChatUtil.IIl[2] = "  ".length();
        ChatUtil.IIl[3] = "   ".length();
        ChatUtil.IIl[4] = (0x2C ^ 0x28);
        ChatUtil.IIl[5] = (0x31 ^ 0x1B ^ (0xED ^ 0xC2));
        ChatUtil.IIl[6] = (0xF6 ^ 0x91 ^ (0x0 ^ 0x61));
        ChatUtil.IIl[7] = (0x6C ^ 0x6B);
        ChatUtil.IIl[8] = (0x40 ^ 0x48);
    }
}

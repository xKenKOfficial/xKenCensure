package x.KenKOfficial.Censure.Main;

import org.bukkit.plugin.java.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.Censure.Listeners.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] Ill;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ String[] lIl;
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        System.out.println(Main.lIl[Main.Ill[0]]);
        System.out.println(Main.lIl[Main.Ill[1]]);
        System.out.println(Main.lIl[Main.Ill[2]]);
        System.out.println(String.valueOf(new StringBuilder().append(Main.lIl[Main.Ill[3]]).append(Bukkit.getBukkitVersion())));
        System.out.println(Main.lIl[Main.Ill[4]]);
        System.out.println(Main.lIl[Main.Ill[5]]);
        System.out.println(Main.lIl[Main.Ill[6]]);
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIl[Main.Ill[14]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new AsyncPlayerChat(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static void lllIl() {
        (Ill = new int[16])[0] = ((3 + 33 + 13 + 84 ^ 128 + 98 - 196 + 137) & (12 + 132 - 126 + 116 ^ 147 + 77 - 64 + 4 ^ -" ".length()));
        Main.Ill[1] = " ".length();
        Main.Ill[2] = "  ".length();
        Main.Ill[3] = "   ".length();
        Main.Ill[4] = (0x99 ^ 0x9D);
        Main.Ill[5] = ("  ".length() ^ (0x81 ^ 0x86));
        Main.Ill[6] = (0xAA ^ 0xAC);
        Main.Ill[7] = (19 + 117 - 109 + 116 ^ 16 + 127 - 124 + 117);
        Main.Ill[8] = (0xAE ^ 0xA6);
        Main.Ill[9] = (0x58 ^ 0x51);
        Main.Ill[10] = (0x76 ^ 0x17 ^ (0xAA ^ 0xC1));
        Main.Ill[11] = (0x82 ^ 0x89);
        Main.Ill[12] = (0x83 ^ 0x9F ^ (0x1D ^ 0xD));
        Main.Ill[13] = (0x65 ^ 0x68);
        Main.Ill[14] = (0x5A ^ 0x71 ^ (0x32 ^ 0x17));
        Main.Ill[15] = (0x4B ^ 0x44);
    }
    
    private static boolean IIIll(final int IlllllllIllllll, final int lIllllllIllllll) {
        return IlllllllIllllll < lIllllllIllllll;
    }
    
    private static String llIIl(String lIIlIIIIlllllll, final String IIIlIIIIlllllll) {
        lIIlIIIIlllllll = new String(Base64.getDecoder().decode(lIIlIIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllIIIIlllllll = new StringBuilder();
        final char[] llIlIIIIlllllll = IIIlIIIIlllllll.toCharArray();
        int IlIlIIIIlllllll = Main.Ill[0];
        final char IIlIIIIIlllllll = (Object)lIIlIIIIlllllll.toCharArray();
        final short llIIIIIIlllllll = (short)IIlIIIIIlllllll.length;
        boolean IlIIIIIIlllllll = Main.Ill[0] != 0;
        while (IIIll(IlIIIIIIlllllll ? 1 : 0, llIIIIIIlllllll)) {
            final char llllIIIIlllllll = IIlIIIIIlllllll[IlIIIIIIlllllll];
            IIllIIIIlllllll.append((char)(llllIIIIlllllll ^ llIlIIIIlllllll[IlIlIIIIlllllll % llIlIIIIlllllll.length]));
            "".length();
            ++IlIlIIIIlllllll;
            ++IlIIIIIIlllllll;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIllIIIIlllllll);
    }
    
    private static String lIlIl(final String llIlIlIIlllllll, final String IIIlIlIIlllllll) {
        try {
            final SecretKeySpec IlllIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIlIIlllllll.getBytes(StandardCharsets.UTF_8)), Main.Ill[8]), "DES");
            final Cipher lIllIlIIlllllll = Cipher.getInstance("DES");
            lIllIlIIlllllll.init(Main.Ill[2], IlllIlIIlllllll);
            return new String(lIllIlIIlllllll.doFinal(Base64.getDecoder().decode(llIlIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIlIIlllllll) {
            IIllIlIIlllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIl();
        IllIl();
    }
    
    private static String IIlIl(final String IIlllIIIlllllll, final String llIllIIIlllllll) {
        try {
            final SecretKeySpec lIIIIlIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIIlIIlllllll = Cipher.getInstance("Blowfish");
            IIIIIlIIlllllll.init(Main.Ill[2], lIIIIlIIlllllll);
            return new String(IIIIIlIIlllllll.doFinal(Base64.getDecoder().decode(IIlllIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIlllllll) {
            lllllIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.lIl[Main.Ill[7]]);
        System.out.println(Main.lIl[Main.Ill[8]]);
        System.out.println(Main.lIl[Main.Ill[9]]);
        System.out.println(String.valueOf(new StringBuilder().append(Main.lIl[Main.Ill[10]]).append(Bukkit.getBukkitVersion())));
        System.out.println(Main.lIl[Main.Ill[11]]);
        System.out.println(Main.lIl[Main.Ill[12]]);
        System.out.println(Main.lIl[Main.Ill[13]]);
    }
    
    private static void IllIl() {
        (lIl = new String[Main.Ill[15]])[Main.Ill[0]] = llIIl("TmRFR3FOZEVHcU5kRUdxTmRFR3FOZEVHcU5kRUdxTmRFR3FOZEVHcU5kRUdxTmRFR3FOZEVHcU5kRUc=", "mGfdR");
        Main.lIl[Main.Ill[1]] = IIlIl("kPAUgXE1FVrUIGpeieEEGw==", "luFRv");
        Main.lIl[Main.Ill[2]] = lIlIl("SjtYneGXFFgBbVDuEAa3gz3dZXr6xCQU", "dlhDh");
        Main.lIl[Main.Ill[3]] = lIlIl("FJmRdgH1wZdVlas48poSo8xBXXnMvy9J", "paOpo");
        Main.lIl[Main.Ill[4]] = llIIl("CREzCAQnDSYfCmk=", "HzGqs");
        Main.lIl[Main.Ill[5]] = lIlIl("ILR7zR27DCEXzRMyYWWPyfnWc4exz3l5jJ4Jm8sFqm41eh5B0ShrjOWDJ7VxhjsmtuAL+pBoKmBT024vsD4jAw==", "ASdJr");
        Main.lIl[Main.Ill[6]] = llIIl("Zmp6U0dmanpTR2ZqelNHZmp6U0dmanpTR2ZqelNHZmp6U0dmanpTR2ZqelNHZmp6U0dmanpTR2ZqelM=", "EIYpd");
        Main.lIl[Main.Ill[7]] = lIlIl("izp+PDwDQmKLOn48PANCYos6fjw8A0Jiizp+PDwDQmKLOn48PANCYos6fjw8A0Jiizp+PDwDQmKLNxYlvj0S0Q==", "HQSVq");
        Main.lIl[Main.Ill[8]] = lIlIl("tBhrcLMXhpA9bZky1EVorA==", "xixox");
        Main.lIl[Main.Ill[9]] = lIlIl("g7L0NtFVt6CcQpkmQaOeMngNI83fxyaV", "pyzJO");
        Main.lIl[Main.Ill[10]] = llIIl("Dgs5JTgtE3IgJCsBODZhGwc5PCgtSHI=", "YrRWA");
        Main.lIl[Main.Ill[11]] = lIlIl("X6Z0TMchtI48O/ov2Izs/Q==", "pWbwo");
        Main.lIl[Main.Ill[12]] = lIlIl("w5xkhdVOoMEezepdwkrcG8fIL13dBz13wVPK/QDhA/pxJfTEQCJQRVqgwdRNiHNntRP8FFPDSpVjwuh1IZWB4g==", "yAcCW");
        Main.lIl[Main.Ill[13]] = lIlIl("qKHZIisXMPioodkiKxcw+Kih2SIrFzD4qKHZIisXMPioodkiKxcw+Kih2SIrFzD4qKHZIisXMPhXYf22YVn41w==", "xawUD");
        Main.lIl[Main.Ill[14]] = IIlIl("7rQ3Z66c11Iyk65RtE6AnNX3CQlhJTBW19qe+9nfwBc=", "joBjh");
    }
}

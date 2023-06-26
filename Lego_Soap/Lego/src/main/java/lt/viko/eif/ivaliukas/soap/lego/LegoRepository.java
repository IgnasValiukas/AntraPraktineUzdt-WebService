package lt.viko.eif.ivaliukas.soap.lego;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import com.example.legos.Lego;
import com.example.legos.Theme;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class LegoRepository {
    private static final Map<String, Lego> legos = new HashMap<>();

    @PostConstruct
    public void initData() {
        // Star Wars
        Lego SW1 = new Lego();
        SW1.setName("Millennium Falcon™");
        SW1.setLegoNumber(75192);
        SW1.setPrice(666.00);
        SW1.setTheme(Theme.STAR_WARS);
        SW1.setAge("16+");
        SW1.setPieces(7541);

        legos.put(SW1.getName(), SW1);

        Lego SW2 = new Lego();
        SW2.setName("R2-D2™");
        SW2.setLegoNumber(75308);
        SW2.setPrice(250.58);
        SW2.setTheme(Theme.STAR_WARS);
        SW2.setAge("18+");
        SW2.setPieces(2314);

        legos.put(SW2.getName(), SW2);

        // Marvel
        Lego Marvel1 = new Lego();
        Marvel1.setName("Sanctum Sanctorum");
        Marvel1.setLegoNumber(76218);
        Marvel1.setPrice(191.00);
        Marvel1.setTheme(Theme.MARVEL);
        Marvel1.setAge("18+");
        Marvel1.setPieces(2708);

        legos.put(Marvel1.getName(), Marvel1);

        Lego Marvel2 = new Lego();
        Marvel2.setName("Daily Bugle");
        Marvel2.setLegoNumber(76178);
        Marvel2.setPrice(519.00);
        Marvel2.setTheme(Theme.MARVEL);
        Marvel2.setAge("18+");
        Marvel2.setPieces(3772);

        legos.put(Marvel2.getName(), Marvel2);

        // Minecraft
        Lego MC1 = new Lego();
        MC1.setName("Llama Village");
        MC1.setLegoNumber(21188);
        MC1.setPrice(150.99);
        MC1.setTheme(Theme.MINECRAFT);
        MC1.setAge("9+");
        MC1.setPieces(1252);

        legos.put(MC1.getName(), MC1);

        Lego MC2 = new Lego();
        MC2.setName("Sword Guard Post");
        MC2.setLegoNumber(21244);
        MC2.setPrice(54.05);
        MC2.setTheme(Theme.MINECRAFT);
        MC2.setAge("8+");
        MC2.setPieces(427);

        legos.put(MC2.getName(), MC2);

        // Architecture
        Lego AH1 = new Lego();
        AH1.setName("Singapore");
        AH1.setLegoNumber(21057);
        AH1.setPrice(69.90);
        AH1.setTheme(Theme.ARCHITECTURE);
        AH1.setAge("18+");
        AH1.setPieces(827);

        legos.put(AH1.getName(), AH1);

        Lego AH2 = new Lego();
        AH2.setName("Great Pyramid of Giza");
        AH2.setLegoNumber(21058);
        AH2.setPrice(169.99);
        AH2.setTheme(Theme.ARCHITECTURE);
        AH2.setAge("18+");
        AH2.setPieces(1476);

        legos.put(AH2.getName(), AH2);

        // Technic
        Lego TH1 = new Lego();
        TH1.setName("Ferrari Daytona SP3");
        TH1.setLegoNumber(42143);
        TH1.setPrice(409.99);
        TH1.setTheme(Theme.TECHNIC);
        TH1.setAge("18+");
        TH1.setPieces(3778);

        legos.put(TH1.getName(), TH1);

        Lego TH2 = new Lego();
        TH2.setName("Porsche 911 RSR");
        TH2.setLegoNumber(42096);
        TH2.setPrice(253.90);
        TH2.setTheme(Theme.TECHNIC);
        TH2.setAge("10+");
        TH2.setPieces(1580);

        legos.put(TH2.getName(), TH2);

        // Ninjago
        Lego NJ1 = new Lego();
        NJ1.setName("Hydro Bounty");
        NJ1.setLegoNumber(71756);
        NJ1.setPrice(150.99);
        NJ1.setTheme(Theme.NINJAGO);
        NJ1.setAge("9+");
        NJ1.setPieces(1159);

        legos.put(NJ1.getName(), NJ1);

        Lego NJ2 = new Lego();
        NJ2.setName("Ninja Training Sanctuary");
        NJ2.setLegoNumber(71767);
        NJ2.setPrice(110.99);
        NJ2.setTheme(Theme.NINJAGO);
        NJ2.setAge("8+");
        NJ2.setPieces(1394);

        legos.put(NJ2.getName(), NJ2);

        // DC
        Lego DC1 = new Lego();
        DC1.setName("Batmobile Tumbler");
        DC1.setLegoNumber(76240);
        DC1.setPrice(270.99);
        DC1.setTheme(Theme.DC);
        DC1.setAge("18+");
        DC1.setPieces(2049);

        legos.put(DC1.getName(), DC1);

        Lego DC2 = new Lego();
        DC2.setName("Art Jim Lee Batman™");
        DC2.setLegoNumber(31205);
        DC2.setPrice(132.99);
        DC2.setTheme(Theme.DC);
        DC2.setAge("18+");
        DC2.setPieces(4167);

        legos.put(DC2.getName(), DC2);
    }
    public Lego findLego(String name) {
        Assert.notNull(name, "The legos name must not be null");
        return legos.get(name);
    }
}
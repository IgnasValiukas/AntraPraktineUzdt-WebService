package lt.viko.eif.ivaliukas.soap.lego;

import com.example.legostore.Currency;
import com.example.legostore.LegoStore;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class LegoStoreRepository {
    private static final Map<String, LegoStore> legoStore = new HashMap<>();

    @PostConstruct
    public void initData() {
        // Lithuania
        LegoStore LT1 = new LegoStore();
        LT1.setCountry("Lithuania");
        LT1.setCity("Vilnius");
        LT1.setAddress("Ozo g. 25, 07150 Vilnius");
        LT1.setCurrency(Currency.€_EURO);
        LT1.setPhoneNumber("(8-655) 26695");
        LT1.setAddressURL("https://www.google.com/maps/place/Lego/@54.710339,25.2627673,15z/data=!4m6!3m5!1s0x46dd91574bf06f91:0x68745d6a8a971b15!8m2!3d54.710339!4d25.2627673!16s%2Fg%2F11f_j012gl?entry=ttu");

        legoStore.put(LT1.getCountry(), LT1);

        // UK
        LegoStore UK1 = new LegoStore();
        UK1.setCountry("UK");
        UK1.setCity("London");
        UK1.setAddress("3 Swiss Ct, London W1D 6AP");
        UK1.setCurrency(Currency.£_POUND_STERLING);
        UK1.setPhoneNumber("+44 20 7839 3480");
        UK1.setAddressURL("https://www.google.com/maps/place/3+Swiss+Ct,+London+W1D+6AP,+UK/@51.5104291,-0.1335082,17z/data=!3m1!4b1!4m6!3m5!1s0x487604d23c95231f:0x1bc5dc3662a7115b!8m2!3d51.5104258!4d-0.1309333!16s%2Fg%2F11gfgny9ym?entry=ttu");

        legoStore.put(UK1.getCountry(), UK1);

        // UK
        LegoStore UK2 = new LegoStore();
        UK2.setCountry("UK");
        UK2.setCity("London");
        UK2.setAddress("Unit 1081 Westfield, Ariel Way");
        UK2.setCurrency(Currency.£_POUND_STERLING);
        UK2.setPhoneNumber("+44 20 8749 1059");
        UK2.setAddressURL("https://www.google.com/maps/place/The+LEGO%C2%AE+Store+London+Westfield/@51.5068973,-0.2245253,17z/data=!3m2!4b1!5s0x48760fd07c2c2941:0x55f0c588f5d06a9b!4m6!3m5!1s0x48760fda5ae7ad6d:0x9b92eb91aa48883a!8m2!3d51.506894!4d-0.2219504!16s%2Fg%2F1hc31pzsy?entry=ttu");

        legoStore.put(UK2.getCountry(), UK2);

    }
    public LegoStore findLegoStore(String country) {
        Assert.notNull(country, "The lego store country must not be null");
        return legoStore.get(country);
    }
}

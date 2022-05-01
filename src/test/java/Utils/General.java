package Utils;

import java.util.Random;

public class General {
    Random rand = new Random();

    public String randomUsername(){
        return "vika" + + rand.nextInt(1000);
    }
}

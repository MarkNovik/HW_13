import java.util.Random;

public class NumberFormat {
    static void makeMistake() {
        Random rand= new Random();
        String str = rand.toString();
        int i = Integer.valueOf(str);
    }
}

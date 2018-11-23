public class ClassCast {
    static void makeMistake() {
        Object obj = Integer.valueOf(466);
        String sttr = (String) obj;
    }
}

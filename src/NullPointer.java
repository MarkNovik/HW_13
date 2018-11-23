public class NullPointer {
    static void makeMistake() {
        String str = null;
        helpMakeMistake(str);

    }

    static void helpMakeMistake(String str) {
        str.toUpperCase();
    }

}

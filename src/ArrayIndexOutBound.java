public class ArrayIndexOutBound {

    static void makeMistake() {
        int[] array = new int[5];
        for (int i = 1; i < 6; i++) {
            array[i] = i;
        }
    }
}

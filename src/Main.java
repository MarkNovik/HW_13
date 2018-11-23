public class Main {
    public static void main(String[] args) {
        /*//Чтобы получить исключения, нужно закоментить всё, кроме нужного
        ArrayIndexOutBound.makeMistake();//Не нужно, нужно думать
        NumberFormat.makeMistake();//Нужно, если есть ввод пользователем
        NullPointer.makeMistake();//Нужно, если есть ввод пользователем
        System.out.println(ClassCast.sttr);//Нужно думать*/
        try {
            ArrayIndexOutBound.makeMistake();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutBound");
        }
        try {
            NumberFormat.makeMistake();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat");
        }
        try {
            NullPointer.makeMistake();
        } catch (NullPointerException e ) {
            System.out.println("NullPointer");
        }
        try {
            ClassCast.makeMistake();
        } catch (ClassCastException e) {
            System.out.println("ClassCast");
        }
    }
}

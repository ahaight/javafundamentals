/**
 * Created by aaronhaight on 7/20/16.
 */
public class Looping {

    public static void main(String[] args) {
        whileLoop();
        doWhile();
        forLoop();
    }

    public static void whileLoop() {
        int kVal = 5;
        int factorial = 1;

        while (kVal > 1) {
            factorial *= kVal;
            kVal -= 1;
        }
        System.out.println(factorial);
    }

    public static void doWhile() {
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 100);
    }

    public static void forLoop() {
        for(int iVal = 1; iVal < 100; iVal *= 2)
            System.out.println(iVal);
    }
//        while(iVal < 100) {
//            System.out.println(iVal);
//
//            iVal *= 2;
//        }
}

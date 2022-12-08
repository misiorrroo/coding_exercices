
import java.lang.Math;

public class Test16 {

    public static int multiplicationWithoutOperator(int a, int b) {

        int result = 0;
        if (a < 0 && b < 0) {
            a = Math.abs(a);
            b = Math.abs(b);

            for (int i = 0; i < b; i++) {
                result = result + a;

            }

            return result;

        }
        if (a > 0 && b < 0) {
            b = Math.abs(b);
            for (int i = 0; i < b; i++) {
                result = result - a;

            }

            return result;
        }
        if (a < 0 && b > 0) {
            a = Math.abs(a);
            for (int i = 0; i < b; i++) {
                result = result - a;

            }

            return result;
        } else {

            for (int i = 0; i < b; i++) {
                result = result + a;
            }

            return result;
        }
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        int multiplication = multiplicationWithoutOperator(a, b);
        System.out.println("Wynik to:" + multiplication);
    }
}

public class Test6 {
    public static boolean caller(int n) {
        if (n == 1) {
            return true;
        } else if ((n > 2 && n < 5) && (n % 2 == 0)) {
            return false;
        } else if ((n >= 6) && (n <= 20) && (n % 2 == 0)) {
            return true;
        } else if ((n > 20) && (n % 2 == 0)) {
            return false;
        } else if (n <= 0) {
            return false;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int n = 43;
        boolean c = caller(n);
        if (c == true) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}

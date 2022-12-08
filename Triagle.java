public class Triagle {

    public static boolean triagleChecker(int a, int b, int c) {
        if (a + b < c || c + b < a || a + c < b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean triagleChecker2(int a, int b, int c) {
        if (a + b == c || c + b == a || a + c == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int a = 4;
        int b = 7;
        int c = 8;
        boolean checker1 = triagleChecker(a, b, c);
        boolean checker2 = triagleChecker2(a, b, c);
        if (checker2) {
            System.out.println("To jest prosta nie trojkat");
        } else if (checker1) {
            System.out.println("To bedzie spoko trojkat");
        } else {
            System.out.println("Z tego nie bedzie trojkąta");
        }
    }
}

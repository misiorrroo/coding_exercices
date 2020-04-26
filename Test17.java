
class Test17 {
    public static void main(String args[]) {
        int i, j = 10, k, x;
        for (i = 1; i <= 4; i++) {
            for (k = 1; k <= j; k++) {
                System.out.print(" ");
            }
            for (x = 1; x <= i; x++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("\n");
            j = j - 1;
        }
    }
}
// odwrócona, kat prosty w prawym gornym rogu
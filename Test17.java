
class Test17 {
    public static void main(String args[]) {
        int i, j = 10;
        int flors = 8; 
        for (i = 1; i <= flors; i++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            j = j - 1;
        }
    }
}

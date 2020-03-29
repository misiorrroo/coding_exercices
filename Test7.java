public class Test7 {

    public static void reverse(int[] array) {
        int reverse[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[array.length - 1 - i] = tab[i];
        }
        for (int i = 0; i < array.length; i++) {
            reverse[i] = tab[i];
        }
        return reverse;
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        int[] reverse = tab[i];
        for (int i = 0; i <= 6; i++) {
            System.out.print(reverse + " it is tab reverse!");
        }
    }
}

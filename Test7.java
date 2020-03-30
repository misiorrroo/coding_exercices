public class Test7 {

    public static int[] reverse(int[] array) {
        int reverse[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            
            reverse[array.length - 1 - i] = array[i];
        }
        return reverse;
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        int[] reverse = reverse(tab);
        for (int i = 0; i <= reverse.length; i++) {
            System.out.print(reverse[i]);
        }
    }
}

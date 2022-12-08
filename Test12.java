class Test12 {
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        reverse(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
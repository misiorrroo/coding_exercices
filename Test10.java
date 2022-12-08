class Test10 {

    public static boolean containValueInArray(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] tab = { -4, 6, 87, 99, 23 };
        int value = 87;
        boolean contain = containValueInArray(tab, value);
        if (contain) {
            System.out.println("Wartość zawiera się w tablicy, wartośc to: " + value);
        } else {
            System.out.println("Wartość nie zawiera się w tablicy, wartośc to: " + value);
        }
    }
}

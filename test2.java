class Test2 {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double findAvr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        double avr = sum / (double) array.length;
        return avr;
    }

    public static void main(String args[]) {

        // one mają conajmniej jeden element
        // testy
        int max = findMax();
        int min = findMin();
        double avr = findAvr();
        System.out.println("max value" + max);
        System.out.println("min value" + min);
        System.out.println("avaerage value" + avr);
    }

}

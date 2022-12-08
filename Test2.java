public class Test2 {

    public static int findMax(int[] array) {
        int max = array[1];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMax2(int[] array) {
        int max2 = array[1];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max2) {
                max2 = array[i];
            }
        }
        return max2;
    }

    public static int findMin(int[] array) {
        int min = array[1];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMin2(int[] array) {
        int min2 = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min2) {
                min2 = array[i];
            }
        }
        return min2;
    }

    public static double findAvr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }
        double avr = (double) sum / array.length;
        return avr;
    }

    public static void main(String args[]) {
        int[] tab = { -4, 6, 87, 99, 23 };

        int max = findMax(tab);
        int min = findMin(tab);
        int max2 = findMax2(tab);
        int min2 = findMin2(tab);
        double avr = findAvr(tab);

        System.out.println("max value " + max);
        System.out.println("min value " + min);
        System.out.println("max value2 " + max2);
        System.out.println("min value2 " + min2);
        System.out.println("average value " + avr);
    }
}

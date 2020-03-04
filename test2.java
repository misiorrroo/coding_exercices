public class Test2 {

    public static int findMax(int[] array) {
        int max = array[0]; //Tutaj też można int max = int min.value ---->najlepsze rozwiązanie to int max = -999999
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];  //Tutaj też można int min = min.value ---->najlepsze rozwiązanie to int max = -999999
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
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
        double avr = findAvr(tab);

        System.out.println("max value " + max);
        System.out.println("min value " + min);
        System.out.println("average value " + avr);
    }
}

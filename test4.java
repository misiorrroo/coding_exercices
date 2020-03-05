public class Test4 {

    public static int Sum(int[] array) {
        int sum = 0;
        int i;
        for (i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaxSum(int[] array) {
        int a = Sum(array);
        int b = findMin(array);
        int result = a - b;
        return result;
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        int summin = findMaxSum(tab);
        System.out.println("Max sum from 4 elements " + summin);
    }
}

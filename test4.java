public class Test4 {
    public static int sum(int[] array) {
        int sum = 0;
        int i;
        for (i = 0; i < array.length; i++)

            sum += array[i];
        return sum;
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

    public static int findMaxSum(int[] array) {
        int sum = sum(array);
        int min = findMin(array);
        int result = sum - min;
        return result;
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        int summin = findMaxSum(tab);
        System.out.println("Max sum from 4 elements " + summin);
    }
}

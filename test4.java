class Test4 {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int Sum(int[] array) {
        int sum = 0; 
        int i;
        for (i = 0; i < array.length; i++)
        sum += array[i];
        return sum;
    }
    public static int findMaxSum(int sum , int min){
        int summin = sum - min;
        return summin;
    }

    public static void main(String args[]) { 
        int[] tab = {5 ,4 ,3 ,2 ,1};
        int min = findMin(tab);
        int sum = Sum(tab);
        int summin = findMaxSum(sum ,min);
        System.out.println("min value " + min);
        System.out.println("sum value is " + sum);
        System.out.println("Max sum from 4 elements " + summin);
    }
}

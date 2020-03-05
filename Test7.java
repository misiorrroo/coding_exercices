public class Test7 {
    
    public static void reverse (int []array, int n) { 
        for (i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
          }
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        int reversed = 
        System.out.println("rewerse array is:" + reversed);
        }
    }

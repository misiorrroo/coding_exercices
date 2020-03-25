public class Test7 {
    
    public static void reverse(int[] array) {     
        for (int i = array.length-1; i >= 0; i--){
            array[i] = reverse[i];          //tutaj jest problem z impelementacją
        }
        return reverse;
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4, 8 };
        int[] reverse = reverse(tab); 
        System.out.println("rewerse array is:" + tab);
        }
    }


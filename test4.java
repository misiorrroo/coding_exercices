public class Test4 {

    public static int findMaxSum(int[] array) {
        int sum = 0;
        int i;
        int min = array[0];
        for (i = 0; i < array.length; i++) {
            sum += array[i];
            return sum;
        }
        {
        for (int i = 0; i < array.length; i++) {  //I własnie tutaj się pojawia problem, wiem ze sie duplikuje robiłem pod funkcja "int y" i zmienialem na y w ciele petli pisze to samo plus "dead code"...
        if (array[i] < min) {                    //JAk robie funkcje w funkcji tez nie działa :<
            /*
        public static int findMin(int[] array) { 
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
            */
        min = array[i];
        }
        }
        return min;
        }
        int summin = sum - min;
    }

    public static void main(String args[]) {
        int[] tab = { -5, -4, -3, -2, -1 };
        int summin = findMaxSum(tab);
        System.out.println("Max sum from 4 elements " + summin);
    }
}

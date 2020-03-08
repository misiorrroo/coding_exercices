public class Test8 {

    static int countingValleys(int[] array, level) {
            int valley = array[0];
            int level = 0;
            for(i = 0; i < array.length; i++){
                if (array[i] == -1) 
                {level--;}
                if (array[i] == 1)
                {level++;}
            }
            return valley;
        }
    

    public static void main(String args[]) {
        int[] tab = { -1, 1, -1, -1, 1, 1 , 1 };
        int count = countingValleys(tab);
        System.out.println("valleys is " + valley);
    }
}
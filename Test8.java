public class Test8 {

    static int countingValleys(int[] array, level) { //nie wiem ocb z tym
            int valleycount = 0;
            int level = 0;
            for(i = 0; i < array.length; i++){
            if (array[i] == -1) 
                {level--;}
            if (array[i] == 1)          
                {level++;}
            }
            {
            if (level == 0 && array[i] == 1) 
                valleycount++;
            }
            return valleycount;
        }

    public static void main(String args[]) {
        int[] tab = { -1, 1, -1, -1, 1, 1, 1 };
        int valleycount = countingValleys(tab);
        System.out.println("valleys is " + valleycount);
    }
}

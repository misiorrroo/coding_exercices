//W test3.java zrób funkcję public static int findSecondMax(int[] array)
class test3 {
    public static int findSecondMax(int[] array) {
        
        int max = array[0];
        int secondmax = array[0];
        for (int i = 0; i < array.length; i++) {          
            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } else if (array[i] > secondmax)

            secondmax = array[i];
        }
            return secondmax;             //cos jest tu zjebane wiem ze mialem nie wrzucac nie kompilujacego sie kodu ale nie wiem co tu jest nie OK.
    }
    public static void main(String args[]) {
        int[] tab = {-5, -7, -10, -3, -4};
        int secondmax = findSecondMax(tab);
        System.out.println("second max value " + secondmax);
    }
}


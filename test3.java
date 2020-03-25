class Test3 {

    public static int findSecondMax(int[] array) {
        int max = array[0];
        int secondmax = array[1];
        if (array[1] > array[0]) {
            max = array[1];
            secondmax = array[0];
        }
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } else if (array[i] > secondmax) {
                secondmax = array[i];
            }
        }
        return secondmax;

    }

    public static int findThirdMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                secondmax = max;
                thirdmax = secondmax;
                max = array[i];
            } else if (array[i] > secondmax) {
                thirdmax = secondmax;
                secondmax = array[i];
            }else if (array[i] > thirdmax) { 
                thirdmax = array[i];
            }
        }
        return thirdmax;
    }

    public static void main(String args[]) {
        int[] tab = {-5, -7, -10, -3, -4};
        int secondmax = findSecondMax(tab);
        int thirdmax = findThirdMax(tab);
        System.out.println("second max value " + secondmax);
        System.out.println("third max value " + thirdmax);
    }
}
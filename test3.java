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
        int max = array[0];
        int secondmax = array[1];
        int thirdmax = array[2];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } else if (array[i] > secondmax) {
                secondmax = array[i];
            } else if (array[i] > thirdmax) {
                thirdmax = array[i];
            }
        }
        return thirdmax;
    }

    public static void main(String args[]) {
        int[] tab = {-5, -4, -3, -2, -1};
        int secondmax = findSecondMax(tab);
        int thirdmax = findThirdMax(tab);
        System.out.println("second max value " + secondmax);
        System.out.println("third max value " + thirdmax);
    }
}
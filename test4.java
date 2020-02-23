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

    public static double Sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        return sum;
    }

    public static double sumWithoutMin(int sum, int min) {
        int sumwmin = 0;
        sumwmin = sum - min;
        return sumwmin;
    }
    public static void main(String args[]) { //cos jest nie tak, pisze z palca jbc
	int[] tab = {4, 6, 87, 99, 23};
        // one mają conajmniej jeden element
        // testy
        int min = findMin(tab);
        int sum = Sum(tab);
        int sumwmin = sumWithoutMin(tab);

        System.out.println("min value " + min);
        System.out.println("Sum " + sum);
        System.out.println("sum witout minimum" + sumwmin);
    }

}
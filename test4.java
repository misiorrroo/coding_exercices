class Test4 {

    public static int findMaxSum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return maxsum;
    }


    public static void main(String args[]) { //cos jest nie tak, pisze z palca jbc
        int[] tab = {-5, -7, -10, -3, -4};
        // one mają conajmniej jeden element
        // testy
        int maxsum = findMaxSum(tab);
        System.out.println("Max sum from 4 elements" + maxsum);
    }


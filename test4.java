class Test4 {

    public static int findMaxSum(int[] array) {
        {
            int min = array[0];
            int sum = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++)
        sum += array[i];
        return sum;
        int summin = sum - min;           //Tutaj jest jakiś problem nie wiem czemu ta funkcja nie zwraca tego co juz wczesniej policzyla
        return summin;
    }

    public static void main(String args[]) {
        int[] tab = { 5, 4, 3, 2, 1 };
        int summin = findMaxSum(tab);
        System.out.println("Max sum from 4 elements " + summin);
    }
}

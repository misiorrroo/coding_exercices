class Test11 {

    public static float sum2Arrays(float[] array, float[] array2) {
        float sum1 = 0;
        float sum2 = 0;
        float sumtotal = 0;
        {
            for (int i = 0; i < array.length; i++){

                sum1 += array[i];
            }
            return sum1;
        

        
            for (int i = 0; i < array.length; i++){

                sum2 += array[i];
            }
            return sum2;
        
        {
            sumtotal = sum1 + sum2;
        }
        
    }
}

    

    public static void main(String args[]) {
        float[] tab = { 1, 2, 3 };
        float[] tab2 = { 1, 2, 3 };
        float sumtotal = sum2Arrays(tab, tab2);
        System.out.println(sumtotal);
    }

}
class Test11 {

    public static float sum2Arrays(float[] tab, float[] tab2) {
        float sum1 = 0;
        float sum2 = 0;
        float sumtotal = 0;
        {
            for (int i = 0; i < tab.length; i++){

                sum1 = sum1 + tab[i];
            }
            return sum1;
        

        
            for (int i = 0; i < tab2.length; i++){

                sum2 = sum2 + tab2[i];
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
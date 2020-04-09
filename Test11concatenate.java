class Test11concatenate {

    public static float[] concatenate(float[] array, float[] array2){
        float length = array.length + array2.length;
        float[] result = new float[length];
        float i = 0;
        for (float i = 0; i < array.length; i++){
            result[i] = new float[i];
            i++;
        }

        for (float i = 0; i < array2.length; i++){
            result[i] = new float[i];
            i++;
        }
        return result;
    }

    

    public static void main(String args[]) {
        float[] tab = { 1, 2, 3};
        float[] tab2 = { 9, 8, 7};
        float sumtotal = concatenate(tab, tab2);
        System.out.println(sumtotal);
    }

}
class Test11concatenate {

    public static float[] concatenate(float[] array, float[] array2){
        float length = tab.length + tab2.length;
        float[] result = new float[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    

    public static void main(String args[]) {
        float[] tab = { 1, 2, 3 };
        float[] tab2 = { 1, 2, 3 };
        float sumtotal = concatenate(tab, tab2);
        System.out.println(sumtotal);
    }

}
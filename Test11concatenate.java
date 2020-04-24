class Test11concatenate {

    public static float[] concatenate(float[] array, float[] array2){

        int length = array.length + array2.length;
        float[] result = new float[length];
      
        for (int i = 0; i < array.length; i++){
            result[i] = array[i];
            i++;
        }
        for (int j = 0; j < array2.length; j++){
            result[j] = array[j];
            j++;
        }
      
      
        return result;
    }

  

    public static void main(String args[]) {
        float[] tab = { 2, 2, 2};
        float[] tab2 = { 2, 2, 2};
        float[] result = concatenate(tab, tab2);
        for (int i = 0; i < result.length; i++){
        System.out.println(result[i] +  ",");
      }
    }
}


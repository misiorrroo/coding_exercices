class Test12 { 
    public static int[] reverse(int[] array) {
        for(int i=0; i<array.length/2; i++){
            int reverse = array[i];
            array[i] = array[array.length -i -1];
            reverse[array.length -i -1] = array[i];
        }
        return reverse;
    }
        public static void main(String args[]) {
            int[] tab = { 1, 2, 3, 4, 8 };
            int[] reverse = reverse(tab);
            for (int i = 0; i <= reverse.length; i++) {
                System.out.print(reverse[i]);
            }
        }
    }
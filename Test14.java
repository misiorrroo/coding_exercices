public class Test14 {
    public static boolean intChecker(int[] array, int[] array2) {
        if (array.length == array2.length) {
            for (int i = 0; i < array.length; i++)

            if (array[i] == array2[i] && array[i] == array2[i + 1] && array[i] == array2[i + 2]
            && array[i+1] == array2[i] && array[i+1] == array2[i + 1] && array[i+1] == array2[i + 2]
            && array[i+2] == array2[i] && array[i+2] == array2[i + 1] && array[i+2] == array2[i + 2]);
            return true;
       }else{
        return false;
       }
    }
    

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3 };
        int[] tab2 = { 1, 2, 3 };
        boolean intChecker = intChecker(tab, tab2);
        if (intChecker) {
            System.out.println("Te same tablice");
        } else {
            System.out.println("Nie te same tablice");
        }
    }
}

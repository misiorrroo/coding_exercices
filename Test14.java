public class Test14 {
    public static boolean equalTwoArray(int[] array, int[] array2) {
        if (array.length == array2.length) {
            for (int i = 0; i < array.length; i++) {
                  if (array[i] != array2[i]) {
                      return false;
                  }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int[] tab = { 1, 2, 3, 4 };
        int[] tab2 = { 1, 2, 3, 4, 5 };
        boolean equalTwoArray = equalTwoArray(tab, tab2);
        if (equalTwoArray) {
            System.out.println("Te same tablice");
        } else {
            System.out.println("Nie te same tablice");
        }
    }
}

public class Test13 {
    public static boolean haveCommonElement(String[] first, String[] second) {
        if (first.length == second.length) {
            for (int i = 0; i < first.length; i++) {

                if (first[i] == second[i] || first[i] == second[i + 1] || first[i] == second[i + 2]
                        || first[i+1] == second[i] || first[i+1] == second[i + 1] || first[i+1] == second[i + 2]
                        || first[i+2] == second[i] || first[i+2] == second[i + 1] || first[i+2] == second[i + 2]) {
                    return true;
                }
            }
        return false;
        }else{
        return false;
        }
    }

    public static void main(String args[]) {
        String[] first = { "Aniela", "mnie", "wkurwia" };
        String[] second = { "Anielaa", "jest", "super" };
        if (haveCommonElement(first, second)) {
            System.out.println("Conajmniej jeden element jest wspólny");
        } else {
            System.out.println("Brak wspólnych elementów");
        }
    }
}
public class Test13 {
    public static boolean haveCommonElement(String[] first, String[] second) {

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) 
                if (first[i] == second[j]) {
                    return true;
                }
        }
        return false;
    }

    public static void main(String args[]) {
        String[] first = { "Aniela", "mnie", "wkurwia" }
        ;
        String[] second = { "Aniela", "jest", "super" };
        if (haveCommonElement(first, second)) {
            System.out.println("Conajmniej jeden element jest wspólny");
        } else {
            System.out.println("Brak wspólnych elementów");
        }
    }
}

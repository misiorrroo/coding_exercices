public class Test13 {
public static boolean haveCommonElement(String[] first, String[] second) {
    for (int i = 0; i < first.length; i++){
        if(first[0]==second[0]||first[0]==second[1]||first[0]==second[2]||first[1]==second[0]||first[1]==second[1]||first[1]==second[2]||first[2]==second[0]||first[2]==second[1]||first[2]==second[2]&&first.length==second.length){
            return true;
        }
    }
        return false;
}
    public static void main(String args[]) {
        String[] first = { "Skrzyniaa", "mieszka", "pakamera" };
        String[] second = { "Skrzynia", "w", "pakamerze" };
        if (haveCommonElement(first, second)) {
            System.out.println("Conajmniej jeden element jest wspólny");
        } else {
            System.out.println("Brak wspólnych elementów");
        }
    }
}
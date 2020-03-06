public class Test5 {

    public static boolean isLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int year = 2018;
        boolean isleap = isLeap(year);
        if (isleap) {           //isleap==true jak jest samo to isleap
            System.out.println("Rok przestepny to:" + year);
        } else {
            System.out.println("Rok nieprzestepny to:" + year);
        }
    }
}

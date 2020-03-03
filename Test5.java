public class Test5 {
    public static boolean isLeap(int year) {
    if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)){return true;}
    else{return false;}
    }
    public static void main(String args[]) {
        int year = 2018;
        boolean c = isLeap(year);
        if (c == true){
        System.out.println("Rok przestepny");
        }
        else {
        System.out.println("Rok nie przestepny to:" + year);
        }
    }
}

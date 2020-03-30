public class Test9 {
    

	public static String firstDayOfWeek1(int n, String firstDayOfWeek) {

        if (n == 1) {
            return "Monday";
        } else if (n == 2) {
            return "Tuesday";
        } else if (n == 3) {
            return "Wednesday";
        } else if (n == 4) {
            return "Thursday";
        } else if (n == 5) {
            return "Friday";
        } else if (n == 6) {
            return "Saturday";
        } else {
            return "Sunday";
        }
        
    }
    public static String firstDayOfWeek2(int n, String firstDayOfWeek){

        switch (n) {
            case 1:
            return "Monday";
            case 2:
            return "Tuesday";
            case 3:
            return "Wednesday";
            case 4:
            return "Tuesday";
            case 5:
            return "Friday";
            case 6:
            return "Saturday";
            default:
            return "Sunday";
        }
    }


    

    public static void main(String args[]){
        int n = 2;
        String firstDayOfWeek = "Sunday";
        String day = firstDayOfWeek1(n, firstDayOfWeek); // nie wiem dlaczego swieci sie na czerwono, chyba tak powinno być że jest return i oddaje stringa od n
        System.out.println(day);
        String day2 = firstDayOfWeek2(n, firstDayOfWeek); // nie wiem dlaczego swieci sie na czerwono, chyba tak powinno być że jest return i oddaje stringa od n
        System.out.println(day2);
    }
}

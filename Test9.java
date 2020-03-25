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


    public static void main(String args[]){
        int n = 7;
        String day = firstDayOfWeek1(n, firstDayOfWeek); // nie wiem dlaczego swieci sie na czerwono, chyba tak powinno być że jest return i oddaje stringa od n
        System.out.println(day);
    }
}
}

//Na to jeszcze nie patrz!
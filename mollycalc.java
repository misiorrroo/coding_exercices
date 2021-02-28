import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Locale;

public class mollycalc {
    public static void main(String args[]) {
        int year; 
        int month;
        int dayOfMonth;
        System.out
                .println("==========================================================================================");
        System.out
                .println("==========================================================================================");
        System.out.println("To oczwiste że chcesz kupić tyle molly ile masz pieniędzy bo jesteś normalnym człowiekim");
        System.out
                .println("==========================================================================================");
        System.out.println("wpisz ile masz hajsu!");
        int howmanymoney = 0;
        Scanner scanner = new Scanner(System.in);
        howmanymoney = scanner.nextInt();
        scanner.close();
        int howmanymolly = howmanymoney / 25;
        System.out.println("Możesz kupić: " + howmanymolly + " porcji");
        System.out.println("    ");
        System.out.println("    ");
        GregorianCalendar(int year, int month, int dayOfMonth);
        Locale locale = Locale.getDefault();
        System.out.println("locale = "+locale);
        GregorianCalendar cal = new GregorianCalendar(locale);
        System.out.println(cal.getTime());

    }
}

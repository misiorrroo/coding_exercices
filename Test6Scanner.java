import java.util.Scanner;
public class Test6Scanner {
    public static boolean caller(int n) {
        if (n == 1) {
            return true;
        } else if ((n > 2 && n < 5) && (n % 2 == 0)) {
            return false;
        } else if ((n >= 6) && (n <= 20) && (n % 2 == 0)) {
            return true;
        } else if ((n > 20) && (n % 2 == 0)) {
            return false;
        } else if (n <= 0) {
            return false;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println("Podaj liczbę!");
        System.out.println("Jak będzie to liczba 1 wydrukuje WEIRD");
        System.out.println("Jak będzie to liczba z przedziału 2-5 i nie bedzie parzysta wydrukuje WEIRD jak parzysta wydrukuje NOT WEIRD");
        System.out.println("Jak będzie to liczba z przedziału 6-20 i bedzie parzysta wydrukuje WEIRD jak nie parzysta wydrukuje NOT WEIRD");
        System.out.println("Jak będzie to liczba większa od 20 i bedzie parzysta wydrukuje NOT WEIRD jak parzysta wydrukuje WEIRD");
        System.out.println("Jak będzie to liczba ujemna wydrukuje NOT WEIRD");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        boolean c = caller(n);
        if (c == true) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}

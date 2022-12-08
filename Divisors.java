import java.util.Scanner;

public class Divisors {

    public static void findDivisors(int n) {
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.println(i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę, kórerj dzielniki mam wypisać");
        int num = sc.nextInt();
        System.out.println("Dzielniki rzeczywiste liczby " + num + " to: ");
        findDivisors(num);
    }

}
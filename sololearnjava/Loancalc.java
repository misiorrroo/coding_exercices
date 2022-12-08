import java.util.Scanner;

public class Loancalc
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int months = 3;
        for (int i = 0; i < months; i++)
            amount = amount * 90 / 100;
        System.out.println(amount);
    }
}
import java.util.Scanner;
public class Bomb {
    public static boolean countDown(int n) {
        int i = 99;
        for(i=n;i<n;i--){
        System.out.println("Bum for:"+ n); 
        } 
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Podaj liczbę!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        boolean c = countDown(n);
        if (c == true) {
        System.out.println("BUM!!!");
    }
}
}
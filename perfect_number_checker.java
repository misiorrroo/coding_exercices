import java.lang.reflect.Array;

public class perfect_number_checker {
    public static void perfect(int n){
        for (int i = 1; i <= n; i++){
            if (n % i == 0)
                System.out.println(i);
        }
    }
    public static void sumOfDividers(int n){
        int sum = 0;
    for(int i = 1; i<n; n++){
        sum = sum + perfect(num);
    }
    }
    public static void main(String args[]){
    int num = 12;
    System.out.println(num);
    perfect(num);
    }
}

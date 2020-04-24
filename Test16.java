
public class Test16 {

    public static int multiplicationWithoutOperator(int a, int b) {
        int mul = 0;
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 0;
        }
        if (a == 1) {
            return b;
        }
        if (b == 1) {
            return a;
        }else{
        for(int i =1 ;1<=b; i++){
            mul = mul + a;
            int result = mul;
        }
        }
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        int multiplication = multiplicationWithoutOperator(a,b);
        System.out.println("Wynik to:" + multiplication);
    }
}

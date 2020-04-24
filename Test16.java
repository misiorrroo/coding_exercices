
public class Test16 {

    public static int multiplicationWithoutOperator(int a, int b) {
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
            int result = 0;
        for(int i =0 ;i<b; i++){
            result = result + a;
        }
        return result;
        }
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        int multiplication = multiplicationWithoutOperator(a,b);
        System.out.println("Wynik to:" + multiplication);
    }
}

public class fibojava {
public static int fibonacciSeq(int n){
    if(n == 1){
        return 1;
    }
    if(n == 2){
        return 1;
    }else{
        return fibonacciSeq(n-1) + fibonacciSeq(n-2);
    }
}
    public static void main(String[] args) {
        int result = fibonacciSeq(6);
        System.out.println("Ten wyraz ciągu Fibonacciego to: " + result);
    }
}

class Test6 { 
    public static boolean caller(int n) { 
    if (n == 2) {
      return true;
    } 
    else{
    if (n == 4)
    return true;
    }
    else if((n >= 6) && (n < 20) && (n % 2 == 0)){
    return true;
    }
    else if ((n > 20) && (n % 2 == 0)){
    return true;
    } 
}
if
    


    public static void main(String args[]) {
        int n = 4;

        boolean c = caller(n); 
        System.out.println(c);
    }
}
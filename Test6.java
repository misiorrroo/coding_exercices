class Test6 { 
    public static boolean caller(int n) { 
    if ((n == 2) && (n==4)){
      return true;
    } 
    if((n >= 6) && (n <= 20) && (n % 2 == 0)){
    return true;
    }
    if ((n > 20) && (n % 2 == 0)){
    return true;
    } 
    else 
    return false;
    }

    public static void main(String args[]) {
        int n = 4;
        boolean c = caller(n);
        if(c == true){
        System.out.println("Weird");
        }
        else {
        System.out.println("Not Weird");
        }
    }
}

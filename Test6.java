class Test6 { 
    public static boolean caller(int n) { 
    if (n == 2) {
      return false;
    } 
    else{
    if (n == 4)
    return false;
    }
    if((n >= 6) && (n < 20) && (n % 2 == 0)){
    return true;
    }
    else if ((n > 20) && (n % 2 == 0)){
    return true;
    } 
    else 
    return true;
    }

    public static void main(String args[]) {
        int n = 4;
        boolean c = caller(n);
        if(c = true){
        System.out.println("Weird");
        }
        else {
        System.out.println("Not Weird");
        }
    }
}
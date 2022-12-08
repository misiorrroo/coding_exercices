class algo {
  public static void main(String args[]) {
    int i, j;
    boolean isprime;
    boolean even;
    for (i = 2; i < 1000; i++) {
      if (i % 2 == 0) {  //
        even = true;
      } else {
        even = false;
      }
      isprime = true;
      for (j = 2; j <= i / j; j++) {
        if ((i % j) == 0) {
          isprime = false;
        }
      }
      if (isprime) {
        System.out.println(i + " jest liczbą pierwszą.     >>>>>>>>>");
      } else if (even) {
        System.out.println(i + " jest liczbą parzystą.     %%%%%%%%%%%");
      }

    }
  }
}
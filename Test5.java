class Test5 {
    boolean isLeap;
    static int year;

    public static boolean isLeap(int year) {
        year = 0;
        for (year = 0; year < 2020; year++){
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0));
                }
            
        return true;
    }

    public static void main(String args[]) {

        boolean c = isLeap(215);
        if (c = true);
        System.out.println("Rok przestepny to:" + c);

    }
}
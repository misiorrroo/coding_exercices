class Test5 {
    boolean isLeap = false;
    int year;

    public static boolean isLeap(int year) {
        year = 0;
        for (year = 0; year < 2020; year++)
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        isLeap = true;
                }
            }
        return isLeap;
    }

    public static void main(String args[]) {

        boolean c = leapYear(year);
        System.out.println(c);

    }
}

class Test5 {
    boolean isLeap;
    static int year;

    public static boolean isLeap(int year) {
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                
            
        return true;
    }

    public static void main(String args[]) {
        int year = 2018;
        boolean c = isLeap(year);
        if (c == true){
        System.out.println("Rok przestepny");
        }
        else {
        System.out.println("Rok nie przestepny to:");
        }
    }
}
    
    //http://www.eng.fsu.edu/~haik/met.dir/hcpp.dir/notes.dir/cppnotes/node41.html

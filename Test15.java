public class Test15 {

    public static boolean floatisInt(float a) {
            if (a  == (int)a) {
                return true;
            }else{
                return false;
            }
    }

    public static void main(String args[]) {
        float a = 5.22f;
        boolean isfloat = floatisInt(a);
        if (isfloat) {
            System.out.println("całkowita");
        } else {
            System.out.println("nie całkowita");
        }
    }
}

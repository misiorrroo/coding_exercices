import java.io.File;
public class need_for_code_asap {
    public static void main(String[] args) {
    File file = new File("plik.txt");
    String absoluePath = file.getAbsolutePath();  //Do wyjaśnienia przez Wojtka , (relatywna, absolutna)
    System.out.println(absoluePath);  //https://www.youtube.com/watch?v=bDiAzhK-oCc
    }
}
import java.util.Arrays; 
import java.time.LocalDateTime;

class laborka {
    public static void main(String[] args) {
        String napis = "Miszel gada kocopoły";
        String zrobiony = napis.toUpperCase();
        ;
        System.out.println(zrobiony);
        char L = napis.charAt(0);
        char C = napis.charAt(1);
        System.out.println(C);
        System.out.println("  ");
        System.out.println(L + 1); // https://www.javatpoint.com/char-keyword-in-java#:~:text=The%20Java%20char%20keyword%20is,unsigned%2016%2Dbit%20Unicode%20characters.
        System.out.println("  ");
        for (int i = 0; i < napis.length(); i++) {
            char napislitera = napis.charAt(i);
            System.out.print(napislitera);
        }
        System.out.println();
        System.out.println("-------------");
        String str = "javatpoint";
        char[] ch = str.toCharArray();
        System.out.println("String: " + str);
        System.out.println("char: " + Arrays.toString(ch));
        char char1='\u0001';  
        char char2='\u0000';  
        System.out.println("char1: "+char1);  
        System.out.println("char2: "+char2); //https://www.javatpoint.com/char-keyword-in-java#:~:text=The%20Java%20char%20keyword%20is,unsigned%2016%2Dbit%20Unicode%20characters.
        LocalDateTime Obiekt = LocalDateTime.now();  //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
        System.out.println(Obiekt);
        System.out.print("https://www.javatpoint.com/how-to-reverse-string-in-java");
        System.out.println('https://www.geeksforgeeks.org/arrays-in-java/?ref=lbp');
        System.out.println();
        }
}

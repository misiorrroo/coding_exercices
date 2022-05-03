import java.lang.*;

class playingWithRandomness
{
    public static void main(String args[]) throws NullPointerException
    {
       long random =  System.currentTimeMillis();
       int smallRandom = (int)(random%100+1);
       System.out.println(smallRandom);
    }
}
class Conifer{
    public static void main(String[] args)
    {
        for(int row=1; row<=5; row++)
        {
            for(int emptySpace=4; emptySpace>=row; emptySpace--)
            {
                System.out.print(" ");
            }
            for(int star=1; star<=(2*row-1); star++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
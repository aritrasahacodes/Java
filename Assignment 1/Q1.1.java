class P1
{
    public static void main(String args[])
    {
        for(int i=0;i<8;i++)
        {
            System.out.print("*");
            if( i%2==0)
            {
                continue;
            }
            System.out.println();
        }
    }
}
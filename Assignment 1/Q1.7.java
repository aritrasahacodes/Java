class Binary
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(j%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
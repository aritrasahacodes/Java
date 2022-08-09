class Fibo
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int a=-1;
        int b=1;
        int c;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
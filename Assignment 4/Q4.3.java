class Fact
{
    static int factorial(int a,int ans)
    {
        if(a==1)
            return ans;
        ans*=a;
        return factorial(a-1,ans);
    }
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        System.out.println(factorial(a,1));
    }
}
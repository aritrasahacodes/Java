class Max
{
    int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
    double max(double a,double b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
    public static void main(String args[])
    {
        Max obj=new Max();
        int p=Integer.parseInt(args[0]);
        int q=Integer.parseInt(args[1]);
        double r=Double.parseDouble(args[2]);
        double s=Double.parseDouble(args[3]);
        System.out.println(obj.max(p,q));
        System.out.println(obj.max(r,s));
    }
}
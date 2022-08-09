class Num
{
    int a,b;
    Num(int x,int y)
    {
        a=x;
        b=y;
    }
    void swap()
    {
        a=a+b;
        b=a-b;
        a=a-b;
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        Num obj=new Num(x,y);
        obj.display();
        obj.swap();
        obj.display();
    }
}
class Clock 
{
    private int hour,minute;
    Clock()
    {
        hour=0;
        minute=0;
    }
    Clock (int a,int b)
    {
        hour=a;
        minute=b;
    }
    void display()
    {
        System.out.println(hour+":"+minute);
    }
    Clock addClock(Clock c)
    {
        hour=hour+c.hour;
        minute=minute+c.minute;
        if(minute>=60)
        {
            minute-=60;
            hour++;
        }
        return this;
    }
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);
        Clock c1=new Clock(a,b);
        c1.display();
        Clock c2=new Clock(c,d);
        c2.display();
        c1.addClock(c2);
        c1.display();
    }
}
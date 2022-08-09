class Point
{
    int x,y;
    Point()
    {
        x=0;
        y=0;
    }
    Point (int a,int b)
    {
        x=a;
        y=b;
    }
    Point (Point p)
    {
        x=p.x;
        y=p.y;
    }
    void display()
    {
        System.out.println("("+x+","+y+")");
    }
    double calculateDistance(Point p2)
    {
        double dis=Math.sqrt(Math.pow(p2.x-x,2)+Math.pow(p2.y-y,2));
        return dis;
    }
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);
        Point p1=new Point(a,b);
        p1.display();
        Point p2=new Point(c,d);
        p2.display();
        System.out.println(p1.calculateDistance(p2));
    }
}
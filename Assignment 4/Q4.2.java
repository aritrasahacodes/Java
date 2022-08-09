class Shape
{
    //Sphere
    double calculateVolume(double r)
    {
        double ans=(4*3.14*r*r*r)/3;
        return ans;
    }
    //Cone
    double calculateVolume(double r1,double h1)
    {
        double ans=(3.14*r1*r1*h1)/3;
        return ans;
    }
    //Box
    double calculateVolume(double l,double b,double h)
    {
        return l*b*h;
    }
    public static void main(String args[])
    {
        Shape obj=new Shape();
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);
        double d=Double.parseDouble(args[3]);
        double e=Double.parseDouble(args[4]);
        double f=Double.parseDouble(args[5]);
        System.out.println(obj.calculateVolume(a));
        System.out.println(obj.calculateVolume(b,c));
        System.out.println(obj.calculateVolume(d,e,f));
    }
}
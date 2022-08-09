class Circle
{
    double radius,area;
    void setRadius(double r)
    {
        radius=r;
    }
    double calArea()
    {
        area=3.14*radius*radius;
        return area;
    }
    public static void main(String args[])
    {
        double n=Double.parseDouble(args[0]);
        Circle obj=new Circle();
        obj.setRadius(n);
        System.out.println(obj.calArea());
    }
}
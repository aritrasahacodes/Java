class Day
{
    void display()
    {
        System.out.println("Class Day");
    }
}
class Night
{
    void display()
    {
        System.out.println("Class Night");
    }
}
class Call
{
    public static void main(String args[])
    {
        Day obj1=new Day();
        Night obj2=new Night();
        obj1.display();
        obj2.display();
    }
}
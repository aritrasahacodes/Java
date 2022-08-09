class Marks
{
    public static void main(String args[])
    {
        int m=Integer.parseInt(args[0]);
        if(m<50)
        {
            System.out.println("Fail");
        }
        else if(50<=m && m<60)
        {
            System.out.println("Poor");
        }
        else if(60<=m && m<70)
        {
            System.out.println("Average");
        }
        else if(70<=m && m<80)
        {
            System.out.println("Good");
        }
        else if(80<=m && m<90)
        {
            System.out.println("Excellent");
        }
        else if(90<=m && m<100)
        {
            System.out.println("Outstanding");
        }
    }
}
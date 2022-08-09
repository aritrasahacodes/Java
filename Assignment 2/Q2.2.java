class Calc
{
    public static void main(String args[])
    {
        int ans=0;
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[2]);
        char ch=args[1].charAt(0);
        switch(ch)
        {
            case '+':
                ans=a+b;
                break;
            case '-':
                ans=a-b;
                break;
            case '*':
                ans=a*b;
                break;
            case '/':
                ans=a/b;
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
        System.out.println(ans);
    }
}
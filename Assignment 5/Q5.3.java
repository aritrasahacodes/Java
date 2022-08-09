class Complex
{
    int real,img;
    Complex()
    {
        real=0;
        img=0;
    }
    Complex(int a,int b)
    {
        real=a;
        img=b;
    }
    Complex(Complex c)
    {
        real=c.real;
        img=c.img;
    }
    void setReal(int p)
    {
        real=p;
    }
    void setImaginary(int q)
    {
        img=q;
    }
    int getReal()
    {
        return real;
    }
    int getImaginary()
    {
        return img;
    }
    void display()
    {
        System.out.println(real+"+"+img+"i");
    }
    Complex add(Complex c)
    {
        Complex p=new Complex();
        p.real=real+c.real;
        p.img=img+c.img;
        return p;
    }
    Complex subtract(Complex c)
    {   
        Complex p=new Complex();
        p.real=real-c.real;
        p.img=img-c.img;
        return p;
    }
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);

        Complex p1=new Complex();
        p1.setReal(a);
        p1.setImaginary(b);
        p1.display();

        Complex p2=new Complex();
        p2.setReal(c);
        p2.setImaginary(d);
        p2.display();

        Complex p9=new Complex(p1);
        p9.display();

        //Addition
        Complex p3=new Complex();
        p3=p1.add(p2);
        p3.display();

        //Substraction
        Complex p4=new Complex();
        p4=p1.subtract(p2);
        p4.display();
    }
}
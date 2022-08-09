class SalesTaxCalculator
{
    double amount,taxRate;
    double calculateTax()
    {
        return (amount*taxRate)/100;
    }
    void setAmtRate(double a,double t)
    {
        amount=a;
        taxRate=t;
    }
    public static void main(String args[])
    {
        SalesTaxCalculator obj=new SalesTaxCalculator();
        double a=Double.parseDouble(args[0]);
        double t=Double.parseDouble(args[1]);
        obj.setAmtRate(a, t);
        System.out.println(obj.calculateTax());
    }
}

public class calculator 
{
    public void add()
    {
        int a=10;
        int b=20;
        System.out.println("Addition: "+(a+b));
    }
    public void sub()
    {
        int a=10;
        int b=20;
        System.out.println("Subtraction: "+(a-b));
    }
    public void mul()
    {
        int a=10;
        int b=20;
        System.out.println("Multiplication: "+(a*b));
    }
    public void div()
    {
        int a=10;
        int b=20;
        System.out.println("Division: "+(a/b));
    }

    public static void main(String[] args) 
    {
        calculator c = new calculator();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
    
}
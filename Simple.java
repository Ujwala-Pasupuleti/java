class Base
{
    int a,b;
    Base(int a,int b)
    {
        System.out.println("Base paraameterized constructor..");
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("Base display..");
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
    }
}
class Child extends Base{
    int c,d;
    Child(int c,int d)
    {
        super(10,20);
        this.c=c;
        this.d=d;
        System.out.println("child class constructor");
    }
    void display2()
    {
        System.out.println("child display..");
        System.out.println("c:\t"+c);
        System.out.println("d:\t"+d);
    }
}
public class Simple {
    
    public static void main(String[]args)
    {
        Child c= new Child(100,200);
        c.display();
        c.display2();
    }
}
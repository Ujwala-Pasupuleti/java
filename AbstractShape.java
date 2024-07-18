abstract class Shape{
    abstract void area();
    void height(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    public void area(){
        System.out.println("Circle");
    }
}
class Rectangle extends Circle{
    public void area(){
        System.out.println("Rectangle");
    }
}
 public class AbstractShape {
    public static void main(String[] args) {
        Shape s=new Circle();
        Circle c=new Rectangle();
        s.area();
        s.height();
        c.area();
    }
}

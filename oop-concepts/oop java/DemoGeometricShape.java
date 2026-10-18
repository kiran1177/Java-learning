abstract class GeometricShape
{
    abstract void area();
    abstract void perimeter();
}
class Squre extends GeometricShape
{
    double length;
    Squre(double length)
    {
       this.length=length;
    }
    public void area()
    {
        System.out.println(length*length);
    }
    public void perimeter()
    {
        System.out.println("squre");
    }
}
class Circle extends GeometricShape
{
    double radius;
    Circle(double radius)
    {
       this.radius=radius;
    }
    public void area()
    {
       System.out.println(3.14*radius*radius);
    }
    public void perimeter()
    {
      System.out.println("circle");
    }
}
class DemoGeometricShape
{
    public static void main(String args[])
    {
         Squre obj1=new Squre(23.5);
         obj1.area();
         obj1.perimeter();
         Circle obj2=new Circle(23.56);
         obj2.area();
         obj2.perimeter();
    }
}
//polymorsim have abstract method,class also they have construct
//Polymorphism = One name, many forms.

abstract class Shape
{
    public abstract double getarea();
    public abstract double perimeter();
}

class Circle extends Shape
{
    int radius;

    Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public double getarea()
    {
        return 3.14159 * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * 3.14159 * radius;
    }
}

class Square extends Shape
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    @Override
    public double getarea()
    {
        return side * side;
    }

    @Override
    public double perimeter()
    {
        return 4 * side;
    }
}

class DemoPolymorsim
{
    public static void main(String[] args)
    {
        Shape obj1 = new Square(23.56);
        Shape obj2 = new Circle(34);

        System.out.println("Square area: " + obj1.getarea());
        System.out.println("Square perimeter: " + obj1.perimeter());

        System.out.println("Circle area: " + obj2.getarea());
        System.out.println("Circle perimeter: " + obj2.perimeter());
    }
}


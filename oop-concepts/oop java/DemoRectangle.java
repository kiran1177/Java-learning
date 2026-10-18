class Rectangle
{
    private double length;
    private double width;

    public void setlength(double length)
    {
        this.length=length;
    }
    public double getlength()
    {
        return length;
    }
    public void setwidth(double width)
    {
        this.width=width;
    }
    public double getwidth()
    {
       return width;
    }
}
class DemoRectangle
{
    public static void main(String args[])
    {
        Rectangle obj=new Rectangle();
        obj.setlength(12.34);
        obj.setwidth(34.56);
        System.out.println(obj.getlength());
        System.out.println(obj.getwidth());

    }
}
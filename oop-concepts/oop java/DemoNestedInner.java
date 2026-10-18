class DemoNestedInner
{
    class Inner
    {
        void detailsdisplay()
        {
            System.out.println("this is inner class");
            System.out.println("hello java");
        }
    }
    
    void display()
    {
        Inner obj=new Inner();
        obj.detailsdisplay();
    }

    public static void main(String args[])
    {
        DemoNestedInner obj1=new DemoNestedInner();
        obj1.display();
    }
    
    




}
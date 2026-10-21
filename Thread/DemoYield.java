//we can do many task ,work like CPU like that work yield
class DemoYield extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
          System.out.println(getName()+" "+i);
          Thread.yield();
        }
       
    }
    public static void main(String args[])
    {
         DemoYield obj1=new DemoYield();
         DemoYield obj2=new DemoYield();

         obj1.setName("A");
         obj2.setName("B");
         obj1.start();
         obj2.start();

    }
}
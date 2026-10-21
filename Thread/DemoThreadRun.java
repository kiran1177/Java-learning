
class DemoThreadRun implements Runnable
{
    public void start()
    {
      System.out.println("java");
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
        }
    }
    public static void main(String args[])
    {
       DemoThreadRun obj=new DemoThreadRun();
       obj.start();
       obj.run();
    }
}

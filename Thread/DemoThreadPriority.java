//give assign different priority for our task
//setName,setPriority,getPriority is inbuilt method
class DemoThreadPriority extends Thread
{
    public void run()
    {
        System.out.println(getName() +" "+ getPriority());
    }
    
    public static void main(String args[])
    {
        DemoThreadPriority obj1=new DemoThreadPriority();
        DemoThreadPriority obj2=new DemoThreadPriority();
         obj1.setName("hello");
         obj2.setName("priority");
         obj1.setPriority(3);
         obj2.setPriority(4);

         obj1.start();
         obj2.start();
        
    }
}
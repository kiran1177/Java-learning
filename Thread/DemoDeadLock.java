//synchronized-allow only one thread at time
//deadlock-that call method in another method with synchronized and make situation is never end it's create deadlock

class A
{
     synchronized public void d1(B b)
     {
        System.out.println("d1 fun");
        try
        {
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
        }
        System.out.println("calling d2 fun function");
        b.fun();
     }
     synchronized public void fun()
     {
        System.out.println("call d1 fun");
     }
}
class B
{
   synchronized public void d2(A a)
   {
      System.out.println("d2 fun");
      try
        {
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
        }
        System.out.println("calling d1 fun function");
        a.fun();
   }
     synchronized public void fun()
     {
        System.out.println("call d2 fun");
     }
   
    
}
 
class DemoDeadLock extends Thread
{
   A a=new A();
   B b=new B();
   public void m()
   {
       this.start();
       b.d2(a);
   }
   public void run()
   {
       a.d1(b);
   }
   public static void main(String[] args)
   {
       DemoDeadLock obj=new DemoDeadLock();
       obj.m();
   }
}


class MyThread extends Thread
{
    public void run()
    {
       for(int i=1;i<5;i++)
       {
          System.out.println(i);
          
       }
    }
    public static void main()
    {
     MyThread obj=new MyThread();
     obj.start();
     }
}

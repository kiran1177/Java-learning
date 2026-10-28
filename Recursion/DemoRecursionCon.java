//with stop condition
class DemoRecursion
{
    public void print(int i)
    {
       
       if(i>=4)
       {
          return ;
       }
       
       
       print(i+1);
       System.out.println(i);
    }
    public static void main(String args[])
    {
          
          DemoRecursion obj=new DemoRecursion();
          obj.print(0);
          
    }
}


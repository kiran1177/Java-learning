//throw-create own exception.
//throws-only declares that a method might throw an exception
import java.util.Scanner;
class DemoThread
{
     public void divisor()throws Exception
     {
        int n; 
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0)
        {
           throw new Exception("it's caused infinited ");
        }
        else
        { 
          System.out.println("can perform");
        }
     }
     public static void main(String args[])
     {
        DemoThread obj=new DemoThread();
        try
        {
           obj.divisor();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     }
}


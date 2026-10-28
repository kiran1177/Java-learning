
import java.util.Scanner;
class DemoFib
{
    public int  fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        //n-1 -last number,n-2 -second last number
        //their addition make fib. series
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        int n;
        DemoFib obj=new DemoFib();
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println(obj.fib(i));//time complexcity is (2^n) expo.

        }

    }
}
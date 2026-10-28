//that program specified for even numbers size
//if size odd numbers logic changes
import java.util.Scanner;
class DemoReverse
{
    
    int [] a;//int a[]=new int[n] not used because that specified size at runtime
    public void reverse(int i,int r)
    {
    
       if(i>=r)
       {
        return ;
       }
       int temp=a[i];
       a[i]=a[r];
       a[r]=temp;
       reverse(i+1,r-1);
        
    }
    public static void main(String args[])
    {
        DemoReverse obj=new DemoReverse();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        obj.a=new int[n];//dymanic array creation because of user which n pass,that numbers it reverse
        for(int i=0;i<n;i++)
        {
           obj.a[i]=sc.nextInt();     
        }
        obj.reverse(0,n-1);
        System.out.println("Reversed array");
        for(int i=0;i<n;i++)
        {
          System.out.print(obj.a[i]+" ");
        }
        
    

    }
}
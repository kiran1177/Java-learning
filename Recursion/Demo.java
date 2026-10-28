//basic of recursion
//recursion-function call it self
class Demo 
{
    public void print(int i,int n)
    {
        if(i<n)
        {
            return;
        }
        
        print(i-1,n);
        System.out.println(i);
        
    }
    public static void main(String args[])
    {
        Demo obj=new Demo();
        obj.print(5,0);
    }
}
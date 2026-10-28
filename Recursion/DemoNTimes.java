class DemoNTimes
{
    public void fun(int i,int n)
    {   
        if(i>=n)//that also change by write i<n 
        {
            return;
        }
        fun(i+1,n);//important first print or second print due to this o/p give it
        System.out.println(i);//print n
        

    }
    public static void main(String args[])
    {
        DemoNTimes obj=new DemoNTimes();
        obj.fun(0,5);
    }
}
class DemoStaticMethod
{
    static int add(int a,int b)
    {
        return a+b;
    }
  public static void main(String args[])
  {
     int sum=DemoStaticMethod.add(10,20);
     System.out.println(sum);

  }  
}
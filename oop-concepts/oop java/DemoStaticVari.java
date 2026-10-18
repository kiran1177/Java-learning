class DemoStaticVari
{
    static int count=0;
    DemoStaticVari()
    {
       count++;
    }

    public int getcount()
    {
        return count;
    }

    public static void main(String args[])
    {
        DemoStaticVari obj=new DemoStaticVari();
        System.out.println(obj.getcount());
        DemoStaticVari obj2=new DemoStaticVari();
        System.out.println(obj2.getcount());
    }
}
class DemoDefaultCons
{
    private String name;
    private int age;
    DemoDefaultCons()
    {
         this.name="John";// using this keyword to same as variable name
         this.age=23;
    }
     public String getname()//void replace with string to return name
     
     {
        return name;
     }

     public int getage()
     {
        return age;
     }

    
    
    public static void main(String args[])
    {
        DemoDefaultCons obj=new DemoDefaultCons();
        System.out.println(obj.getname());//direct accessing the method
        System.out.println(obj.getage());//direct accesing the method
    }
}

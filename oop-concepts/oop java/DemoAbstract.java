abstract class Department
{
      abstract void name();
}
class Faculty extends Department
{
       public void name()
       {
              System.out.println("kishansir");
       }

}
class HOD extends Department
{
       public void name()
       {
              System.out.println("Toshalma'am");
       }

}
class DemoAbstract
{
       public static void main(String args[])
       {
              HOD obj=new HOD();
              Faculty obj1=new Faculty();
              obj.name(); 
              obj1.name();
       }
}


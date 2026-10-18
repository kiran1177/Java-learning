//Static Nested Outer class 
class Univercity
{
    static class Department
    {
        String facultyname;
        int facultyid;
        Department(String facultyname,int facultyid)
        {
            this.facultyname=facultyname;
            this.facultyid=facultyid;
        }

        void display()
     {
        System.out.println(facultyname + " " +facultyid);
     }
    }

    

    public static void main(String args[])
    {
       // Univercity obj=new Univercity();
        //Univercity.Department obj1=obj.new Department("kishansir",1234);
        Univercity.Department obj1=new Univercity.Department("kishansir",1234);
        obj1.display();
        //OuterClass.InnerClass is used to access a nested class; if it is non-static, create it using an outer-class object.
        //we create object static class but not refence this class so ,this way create
    }
}
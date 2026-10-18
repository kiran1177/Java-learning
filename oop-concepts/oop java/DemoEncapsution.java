class Student
{
    private int student_id;
    private String student_name;
    private int grade;

    public void setid(int student_id)
    {
        this.student_id=student_id;
    }
    public void getid()
    {
        System.out.println(student_id);
    }
    public void setname(String student_name)
    {
        this.student_name=student_name;
    } 
    public void getname()
    {
        System.out.println(student_name);
    }
    public void setadd(int grade)
    {
       this.grade=grade;
    }
    public void getadd()
    {
        System.out.println(grade);
    }
}
class DemoEncapsution
{
    public static void main(String aregs[])
    {
        Student obj=new Student();
        obj.setid(1);
        obj.getid();
        obj.setname("raj");
        obj.getname();
        obj.setadd(5);
        obj.getadd();
    }
}


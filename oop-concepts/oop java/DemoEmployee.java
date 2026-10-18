//single inheritance
class Employee
{
    private int salary;
    Employee(int salary)
    {
        this.salary=salary;
    }
    public void work()
    {
         System.out.println("employee is working");
    }

    public int getsalary()
    {
        return salary;
    }
}
class HRManager extends Employee
{
    HRManager(int salary)
    {
        super(salary);
    }
    public void work()
    {
        System.out.println("HR manager is working");
    }

    public void addMethod()
    {
        System.out.println("this is add method");
    }
}
class DemoEmployee
{
    public static void main(String args[])
    {
        Employee emp=new Employee(50000);
        emp.work();
        System.out.println(emp.getsalary());
        HRManager hrManager = new HRManager(3440000);
        hrManager.work();
        hrManager.addMethod();
        System.out.println(hrManager.getsalary());
    }
}
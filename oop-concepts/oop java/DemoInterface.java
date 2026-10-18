
interface Account
{
   void deposit(double amount);
   void withdraw(double amount);
   void calculate_interest();
  void view_balance();
}
class CurrentAccount implements Account
{
    double balance;
    CurrentAccount(double balance)
    {
       this.balance=balance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("deposit sucsefully");
    }
    public void withdraw(double amount)
    {
       if(balance>amount+5000)
       {
         balance=balance-amount;
         System.out.println(balance);
       }
       System.out.println("insuffient balance");
    }
    public void calculate_interest()
    {
         balance=balance*0.14;
         System.out.println("no interest");
    }
    public void view_balance()
    {
        System.out.println(balance);
    }
}
class SavingAccount implements Account
{
    double balance;
    SavingAccount(double balance)
    {
       this.balance=balance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("deposit sucsefully");
    }
    public void withdraw(double amount)
    {
       if(balance>amount)
       {
         balance=balance-amount;
         System.out.println(balance);
       }
       System.out.println("insuffient balance");
    }
    public void calculate_interest()
    {
         balance=balance*0.14;
         System.out.println(balance);
    }
    public void view_balance()
    {
        System.out.println(balance);
    }
   
}
class Bank 
{
   Account accounts[]=new Account[10];
   int count=0;
   public void addAccount(Account a)
   {
      if(count<accounts.length)
      {
        accounts[count]=a;
        count++;
        System.out.println("add account");
      }
   }
   public void showAccounts()
   {
       for(int i=0;i<count;i++)
       {
        accounts[i].view_balance();
       }
   }
}
class DemoInterface
{
    public static void main(String args[])
    {
        Bank bank=new Bank();
        SavingAccount s1=new SavingAccount(10000);
        CurrentAccount c1=new CurrentAccount(20000);
        s1.deposit(234);
        s1.withdraw(345);
        s1.calculate_interest();
        s1.view_balance();
        c1.deposit(2334);
        c1.withdraw(5978);
        c1.calculate_interest();
        c1.view_balance();
        bank.addAccount(s1);
        bank.showAccounts();

    }
}

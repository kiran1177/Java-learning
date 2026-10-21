import java.util.Scanner;

class OverageException extends RuntimeException
 {
    OverageException(String msg) 
    {
        super(msg);
    }
}

class UnderageException extends RuntimeException 
{
    UnderageException(String msg) 
    {
        super(msg);
    }
}

class DemoUserException
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try
         {
            if (age < 18) 
            {
                throw new UnderageException("Age is below 18.");
            } else if (age > 60) 
            {
                throw new OverageException("Age is above 60.");
            } else 
            {
                System.out.println("Valid age. Access granted.");
            }
        } catch (UnderageException | OverageException e) 
         {
            System.out.println( e.getMessage());
         }
    }
}
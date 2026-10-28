// Recursion without a base condition
class DemoRecursion {
    public void print()
    {
        int i = 0;
        i++;
        System.out.println(i);

        print(); // Calls itself repeatedly without stopping

        // It causes StackOverflowError because the method
        // keeps calling itself without a base condition.
        // A new local variable i is created in every method call.
        // The call stack eventually runs out of available space.
    }

    public static void main(String args[])
    {
        DemoRecursion obj = new DemoRecursion();
        obj.print();
    }
}
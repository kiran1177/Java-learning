//try-write when exception create
//catch-handle this exception

class PrinterService
{
    synchronized public void printName(String userName)
    {
        System.out.println("printer");
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
        }
        System.out.println(userName);
    }
}

class PrinterThread extends Thread
{
    PrinterService printer;
    String userName;

    PrinterThread(PrinterService printer, String userName)
    {
        this.printer = printer;
        this.userName = userName;
    }

    public void run()
    {
        printer.printName(userName);
    }
}

class DemoThreadEx
{
    public static void main(String args[])
    {
        PrinterService printer = new PrinterService();
        PrinterThread firstThread = new PrinterThread(printer, "sanskruti");
        PrinterThread secondThread = new PrinterThread(printer, "raj");
        firstThread.start();
        secondThread.start();
    }
}

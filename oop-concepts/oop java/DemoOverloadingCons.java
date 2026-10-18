class DemoOverloadingCons
{
    String bookname;
    String bookauthor;
    String bookprice;

    public DemoOverloadingCons()
    {
        this.bookname="python";
        this.bookauthor="albert";
           System.out.println(bookname+ " "+bookauthor);
       
    }

    public DemoOverloadingCons(String bookname,String bookauthor,String bookprice)
    {
        this.bookname=bookname;
        this.bookauthor=bookauthor;
        this.bookprice=bookprice;
         System.out.println(bookname + " " +bookauthor + " " + bookprice);
        
    }

    public static void main(String args[])
    {
        DemoOverloadingCons obj1=new DemoOverloadingCons();
        DemoOverloadingCons obj=new DemoOverloadingCons("java","james","1000");
       



    }
}
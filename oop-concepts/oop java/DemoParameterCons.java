class DemoParameterCons
{
    String name;
    String address;
    DemoParameterCons(String name, String address)//parameterrized used so in() write what you give
    {
        this.name=name;
        this.address=address;
    }

    public String getname()
    {
        return name;
    }
     public String getaddress()
     {
        return address;
     }

    public static void main(String[] args)
    {
        DemoParameterCons obj= new DemoParameterCons("john","USA");//direct give argument in this because parameterizer
        System.out.println(obj.getname());
        System.out.println(obj.getaddress());
    }
}
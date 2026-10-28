class DemoPelindrome
{
    Boolean reverse(String s, int i)
    {
        int n = s.length();
        if (i >= n / 2)
        {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1))
        {
            return false;
        }
        return reverse(s, i + 1);
    }

    public static void main(String args[])
    {
        DemoPelindrome obj = new DemoPelindrome();
        String s = "MADAM";

        if (obj.reverse(s, 0))
        {
            System.out.println("it's palindrome");
        }
        else
        {
            System.out.println("it's not palindrome");
        }
    }
}

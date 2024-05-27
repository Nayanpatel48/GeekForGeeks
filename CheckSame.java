public class CheckSame
{
    public static void main(String[] args)
    {
        String S = "wwwwwwwwwwwfwwww";
        System.out.println(check(S));
    }
    public static Boolean check (String s)
    {
        boolean a = true;
        for (int i=1;i<s.length();i++)
        {
            if (s.charAt(0)==s.charAt(i))
                continue;
            a=false;
        }
        return a;
    }
}

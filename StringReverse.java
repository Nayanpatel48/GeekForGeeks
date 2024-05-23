public class StringReverse
{
    public static void main(String[] args)
    {
        String s= "GeekForGeeks";
        System.out.println(revStr(s));
    }
    public static String revStr(String s)
    {
        java.lang.StringBuilder f = new java.lang.StringBuilder();
        f.append(s);
        return f.reverse().toString();
    }
}

public class JavaStrings
{
    public static void main(String[] args)
    {
        String s1 ="abc";
        String s2 ="def";
        System.out.println(conRevstr(s1, s2));
    }
    public static String conRevstr(String S1, String S2)
    {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append(S1);
        s.append(S2);
        return s.reverse().toString();
    }
}
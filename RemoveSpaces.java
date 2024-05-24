public class RemoveSpaces
{
    public static void main(String[] args)
    {
        String a = "a b c c ccc    d";
        System.out.println(modify(a));
    }
    public static String modify(String S)
    {
        java.lang.StringBuilder d = new java.lang.StringBuilder();
        char[] a = S.toCharArray();
        for(int i=0;i<S.length();i++)
        {
            if (a[i] != ' ')
                d.append(a[i]);
        }
        return d.toString();
    }
}
public class RemoveVowels
{
    public static void main(String[] args)
    {
        String S = "welcome to geeksforgeeks";
        System.out.println(removeVowels(S));
    }
    public static String removeVowels(String S)
    {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        for (int i=0;i<S.length();i++)
        {
            if (S.charAt(i) == 'a'||S.charAt(i) == 'e'||S.charAt(i) == 'i'||S.charAt(i) == 'o'||S.charAt(i) == 'u')
                continue;
            s.append(S.charAt(i));
        }
        return s.toString();
    }
}

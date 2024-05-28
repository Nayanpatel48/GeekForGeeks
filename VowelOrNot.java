public class VowelOrNot
{
    public static void main(String[] args)
    {
        char a = 'a';
        System.out.println(isVowel(a));
    }
    public static String isVowel(char c)
    {
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return "YES";
        return "NO";
    }
}
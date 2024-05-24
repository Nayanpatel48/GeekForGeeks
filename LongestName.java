public class LongestName
{
    public static void main(String[] args)
    {
        String[] a = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longest(a.length, a));
    }
    public static String longest(int n, String[] names)
    {
        int max = 0;
        for (int i=1;i<n;i++)
        {
            if (names[i].length()>names[max].length())
                max=i;
        }
        return names[max];
    }
}
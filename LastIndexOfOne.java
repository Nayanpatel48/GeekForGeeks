import java.util.Scanner;

public class LastIndexOfOne
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        System.out.println(lastIndex(s));
    }
    public static int lastIndex( String s)
    {
        char[] a = s.toCharArray();
        for (int i=a.length-1;i>=0;i--)
        {
            if (a[i]=='1')
                return i;
        }
        return -1;
    }
}
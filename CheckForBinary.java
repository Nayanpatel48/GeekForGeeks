import java.util.Scanner;

public class CheckForBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBinary(s));
    }
    public static boolean isBinary(String str)
    {
        char[] a = str.toCharArray();
        for (int i=0;i<a.length;i++)
        {
            if (a[i]=='0' || a[i]=='1')
                continue;
            else
                return false;
        }
        return true;
    }
}
import java.util.Scanner;

public class JavaSubString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Enter L:");
        int p = sc.nextInt();
        System.out.println("Enter N:");
        int q = sc.nextInt();
        System.out.println(javaSub(s,p,q));
    }
    public static String javaSub(String S, int L, int R)
    {
        char[] s = S.toCharArray();
        int size=R-L+1;
        char[] g = new char[size];
        int i=0;
        while (L <= R)
        {
            g[i]=s[L];
            i++;
            L++;
        }
        return new String(g);
    }
}
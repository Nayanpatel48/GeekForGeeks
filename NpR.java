import java.util.Scanner;

public class NpR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(nPr(n,m));
    }
    public static long nPr(long n, long r)
    {
        return factorail(n)/((factorail(n-r))*factorail(r));
    }
    public static long factorail(long n)
    {
        if (n==0)
            return 1;
        else
            return n*factorail(n-1);
    }
}

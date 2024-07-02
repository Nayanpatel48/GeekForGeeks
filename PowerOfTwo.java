import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerofTwo(n));
    }
    public static boolean isPowerofTwo(long n)
    {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
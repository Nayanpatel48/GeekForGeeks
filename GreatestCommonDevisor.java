import java.math.BigInteger;
import java.util.Scanner;

public class GreatestCommonDevisor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b) {
        BigInteger n1 = new BigInteger(String.valueOf(a));
        BigInteger n2 = new BigInteger(String.valueOf(b));
        BigInteger n3 = n1.gcd(n2);
        String s= n3.toString();
        int x=Integer.parseInt(s);
        return x;
    }
}
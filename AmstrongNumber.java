import java.math.BigInteger;
import java.util.Scanner;

public class AmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(armstrongNumber(n));
    }
    public static String armstrongNumber(int n)
    {
        String s = Integer.toString(n);
        char[] a = s.toCharArray();
        BigInteger k1 = new BigInteger(String.valueOf(a[0]));
        int n1 = k1.intValue();
        BigInteger k2 = new BigInteger(String.valueOf(a[1]));
        int n2 = k2.intValue();
        BigInteger k3 = new BigInteger(String.valueOf(a[2]));
        int n3 = k3.intValue();
        if ((n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3) == n)
            return "true";
        else
            return "false";
    }
}
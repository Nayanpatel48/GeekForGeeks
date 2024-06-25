import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static String isPrime(int n)
    {
        if(n==2)
            return "Yes";
        if (n%2 == 0 || n==1)
            return "No";
        for (int i=3;i<n/2;i++)
        {
            if (n%i==0)
                return "No";
        }
        return "Yes";
    }
}
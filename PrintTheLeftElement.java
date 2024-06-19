import java.util.Scanner;

public class PrintTheLeftElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        long[] a = new long[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextLong();
        System.out.println(leftElement(a,n));
    }
    public static long leftElement(long[] arr, long n)
    {
        java.util.Arrays.sort(arr);
        if (n%2==0)//even
        {
            int s = (int) n/2;
            return arr[s-1];
        }
        else
        {
            int j = (int)n/2;
            return arr[j];
        }
    }
}
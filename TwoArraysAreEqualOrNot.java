import java.util.Scanner;

public class TwoArraysAreEqualOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //==========================================================================
        System.out.println("Enter n:");
        int n = sc.nextInt();
        long[] a = new long[n];
        //==========================================================================
        System.out.println("Enter array a elements:");
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        //===========================================================================
        long[] b = new long[n];
        System.out.println("Enter array b elements:");
        for (int i=0;i<n;i++)
            b[i]= sc.nextInt();
        //===========================================================================
        System.out.println(check(a,b,n));
    }
    public static boolean check(long A[],long B[],int N)
    {
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        int ans = java.util.Arrays.compare(A,B);
        if (ans==0)
            return true;
        else
            return false;
    }
}
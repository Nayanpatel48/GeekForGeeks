import java.util.Scanner;

public class Fibbonacci
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = s.nextInt();
        long[] l = printFibb(n);
        for (long value : l) System.out.println(value);
    }
    public static long[] printFibb(int n)
    {
        if (n==1)
        {
            long[] a = {1};
            return a;
        }
        long[] a = new long[n];
        a[0]=1;
        a[1]=1;
        int i =2;
        long prevprev, prev;
        while (i<n)
        {
            prevprev = a[i-2];
            prev=a[i-1];
            a[i]=prevprev+prev;
            i++;
        }
        return a;
    }
}

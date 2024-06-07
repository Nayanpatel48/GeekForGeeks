import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtLeastTwoGreaterElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        long[] a = new long[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        long[] s = findElements(a,n);
        for (int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
    public static long[] findElements( long a[], long n)
    {
        java.util.Arrays.sort(a);
        long greatest=a[(int) (n-1)];
        long secondGreatest=0;
        for (int i=(int) n-1;i>=0;i--)
        {
            if (greatest != a[i])
            {
                secondGreatest=a[i];
                break;
            }
        }
        long[] s = new long[(int) n];
        int count=0;
        for (int i=0;i<n;i++)
        {
            if (a[i] != greatest && a[i] != secondGreatest)
            {
                s[i]=a[i];
                count++;
            }
        }
        long[] s1 = new long[count];
        for (int i=0;i<count;i++)
            s1[i]=s[i];
        return s1;
    }
}

import java.util.Scanner;

public class KthSmallestEle
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
        System.out.println("Enter m:");
        int m = sc.nextInt();
        System.out.println("Enter array elements:");
        long[] b = new long[m];
        for (int i=0;i<m;i++)
            b[i]= sc.nextLong();
        merge(a,b,n,m);
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        long[] a = new long[n+m];
        if (n >= 0) System.arraycopy(arr1, 0, a, 0, n);
        int k=n;//index of arr2
        int i=0;
        while (k<m+n)
        {
            a[k]=arr2[i];
            k++;
            i++;
        }
        java.util.Arrays.sort(a);
        i=0;//index of arr1
        int j=0;//index of a
        while (i<n)
        {
            arr1[i]=a[j];
            i++;
            j++;
        }
        k=0;//index of arr2
        while (k<m)
        {
            arr2[k]=a[j];
            k++;
            j++;
        }
        pr(arr1);
        pr(arr2);
    }
    public static void pr(long[] a)
    {
        for (long l : a) System.out.println(l);
    }
}
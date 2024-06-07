import java.util.Scanner;

public class SmallerAndLarger
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
        System.out.println("Enter key:");
        int key = sc.nextInt();
        int[] s = getMoreAndLess(a,n,key);
        for (int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
    public static int[] getMoreAndLess(int[] arr, int n, int x)
    {
        int[] a = new int[2];
        int smaller=0;
        int greater=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]<=x)
                smaller++;
        }
        for (int i=0;i<n;i++)
        {
            if (arr[i]>=x)
                greater++;
        }
        a[0]=smaller;
        a[1]=greater;
        return a;
    }
}
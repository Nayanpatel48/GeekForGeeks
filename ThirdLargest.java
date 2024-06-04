import java.util.Scanner;

public class ThirdLargest
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
        System.out.println(thirdLargest(a,n));
    }
    public static int thirdLargest(int a[], int n)
    {
        java.util.Arrays.sort(a);
        int count=3;
        if (a.length ==1 || a.length ==2)
            return -1;
        for (int i = n-1;i>0;i--)
        {
            if (count ==1)
            {
                return a[i];
            }
            if (a[i] != a[i-1])
                count--;
        }
        return -1;
    }
}
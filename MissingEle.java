import java.util.Scanner;
public class MissingEle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n-1];
        System.out.println("Enter array elements:");
        for (int i=0;i<n-1;i++)
            a[i]= sc.nextInt();
        System.out.println(missingNumber(a,n));
    }
    public static int missingNumber(int array[], int n)
    {
        java.util.Arrays.sort(array);
        int[] a = new int[n];
        for (int i=1;i<=n;i++)
            a[i-1]=i;
        int i=0;
        while (i != n-1)
        {
            if (a[i] != array[i])
                return a[i];
            i++;
        }
        return a[n-1];
    }
}
import java.util.Scanner;

public class PositiveMissing
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
        System.out.println(missingNumber(a,n));
    }
    public static int missingNumber(int arr[], int size)
    {
        java.util.Arrays.sort(arr);
        int k=1;
        int prev=999999999;
        for (int i=0;i<size;i++)
        {
            if (arr[i] <=0)
                continue;
            if (i>0)
            {
                if (arr[i-1]==arr[i])
                    continue;
            }
            if (arr[i] == k)
                k++;
            else
                return k;
        }
        return k;
    }
}
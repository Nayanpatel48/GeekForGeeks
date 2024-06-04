import java.util.Scanner;

public class MissingNumber
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
        System.out.println(missingNumber(n,a));
    }
    public static int missingNumber(int n, int[] arr)
    {
        java.util.Arrays.sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            if ((i+1) != arr[i])
                return i+1;
        }
        return n;
    }
}

import java.util.Scanner;

public class SecondLLargestEle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter 0,1,2:");
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(print2largest(a,n));
    }
    public static int print2largest(int arr[], int n)
    {
        java.util.Arrays.sort(arr);
        for (int i=n-2;i>0;i--)
        {
            if (arr[n-1] != arr[i])
                return arr[i];
        }
        return -1;
    }
}

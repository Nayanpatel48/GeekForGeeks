import java.util.Scanner;

public class SearchElementInAnArray
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
        System.out.println(search(a,n,key));
    }
    public static int search(int arr[], int N, int X)
    {
        java.util.Arrays.sort(arr);
        int low=0;
        int high=N-1;
        while (true)
        {
            int mid = (low+high)/2;
            if (arr[mid] == X)
                return mid;
            else if (arr[mid]>X)
                high=mid-1;
            else
                low=mid+1;
        }
    }
}
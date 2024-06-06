import java.util.ArrayList;
import java.util.Scanner;

public class MidSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter element :");
        int m =sc.nextInt();
        System.out.println(search(a,0,n-1,m));
    }
    public static int search(int A[], int l, int h, int key)
    {
        for (int i=0;i<=h;i++)
        {
            if (A[i]==key)
                return i;
        }
        return -1;
    }
}

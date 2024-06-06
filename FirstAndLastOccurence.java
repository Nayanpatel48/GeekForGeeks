import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastOccurence
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
        ArrayList<Integer> c = find(a,n,m);
        System.out.println(c);
    }
    public static ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            if (arr[i] == x)
            {
                System.out.println(arr[i]);
                a.add(i);
                break;
            }
        }
        for (int i=n-1;i>=0;i--)
        {
            if (arr[i] == x)
            {
                System.out.println(arr[i]);
                a.add(i);
                break;
            }
        }
        if (a.isEmpty())
        {
            a.add(-1);
            a.add(-1);
        }
        return a;
    }
}
import java.util.Scanner;

public class FindIndex
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
        int[] s = findIndex(a,n,key);
        for (int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
    public static int[] findIndex(int arr[], int n, int key)
    {
        int[] s = {-1,-1};
        for (int i=0;i<n;i++)
        {
            if (arr[i]==key)
            {
                s[0]=i;
                break;
            }
        }
        for (int i=n-1;i>=0;i--)
        {
            if (arr[i]==key)
            {
                s[1]=i;
                break;
            }
        }
        return s;
    }
}

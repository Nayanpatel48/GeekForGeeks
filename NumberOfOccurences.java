import java.util.Scanner;

public class NumberOfOccurences
{
    public static void main(String[] args)
    {
        System.out.println("Enter array size:");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] a = new int[size];
        System.out.println("Input:-");
        for (int i=0;i<size;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter key:");
        int key = sc.nextInt();
        System.out.println(count(a,size,key));
    }
    public static int count(int[] arr, int n, int x)
    {
        int count=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i] == x)
                count++;
        }
        return count;
    }
}

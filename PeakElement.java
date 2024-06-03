import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(peakElement(a,n));
    }
    public static int peakElement(int[] arr,int n)
    {
        if (n==1)
            return n-1;
        if (arr[0]>=arr[1])
            return -1;
        for (int i=1;i<n-1;i++)
        {
            if (arr[i]>=arr[i+1] && arr[i]>=arr[i-1])
                return i-1;
        }
        if (arr[n-1]>=arr[n-2])
            return n-2;
        return 0;
    }
}
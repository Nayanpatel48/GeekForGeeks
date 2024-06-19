import java.util.Scanner;

public class AverageInAStream
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] a = new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        float[] j = streamAvg(a,n);
        for (float v : j) System.out.println(v);
    }
    public static float[] streamAvg(int[] arr, int n)
    {
        float[] j = new float[n];
        int i=0;
        float k=1;
        int count=0;
        while (i<n)
        {
            count +=arr[i];
            j[i]= count/k;
            k++;
            i++;
        }
        return j;
    }
}
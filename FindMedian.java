import java.util.Scanner;

//Find the median
public class FindMedian
{
    public static void main(String[] args)
    {
        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        int y = find_median(a);
        System.out.println(y);
    }
    public static int find_median(int[] v)
    {
        int n = v.length-1;
        java.util.Arrays.sort(v);
        if (v.length%2 ==0)//even
        {
            int y = (1/2)*((v[n/2])+v[(n/2)+1]);
            return y;
        }
        else//odd
        {
            return v[(n+1)/2];
        }
    }
}

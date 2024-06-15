import java.util.Scanner;

public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = s.nextInt();
        System.out.println("Enter d:");
        int d = s.nextInt();
        System.out.println("Enter elements:");
        int[] a = new int[n];
        for (int i=0;i<n;i++)
            a[i]=s.nextInt();
        rotateArr(a,d,n);
    }
    public static void rotateArr(int[] arr, int d, int n)
    {
        if (d>=n)
        {
            while (n<=d)
            {
                d=d-n;
            }
        }
        int[] temp = new int[n];
        java.util.Arrays.fill(temp,0);
        int i=d;
        int j=0;
        while (i != n)
        {
            temp[j]=arr[i];
            i++;
            j++;
        }
        for (int k = 0;k<=d-1;k++)
        {
            temp[j]=arr[k];
            j++;
        }
        for (int l=0;l<n;l++)
            arr[l]=temp[l];
        p(arr);
    }
    public static void p(int[] a)
    {
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
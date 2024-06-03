import java.util.Scanner;

public class Sort
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
        sort012(a,n);
    }
    public static void sort012(int a[], int n)
    {
        java.util.Arrays.sort(a);
        printArray(a,n);
    }
    public static void printArray(int a[], int n)
    {
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
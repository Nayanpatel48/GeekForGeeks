import java.util.Scanner;

public class MaxMin
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
        System.out.println(findSum(a, size));
    }
    public static int findSum(int A[],int N)
    {
        java.util.Arrays.sort(A);
        return A[0]+A[N-1];
    }
}

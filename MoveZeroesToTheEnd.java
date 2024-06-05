import java.util.Scanner;

public class MoveZeroesToTheEnd
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
        pushZerosToEnd(a,size);
    }
    public static void pushZerosToEnd(int[] arr, int n)
    {
        int[] c = new int[n];
        java.util.Arrays.fill(c,-1);
        int i=0;//arr
        int j=0;
        while (i != n)
        {
            if (arr[i] != 0)
            {
                c[j]=arr[i];
                j++;
                i++;
                continue;
            }
            i++;
        }
        while (j != n)
        {
            c[j]=0;
            j++;
        }
        for (int k=0;k<n;k++)
            arr[k]=c[k];
        print(arr);
    }
    public static void print(int[] a)
    {
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}

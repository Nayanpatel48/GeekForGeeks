import java.util.Scanner;

public class SwapKthElement
{
    public static void main(String[] args)
    {
        int[] a = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 integer values:");
        for (int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("Enter key:");
        int key = sc.nextInt();
        swapKth(a.length, key, a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void swapKth(int n, int k, int[] arr){
        int first = k-1;
        int last = arr.length-k;
//        System.out.println(arr[first]);
//        System.out.println(arr[last]);
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
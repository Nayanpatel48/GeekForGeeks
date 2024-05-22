//check palidromic array
import java.util.Scanner;

public class PalidromicArray
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        int y = palinArray(a, a.length);
        if(y==1)
            System.out.println("Yes palidromic");
        else
            System.out.println("Not polidromic.");
    }
    public static int palinArray(int[] a, int n)
    {
        for (int i=0;i<n;i++)
        {
            StringBuilder b = new StringBuilder();
            b.append(a[i]);
            String first =b.toString();
            b.reverse();
            String second =b.toString();
            if (!first.matches(second))
                return 0;
        }
        return 1;
    }
}

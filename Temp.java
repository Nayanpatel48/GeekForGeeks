import java.util.Scanner;

public class Temp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, n:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(nthTermOfAP(a, b, n));
    }
    public static int nthTermOfAP(int a1, int a2, int n)
    {
        int diff=a2-a1;
        int count=a2;
        int[] a = new int[10000];
        a[0]=a1;
        a[1]=a2;
        for (int i=2;i<n;i++)
        {
            count+=diff;
            a[i]=count;
        }
        return a[n-1];
    }
}

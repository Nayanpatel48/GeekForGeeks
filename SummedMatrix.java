import java.util.Scanner;

public class SummedMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter q:");
        int q = sc.nextInt();
        System.out.println(sumMatrix(n,q));
    }
    public static long sumMatrix(long n, long q)
    {
        if(n>q)
            return q-1;
        if(n*2<q || n==q)
            return 0;
        else
            return n-(q-n-1);
    }
}
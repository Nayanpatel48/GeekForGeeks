import java.util.Scanner;

public class PrimeSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(primeSum(n));
    }
    public static int primeSum(int N)
    {
        int sum=0;
        String a = Integer.toString(N);
        for (int i=0;i<a.length();i++)
        {
            if (a.charAt(i)=='2')
                sum+=2;
            if (a.charAt(i)=='3')
                sum+=3;
            if (a.charAt(i)=='5')
                sum+=5;
            if (a.charAt(i)=='7')
                sum+=7;
        }
        return sum;
    }
}
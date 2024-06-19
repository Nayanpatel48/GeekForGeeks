import java.util.Scanner;

public class PowOfPower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P:");
        long p = sc.nextLong();
        System.out.println(sum_of_square_evenNumbers(p));
    }
    public static long sum_of_square_evenNumbers(long n)
    {
        long sum=0;
        int j=2;
        while (n !=0 )
        {
            sum += ((long) j *j);
            j+=2;
            n--;
        }
        return sum;
    }
}

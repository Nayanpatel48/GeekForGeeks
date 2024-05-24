public class SumDigits
{
    public static void main(String[] args)
    {
        int n =898;
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int N)
    {
        int sum = 0;
        while (N != 0) {
            sum = sum + N % 10;
            N = N / 10;
        }
        return sum;
    }
}
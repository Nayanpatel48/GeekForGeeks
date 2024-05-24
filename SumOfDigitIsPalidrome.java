public class SumOfDigitIsPalidrome
{
    public static void main(String[] args)
    {
        int n = 88;
        System.out.println(isDigitSumPalindrome(n));
    }
    public static int isDigitSumPalindrome(int n)
    {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        int number = sum, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        O a = new O(sum);
        O b = new O(reverse);
        if (a.val ==b.val)
            return 1;
        else
            return 0;
    }
}
class O
{
    int val;
    O(int val)
    {
        this.val=val;
    }
}
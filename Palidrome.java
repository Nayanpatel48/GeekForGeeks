public class Palidrome
{
    public static void main(String[] args)
    {
        int n = 676;
        System.out.println(is_palindrome(n));
    }
    public static String is_palindrome(int n)
    {
        int number = n, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        if (n==reverse)
            return "Yes";
        return "No";
    }
}

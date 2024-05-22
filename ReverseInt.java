public class ReverseInt
{
    public static void main(String[] args)
    {
        long n=12345;
        long y= reverse_digit(n);
        System.out.println(y);
    }
    public static long reverse_digit(long n)
    {
        long rev_num =0;
        while (n>0)
        {
            rev_num=rev_num*10+n%10;
            n=n/10;
        }
        return rev_num;
    }
}

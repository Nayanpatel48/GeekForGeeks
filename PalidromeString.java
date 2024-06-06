import java.util.Scanner;

public class PalidromeString
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    public static int isPalindrome(String S)
    {
        char[] a  = S.toCharArray();
        int i=0;
        int j = a.length-1;
        while (j != -1 && i !=a.length)
        {
            if (a[i] != a[j])
                return -1;
            i++;
            j--;
        }
        return 1;
    }
}
import java.util.Scanner;

public class FindNthTerm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P:");
        int p = sc.nextInt();
        System.out.println(findNthTerm(p));
    }
    public static int findNthTerm(int N)
    {
        return (N*(N+1))/2;
    }
}
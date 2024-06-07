import java.util.Scanner;

public class PrintPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int N)
    {
        for (int i=1;i<=N;i++)
        {
            for (int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
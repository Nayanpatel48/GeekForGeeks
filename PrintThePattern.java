import java.util.Scanner;

public class PrintThePattern
{
    public static void main(String[] args)
    {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        printPat(size);
    }
    public static void printPat(int n)
    {
        for (int i = n;i>0;i--)
        {
            for (int j = n;j>0;j--)
            {
                for (int k = 0;k<i;k++)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
    }
}

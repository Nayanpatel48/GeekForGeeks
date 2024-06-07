import java.util.Scanner;

public class P
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }
    public static void printNos(int N)
    {
        for (int i=1;i<=N;i++)
            System.out.println(i);
    }
}
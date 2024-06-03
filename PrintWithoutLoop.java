import java.util.Scanner;

public class PrintWithoutLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("N=");
        int n=sc.nextInt();
        printNos(n);
    }
    public static void printNos(int N)
    {
        if (N!=0)
        {
            System.out.println(callMe());
            printNos(N-1);
        }
        else
            return;
    }
    public static int callMe()
    {
        int i=1;
        return i++;
    }
}
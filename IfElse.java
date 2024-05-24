import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(compareFive(n));
    }
    public static String compareFive(int N)
    {
        if (N>5)
            return "Greater than 5";
        else if (N==5)
            return "Equal to 5";
        else
            return "Less than 5";
    }
}

import java.util.Scanner;

public class SimpleIntrestProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P:");
        int p = sc.nextInt();
        System.out.println("Enter R:");
        int r = sc.nextInt();
        System.out.println("Enter T:");
        int t = sc.nextInt();
        System.out.println(simpleInterest(p,r,t));
    }
    public static double simpleInterest(int P, int R, int T)
    {
        return P*(R/100)*T;
    }
}
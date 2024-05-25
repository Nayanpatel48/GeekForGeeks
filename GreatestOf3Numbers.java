import java.util.ArrayList;

public class GreatestOf3Numbers
{
    public static void main(String[] args)
    {
        System.out.println(greatestOfThree(3,4,5));
    }
    public static int greatestOfThree(int A, int B, int C)
    {
        return Math.max(A, Math.max(B,C));
    }
}

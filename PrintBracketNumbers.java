import java.util.ArrayList;
import java.util.Scanner;

public class PrintBracketNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("'Enter string:");
        String exp = sc.nextLine();
        System.out.println(bracketNumbers(exp));
    }
    public static ArrayList<Integer> bracketNumbers(String str)
    {
        ArrayList<Integer> g = new ArrayList<>();
        int[] s = new int[1000];//stack
        int idx = -1;//index -1 means stack is empty
        char[] a = str.toCharArray();
        int x = 0;
        for (int i=0;i<str.length();i++)
        {
            if (a[i]=='(')
            {
                x++;
                g.addLast(x);
                idx++;
                s[idx]=x;
                continue;
            }
            if (a[i]==')')
            {
                int temp=s[idx];
                idx--;
                g.addLast(temp);
            }
        }
        return g;
    }
}
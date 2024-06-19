import java.util.Scanner;

public class REmoveAlpha
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println(removeCharacters(s));
    }
    public static String removeCharacters(String S)
    {
        java.lang.StringBuilder a = new java.lang.StringBuilder();
        char[] b = S.toCharArray();
        for (int i=0;i<S.length();i++)
        {
            if (b[i] == '1'||b[i] == '0'||b[i] == '2'||b[i] == '3'||b[i] == '4'||b[i] == '5'||b[i] == '6'||b[i] == '7'||b[i] == '8'||b[i] == '9')
                a.append(b[i]);
        }
        String m = a.toString();
        return m;
    }
}

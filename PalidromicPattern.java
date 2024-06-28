import java.util.Scanner;

public class PalidromicPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println(pattern(a));
    }
    public static String pattern(int[][] arr)
    {
        java.lang.StringBuilder a = new java.lang.StringBuilder();
        //loop for rows
        for (int i=0;i<arr.length;i++)
        {
            if (determinePalidromic(arr,true,false, i,9) == 0)
            {
                a.append(i);
                a.append(' ');
                a.append('R');
                return a.toString();
            }
        }
        //loop for columns
        for (int i=0;i<arr.length;i++)
        {
            if (determinePalidromic(arr,false,true, 0,i) == 0)
            {
                a.append(i);
                a.append(' ');
                a.append('C');
                return a.toString();
            }
        }
        a.append("-1");
        return a.toString();
    }
    //1 = yes , 0= no
    //completely working
    public static int determinePalidromic(
            int[][] a, boolean row, boolean column, int rowNumber, int columnNumber
    )
    {
        if (row)//if row to be chacked
        {
            int i = 0; //first
            int j = a.length-1; //last
            while (j !=0 && i != a.length-1)
            {
                if (a[rowNumber][i] == a[rowNumber][j]) {
                    i++;
                    j--;
                    continue;
                }
                return 1; // not palidrome
            }
        }
        if (column)
        {
            int i = 0; //first
            int j = a.length-1; //last
            while (j !=0 && i != a.length-1)
            {
                if (a[i][columnNumber] == a[j][columnNumber]) {
                    i++;
                    j--;
                    continue;
                }
                return 1; // not palidrome
            }
        }
        return 0;//valid palidrome
    }
}
import java.util.Scanner;

public class ToeplitzMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        int noOfColumns = sc.nextInt();
        int[][] matrix = new int[noOfRows][noOfColumns];
        for (int i=0;i<noOfRows;i++)
        {
            for (int j=0;j<noOfColumns;j++)
                matrix[i][j] = sc.nextInt();
        }
        System.out.println(isToepliz(matrix));
    }
    public static boolean isToepliz(int mat[][])
    {
        // Number of rows
        int noOfRows = mat.length;

        // Number of columns (assuming all inner arrays have same size)
        int noOfColumns = mat[0].length;

        int token = mat[0][0];

        for (int i=1;i<noOfRows;i++)//row number
        {
            if (i>=noOfColumns)
                return true;
            if (mat[i][i] != token)
                return false;
        }
        return true;
    }
}
import java.util.Scanner;

public class LeftRotateMatrixKTimes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int n = sc.nextInt();
        System.out.println("'Enter matrix elements:");
        int[][] mat = new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                mat[i][j] = sc.nextInt();
        System.out.println("Enter degree of rotation:");
        int k = sc.nextInt();
        int[][] ansMatrix = rotateMatrix(k,mat);
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
                System.out.print(ansMatrix[i][j]+" ");
            System.out.println();
        }
    }
    public static int[][] rotateMatrix(int k, int mat[][])
    {
        int n = mat.length;
        int m = mat[0].length;
        int[][] arr = new int[n][m];
        k = k%m;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int idx = ((m+j)-k)%m;
                arr[i][idx] = mat[i][j];
            }
        }
        return arr;
    }
}
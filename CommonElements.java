import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        //=============================================================
        System.out.println("Enter m:");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter array elements:");
        for (int i=0;i<m;i++)
            b[i]= sc.nextInt();
        //================================================================
        System.out.println("Enter l:");
        int l = sc.nextInt();
        int[] c = new int[l];
        System.out.println("Enter array elements:");
        for (int i=0;i<l;i++)
            c[i]= sc.nextInt();
        ArrayList<Integer> f = commonElements(a,b,c,n,m,l);
        System.out.println(f);
    }
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> a = new ArrayList<>();
        int pref=-999999999;
        for (int i=0;i<n1;i++)
        {
            for (int j=0;j<n2;j++)
            {
                if (A[i] == B[j])
                {
                    for (int k=0;k<n3;k++)
                    {
                        if (A[i] == pref)
                            continue;
                        if (A[i]==C[k])
                        {
                            pref=A[i];
                            a.add(A[i]);
                        }

                    }
                }
            }
        }
        return a;
    }
}
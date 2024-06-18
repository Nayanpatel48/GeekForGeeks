import java.util.ArrayList;
import java.util.Scanner;

public class Union2Arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        long[] a = new long[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextLong();
        System.out.println("Enter m:");
        int m = sc.nextInt();
        System.out.println("Enter array elements:");
        long[] b = new long[m];
        for (int i=0;i<m;i++)
            b[i]= sc.nextLong();
        System.out.println(isSubset(a,b,n,m));
    }
    public static String isSubset( long a1[], long a2[], long n, long m)
    {
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        for (int i=0;i<n;i++)
            a.add(a1[i]);
        for(int j=0;j<m;j++)
            b.add(a2[j]);
        if (a.size()>= b.size())
        {
            for(int j=0;j<m;j++)
            {
                if (a.contains(a.get(j)))
                {}
                else
                    return "No";

            }
            return "Yes";
        }
        for (int j = 0; j < n; j++) {
            if (b.contains(a.get(j))) {
            } else
                return "No";
        }
        return "Yes";
    }
}
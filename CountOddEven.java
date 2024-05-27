import java.util.Scanner;

public class CountOddEven
{
    public static void main(String[] args)
    {
        System.out.println("Enter array size:");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] a = new int[size];
        System.out.println("Input:-");
        for (int i=0;i<size;i++)
            a[i]=sc.nextInt();
        int[] b = countOddEven(a, size);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
    public static int[] countOddEven(int[] arr, int n)
    {
        int[] ans = new int[2];
        int odd=0;
        int even=0;
        for (int i=0;i<n;i++)
        {
            if (arr[i]%2==0)
                even++;
            else
                odd++;
        }
        ans[0]=odd;
        ans[1]=even;
        return ans;
    }
}

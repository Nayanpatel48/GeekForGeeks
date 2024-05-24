public class PerfectArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3,6, 2, 1};
        System.out.println(isPerfect(arr.length, arr));
    }
    public static boolean isPerfect(int n, int[] arr)
    {
        int i=0;
        int j=n-1;
        while (i <n)
        {
            if (i == j)
            {
                i++;
                j++;
                continue;
            }
            if (arr[i] != arr[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

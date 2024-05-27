public class SearchAnElement
{
    public static void main(String[] args)
    {
        int[] a ={1,2,3,4,5,6,7};
        System.out.println(search(a, a.length,90));
    }
    public static int search(int arr[], int N, int X)
    {
        int x = java.util.Arrays.binarySearch(arr,X);
        if (x <0)
            return -1;
        else
            return 1;
    }
}

public class MultiplyArray
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,5,6,6};
        System.out.println(product(a, a.length));
    }
    public static int product(int arr[],int n)
    {
        int product=1;
        for (int i=0;i<n;i++)
            product*=arr[i];
        return product;
    }
}

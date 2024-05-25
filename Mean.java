public class Mean
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,5,6,6};
        System.out.println(mean(a.length, a));
    }
    public static int mean(int N , int[] A) {
        int sum =0;
        for (int i=0;i<N;i++)
            sum+=A[i];
        int mean=sum/N;
        return mean;
    }
}

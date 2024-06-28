import java.util.Scanner;

public class Candy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println(minCandy(n,a));
    }
    public static int minCandy(int N, int[] ratings)
    {
        int total=0;

        // Initialize candy counts (start with 1 for all)
        int[] candies = new int[N];
        for (int i = 0; i < N; i++) {
            candies[i] = 1;
        }

        // Left to right traversal - increasing sequence gets +1
        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left traversal - decreasing sequence needs adjustment
        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] < candies[i + 1] + 1) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        // Calculate total candies
        for (int candy : candies) {
            total += candy;
        }
        return total;
    }
}
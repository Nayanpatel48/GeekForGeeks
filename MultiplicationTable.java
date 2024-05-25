import java.util.ArrayList;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int n=9;
        ArrayList<Integer> a = getTable(n);
        System.out.println(a.toString());
    }
    public static ArrayList<Integer> getTable(int N)
    {
        ArrayList<Integer> a= new ArrayList<>();
        for (int i=1;i<=10;i++)
            a.add(N*i);
        return a;
    }
}

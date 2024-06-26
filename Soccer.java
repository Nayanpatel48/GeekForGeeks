import java.util.Scanner;

public class Soccer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Soccer1[] soccer = new Soccer1[n];
        for (int i=0;i<n;i++)
        {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            soccer[i] = new Soccer1();
            soccer[i].setValues(x1,y1,x2,y2);
        }
        for (int i=0;i<n;i++)
            System.out.println(soccer[i].getAnswer());
    }
}
class Soccer1
{
    int x1=0;
    int y1=0;
    int x2=0;
    int y2=0;
    Soccer1(){}
    public void setValues(int x1, int y1, int x2, int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public String getAnswer()
    {
        int cal = x2-x1;
        if (cal == y2)
            return "NO";
        else if (cal == 2 && y2 == 1)
            return "NO";
        else
            return "YES";
    }
}
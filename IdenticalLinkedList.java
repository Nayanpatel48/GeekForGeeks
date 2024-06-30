import java.util.*;

public class IdenticalLinkedList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0)
        {
            Node1 head1=null,head2=null,tail1= null,tail2=null;

            //input first LL
            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            head1 = new Node1(d1);
            tail1 = head1;

            while (n1 --> 1)
            {
                Node1 n = new Node1(sc.nextInt());
                tail1.next=n;
                tail1=tail1.next;
            }

            //input second LL
            int n2 = sc.nextInt();
            int d2 = sc.nextInt();
            head2 = new Node1(d2);
            tail2 = head2;

            while (n2 --> 1)
            {
                Node1 n = new Node1(sc.nextInt());
                tail2.next=n;
                tail2=tail2.next;
            }
            Solution obj = new Solution();
            if (obj.areIdentical(head1,head2))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
    public static void po(Object o)
    {
        System.out.println(o);
    }
    public static void show(Node1 head)
    {
        while (head != null)
        {
            System.out.println(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
}
class Node
{
    int data;
    Node1 next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Solution
{
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node1 head1, Node1 head2)
    {
        if (head1 == null || head2 == null) {
            return false; // Lists are not identical if one is null
        }

        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        // If one list reaches null before the other, they are not identical
        return head1 == null && head2 == null;
    }
}
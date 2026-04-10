import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}

class LinkedList {
    public ListNode midNode(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        ListNode head = new ListNode(Integer.parseInt(input[0])), cur = head;
        for (int i = 1; i < input.length; i++) { cur.next = new ListNode(Integer.parseInt(input[i])); cur = cur.next; }
        for (ListNode m = new LinkedList().midNode(head); m != null; m = m.next)
            System.out.print(m.val + " ");
    }
}
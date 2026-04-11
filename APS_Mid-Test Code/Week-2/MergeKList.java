import java.util.*;

class MergeKList {
    public ListNode mergeK(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode l : lists)
            while (l != null) { pq.add(l.val); l = l.next; }
        ListNode dummy = new ListNode(0), cur = dummy;
        while (!pq.isEmpty()) { cur.next = new ListNode(pq.poll()); cur = cur.next; }
        return dummy.next;
    }
}
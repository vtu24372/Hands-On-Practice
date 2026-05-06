import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;  
        
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

class ReverseList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] nums = s.nextLine().trim().split(" ");
        
        ListNode head = null, tail = null;  
        
        for (String num : nums) {
            
            int val = Integer.parseInt(num);
            ListNode newNode = new ListNode(val); 
            
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        Solution sol = new Solution();
        ListNode rev = sol.reverseList(head);
        
        ListNode cur = rev;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null)  
                System.out.print(" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
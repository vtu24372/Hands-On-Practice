import java.util.*;

class DetectCycle{
    public ListNode Detect(ListNode head){
        ListNode s = haed, f = head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

            if(s==f){ s=head;
            while(s!=f){
                s=s.next;
                f=f.next;
            }
            return s;
        }
    }
        return null;
    }
}
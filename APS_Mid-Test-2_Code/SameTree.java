import java.util.*;

class Node{
    int val;
    Node left,right;

    Node(int v){
        val = v;
    }
}

public class SameTree{

    static Node build(String[] a){
        
        if(a.length ==0 || a[0].equals("null"))
            return null;

        Node root = new Node(Integer.parseInt(a[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while(!q.isEmpty() && i < a.length){

            Node cur = q.poll();

            if(i < a.length && !a[i].equals("null")){
                cur.left = new Node(Integer.parseInt(a[i]));
                q.add(cur.left);
            }
            i++;

            if(i < a.length && !a[i].equals("null")){
                cur.right = new Node(Integer.parseInt(a[i]));
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }

    static boolean same(Node p, Node q){

        if(p == null && q == null) return true;
        if(p ==  null || q == null) return false;

        return p.val == q.val &&
        same(p.left,q.left) &&
        same(p.right,q.right);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");

        Node p = build(a);
        Node q = build(b);

        System.out.println(same(p,q));
    }
}
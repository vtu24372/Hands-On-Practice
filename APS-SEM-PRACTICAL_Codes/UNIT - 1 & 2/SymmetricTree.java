import java.util.*;

class Node{
    int val;
    Node left,right;

    Node(int v){
        val = v;
    }
}

public class SymmetricTree{

    static Node build(String[] a){
        
        if(a.length == 0 || a[0].equals("null"))
            return null;

        Node root = new Node(Integer.parseInt(a[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while(!q.isEmpty() && i<a.length){

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
    static boolean mirror(Node a, Node b){

        if(a == null && b == null) return true;
        if(a == null || b == null) return false;

        return a.val == b.val &&
        mirror(a.left, b.right) &&
        mirror(a.right, b.left);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");

        Node root = build(a);

        System.out.println(mirror(root,root));
    }
}
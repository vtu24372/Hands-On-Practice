import java.util.*;

class MergeAndSort{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int m = s.nextInt();
        for(int i=0; i<m; i++) list.add(s.nextInt());

        int n = s.nextInt();
        for(int i=0; i<n; i++) list.add(s.nextInt());

        Collections.sort(list);

        for(int x : list)
            System.out.print(x +" ");
    }
}
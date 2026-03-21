import java.util.*;
public class UsageOfArrayList {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        

        ArrayList<Integer> a = new ArrayList<>();
        ArrayDeque<Integer> b = new ArrayDeque<>();

        System.out.print("Enter the size : ");
        int n = s.nextInt();

        System.out.println("Add elements using ArrayList : ");
        for(int i=0; i<n; i++)
            a.add(s.nextInt());

        for(int i : a)
            System.out.print(i + " ");
        
        System.out.println();
        System.out.print("Add using ArrayDeque : ");

        b.addFirst(s.nextInt());
        b.add(s.nextInt());
        b.addLast(s.nextInt());
        b.offerLast(s.nextInt());

        for(int i : b){
            System.out.print(i + " ");
        }

    }
}

import java.util.*;

class DisplayPricesUsingVector{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();
        int n = s.nextInt();

        for(int i=0; i<n; i++){
            v.add(s.nextInt());
        }
        v.add(s.nextInt());

        for(int i=0; i<v.size(); i++)
            System.out.print(v.get(i)+" ");
    }
}
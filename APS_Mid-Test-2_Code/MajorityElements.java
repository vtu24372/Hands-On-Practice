import java.util.*;

class MajorityElements{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replace("[","")
        .replace("]","")
        .replace(","," ");

        String[] a = s.trim().split("\\s+");

        int count = 0 , ans = 0;

        for(String x : a){
            int n = Integer.parseInt(x);

        if(count == 0)
            ans = n;
        count += (n == ans) ? 1 : -1; 
    }
    System.out.print(ans);
    }
}
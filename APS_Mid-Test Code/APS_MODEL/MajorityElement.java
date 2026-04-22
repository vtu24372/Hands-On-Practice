import java.util.Scanner;
import java.util.*;

class MajorityElement{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), c = 0, ans = 0;

        for(int i=0; i<n; i++){
            int x = s.nextInt();
            if(c==0) ans = x;
            c += (x == ans) ? 1 : -1;
        }
        System.out.print(ans);
    }
}
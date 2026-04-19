import java.util.Scanner;
import java.util.*;

class MaxProfit{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = s.nextInt();
        int sum = max;

        for(int i=1; i<n; i++){
            int x = s.nextInt();
            sum = Math.max(x, sum+x);
            max = Math.max(max,sum);
        }
        System.out.print(max);
    }
}
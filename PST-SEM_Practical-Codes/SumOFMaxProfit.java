import java.util.Scanner;
import java.util.*;

class SumOFMaxProfit{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<n; i++){
            int x = s.nextInt();

            maxSum = Math.max(x, currentSum + x);
            currentSum = Math.max(maxSum, currentSum);
        }
        System.out.print(maxSum);
    }
}
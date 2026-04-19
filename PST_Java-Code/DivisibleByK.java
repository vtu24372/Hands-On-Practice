import java.util.Scanner;
import java.util.*;

class DivisibleByK{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int k = s.nextInt();
        int max = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum+=a[j];
                if(sum % k ==0) max = Math.max(max,j-i+1);
            }
        }
        System.out.print(max);
    }
}
import java.util.*;
import java.util.Scanner;

class SlidingWindowCheck{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String txt = s.next();
        String pat = s.next();

        int n = txt.length();
        int m = pat.length();

        for(int i=0; i<n-m; i++){
            if(txt.substring(i,i+m).equals(pat)){
                System.out.print(i);
            }
        }
    }
}
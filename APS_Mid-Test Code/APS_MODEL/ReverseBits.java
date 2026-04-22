import java.util.Scanner;
import java.util.*;

class ReverseBits{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int ans = 0;

        for(int i=0; i<32; i++){
            ans = ans << 1;
            ans |= (n & 1);
            n = n >> 1;
        }
        System.out.print(ans);
    }
}
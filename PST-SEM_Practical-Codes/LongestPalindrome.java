import java.util.*;
import java.util.Scanner;

class LongestPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            
            ans = max(ans, expand(s, i, i));
            ans = max(ans, expand(s,i,i+1));
        }
        System.out.print(ans);
    }

    static String expand(String s, int l, int r){
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }

    static String max(String a, String b){
        return a.length() >= b.length() ? a:b;
    }
}

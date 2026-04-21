import java.util.*;
import java.util.Scanner;

class FirstUnique{
    public int unique(String s){

        int[] f = new int[26];
        for(char c : s.toCharArray()) f[c-'a']++;
        
        for(int i=0; i<s.length(); i++)

            if(f[s.charAt(i)-'a']==1) return i;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new FirstUnique().unique(s));

    }
}
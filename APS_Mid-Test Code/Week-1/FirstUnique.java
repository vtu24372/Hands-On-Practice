import java.util.*;
import java.util.Scanner;

class FirstUnique{
    public int UniqueChar(String s){
        int[] freq = new int[26];

        for(char c : s.toCharArray()) freq[c - 'a']++;

        for(int i=0; i<s.length(); i++)

            if(freq[s.charAt(i)-'a']==1) return i;
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sequence : ");
        String s = sc.next();

        System.out.print(new FirstUnique().UniqueChar(s));
    }
}
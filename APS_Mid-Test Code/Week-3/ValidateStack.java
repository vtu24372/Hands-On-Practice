import java.util.*;
import java.util.Scanner;

class ValidateStack{
    public boolean validate(int[] pushed, int[] poped){
        Stack<Integer> st = new Stack<>();
        int j=0;
        for(int val : pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek()==poped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] pushed = new int[n];
        int[] poped = new int[n];

        for(int i=0; i<n; i++)
            pushed[i] = s.nextInt();

        for(int i=0; i<n; i++)
            poped[i] = s.nextInt();


        System.out.print(new ValidateStack().validate(pushed,poped));
    }
}
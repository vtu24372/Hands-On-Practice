import java.util.Scanner;
import java.util.*;

class StackSequence{
    public boolean Validate(int[] pushed, int[] poped){
        Stack<Integer> st = new Stack<>();
        int j = 0;

        for(int val : pushed){
            st.push(val);

            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
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

        System.out.print(new StackSequence().Validate(pushed,poped));
    }
}
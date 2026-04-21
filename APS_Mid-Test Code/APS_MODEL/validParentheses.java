import java.util.*;

class validParentheses {
    public boolean Valid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                st.push(c);
            else if (st.isEmpty() ||
                    (c == ')' && st.pop() != '(') ||
                    (c == ']' && st.pop() != '[') ||
                    (c == '}' && st.pop() != '{'))
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(new validParentheses().Valid(sc.nextLine()));
    }
}
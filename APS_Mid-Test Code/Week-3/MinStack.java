import java.util.*;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public void push(int val) {
        st.push(val);
        minSt.push(minSt.isEmpty() ? val : Math.min(val, minSt.peek()));
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() { return st.peek(); }

    public int getMin() { return minSt.peek(); }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("push")) ms.push(sc.nextInt());
            else if (op.equals("pop")) ms.pop();
            else if (op.equals("top")) System.out.println(ms.top());
            else if (op.equals("getMin")) System.out.println(ms.getMin());
        }
    }
}
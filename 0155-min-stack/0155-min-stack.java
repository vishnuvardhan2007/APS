
import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        stack.push(val);

        if (min.isEmpty()) {
            min.push(val);
        } else {
            min.push(Math.min(val, min.peek()));
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

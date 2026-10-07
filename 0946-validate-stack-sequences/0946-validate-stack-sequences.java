import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0; // Pointer for popped array

        for (int val : pushed) {
            stack.push(val); // Push current element onto the stack
            
            // Pop elements as long as they match popped[i]
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }

        // If all elements were successfully popped, stack will be empty
        return stack.isEmpty();
    }
}
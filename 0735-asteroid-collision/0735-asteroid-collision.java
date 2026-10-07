import java.util.Stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean exploded = false;
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                
                if (Math.abs(top) < Math.abs(asteroid)) {
                    stack.pop();
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    
                    exploded = true;
                    break;
                }
            }
            if (!exploded) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
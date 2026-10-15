import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> flipped = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if (root != null) {
            stack.push(root);
        }
        
        int index = 0;
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            
            if (node == null) {
                continue;
            }
            if (node.val != voyage[index]) {
                return Arrays.asList(-1);
            }
            
            index++;
            if (node.left != null && node.left.val != voyage[index]) {
                flipped.add(node.val);
                stack.push(node.left);
                stack.push(node.right);
            } else {
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        
        return flipped;
    }
}
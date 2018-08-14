import support.TreeNode;

public class Solution {
        public int minDepth(TreeNode root) {
            if(root== null) return 0;
            int left = minDepth(root.leftNode);
            int right = minDepth(root.rightNode);
            if(left == 0 || right == 0){
                return left + right +1;
            }else{
                return Math.min(left, right) + 1;
            }
        }
        public static void main(String[] args){
            TreeNode root = new TreeNode(3);
            root.leftNode = new TreeNode(9);
            TreeNode rightNode = new TreeNode(20);
            rightNode.leftNode = new TreeNode(15);
            rightNode.rightNode = new TreeNode(7);
            root.rightNode = rightNode;
            Solution solution = new Solution();
            solution.minDepth(root);
        }
}


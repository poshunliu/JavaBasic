import agolorithm.Node;
import support.TreeNode;

import java.util.*;

public class Solution {
//    public int minDepth(TreeNode root) {
//        if(root== null) return 0;
//        int left = minDepth(root.leftNode);
//        int right = minDepth(root.rightNode);
//        if(left == 0 || right == 0){
//            return left + right +1;
//        }else{
//            return Math.min(left, right) + 1;
//        }
//    }
  //--------------------------------------------------------------------------
//    public List BFS(TreeNode root, TreeNode leftNode, TreeNode rightNode){
//        List<Integer> list = new ArrayList<>();
//        if(root == null){
//            list.add(null);
//            return list;
//        }else if(root.leftNode != null){
//            list.add(leftNode);
//        }else if(rightNode.rightNode != null){
//            list.add(rightNode);
//        }
//    }
//
    //--------------------------------------------------------------------------
    public List<List<Integer>> BFS(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.value);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        Collections.reverse(result);
        return result;
     }


    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        Solution solution = new Solution();
        System.out.println(solution.BFS(root));

    }
}


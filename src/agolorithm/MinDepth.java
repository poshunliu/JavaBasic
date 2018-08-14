package agolorithm;

import support.TreeNode;

public class MinDepth {
    private int minDepth(TreeNode root) {
        if(root== null) return 0;
        int left = minDepth(root.leftNode);
        int right = minDepth(root.rightNode);
        if(left == 0 || right == 0){
            return left + right +1;
        }else{
            return Math.min(left, right) + 1;
        }
    }
    private void isPlatdrome(String s){

    }

}

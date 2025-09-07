/*
 * 1周目
 * 【Minimal Tree】
 * Given a sorted (increasing order) array with unique integer elements, write an algorithm to create 
 * a binary search tree with minimal height.
 * 
 */

public class MinimalTree1{

    public void createMinimalBST(int[]array){
        createMinimalBST(array, 0, array.length);
    }

    public TreeNode createMinimalBST(int[] array, int start, int end){
        if(start<end){
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode n = new TreeNode(mid);
        n.left = createMinimalBST(array, start, mid-1);
        n.right = createMinimalBST(array, mid+1, end);

        return n;
    }

    public static void main(String[] args){

        int[] input = {1,2,3,4,5,6,7,8,9,10};

        MinimalTree1 minimalTree1 = new MinimalTree1();
        minimalTree1.createMinimalBST(input);
    }
}



class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

package DataStructure.BinarySearchTree;

//Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
//
//        Note:
//
//        Given target value is a floating point.
//        You are guaranteed to have only one unique value in the BST that is closest to the target.
//        Example:
//
//        Input: root = [4,2,5,1,3], target = 3.714286
//
//        4
//        / \
//        2   5
//        / \
//        1   3
//
//        Output: 4

public class ClosestValue {

    static int closetValue;
    static double closetDiff;

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        TreeNode root = binarySearchTree.sampleTree();
        double target = 0.0;
        int v = closestValue(root, target);
        System.out.println("v = " + v);
    }

    public static int closestValue(TreeNode root, double target) {
        closetValue = root.val;
        closetDiff = Math.abs(root.val - target) ;
        dfs(root, target);
        return closetValue;
    }

    static void dfs(TreeNode node, double target){

        if(node!=null) {
            double diff = Math.abs(target - node.val);
            if (diff < closetDiff) {
                closetDiff = diff;
                closetValue = node.val;
            }

            dfs(node.left, target);
            dfs(node.right, target);
        }
    }
}

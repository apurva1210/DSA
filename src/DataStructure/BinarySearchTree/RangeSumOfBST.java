package DataStructure.BinarySearchTree;

//Given the root node of a binary search tree, return the sum of values of all nodes with a value in the range [low, high].
//
//
//
//        Example 1:
//
//
//        Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//        Output: 32
//        Example 2:
//
//
//        Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//        Output: 23
//
//
//        Constraints:
//
//        The number of nodes in the tree is in the range [1, 2 * 104].
//        1 <= Node.val <= 105
//        1 <= low <= high <= 105
//        All Node.val are unique.


public class RangeSumOfBST {

    static int  sum = 0;

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        TreeNode root = binarySearchTree.sampleTree();
        int sum = rangeSumBST(root, 7, 15);
        System.out.println("sumh = " + sum);
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return  0;
        dfs( root, low, high);
        return sum;
    }

    public static void dfs(TreeNode root, int low, int high){
        if(root != null) {
            if (root.val >= low && root.val <= high) {
                sum += root.val;
            }
            if (root.val < high) {
                dfs(root.right, low, high);
            }

            if(root.val > low){
                dfs(root.left, low, high);
            }
        }
    }


}

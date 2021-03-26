package DataStructure.BinarySearchTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){};

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void insert( int val){
       if (val >= this.val) {
           if (this.right == null)
               this.right = new TreeNode(val);
           else
               this.right.insert(val);
       }
       else{
           if (this.left == null)
               this.left = new TreeNode(val);
           else
               this.left.insert(val);
           }

    }
}

package DataStructure.BinarySearchTree;

public class BinarySearchTree {

    TreeNode root;

    void addElement(int val){
        if(root == null) this.root = new TreeNode(val);
        else root.insert(val);
    }


    void printTree(){
        if(root == null) System.out.println("empty");
        else {
            dfs(root);
        }
    }

    void dfs(TreeNode node){
        if(node!=null){
            dfs(node.left);
            System.out.println(node.val);
            dfs(node.right);
        }
    }


    TreeNode sampleTree(){

        this.addElement(2147483647);
//        this.addElement(2);
//        this.addElement(5);
//        this.addElement(1);
//        this.addElement(3);
        this.printTree();

        return this.root;

    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.sampleTree();
    }


}

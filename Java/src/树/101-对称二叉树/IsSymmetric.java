
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class IsSymmetric {

    public static void main(String[] args) {
        System.out.println("solution");
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        if(isDuichen(root.left, root.right))
            return true;
        else
            return false;
    }
    public static boolean isDuichen(TreeNode left, TreeNode right){
        if(left == null && right == null )
            return true;
        else if(left == null || right == null)
            return false;
        else if(left.val != right.val)
            return false;
        else
            return isDuichen(left.left, right.right) && isDuichen(left.right, right.left);
    }
}

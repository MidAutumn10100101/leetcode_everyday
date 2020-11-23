import static java.lang.Integer.max;

public class MaxDepth {

    public static void main(String[] args) {
        System.out.println("solution");
    }
    //最大深度为左子树深度及右子树深度最大值加一
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
            return max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

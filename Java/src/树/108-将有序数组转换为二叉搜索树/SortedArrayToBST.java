public class SortedArrayToBST {

    public static void main(String[] args) {
        System.out.println("solution");
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return creatBST(nums, 0, nums.length-1);
    }
    public TreeNode creatBST(int[] nums, int start, int end){
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = creatBST(nums, start,mid-1);
        root.right = creatBST(nums, mid+1, end);
        return root;
    }
}

public class SearchRange {
    public static void main(String[] args) {
        System.out.println("solution");

    }
    public static int[] searchRange(int[] nums,int target){
        int len = nums.length;
        int[] res = {-1, -1};
        if(len == 0)
            return res;
        int left = 0;
        int right = len - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                int lIndex = mid;
                int rIndex = mid;
                while (lIndex >=0 && nums[lIndex] == target)
                    lIndex--;
                while (rIndex < len && nums[rIndex] == target)
                    rIndex++;
                res[0] = lIndex + 1;
                res[1] = rIndex - 1;
                return res;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return res;
    }

}

public class Search {
    public static void main(String[] args) {
        System.out.println("solution");

    }
    public static int search (int[] nums, int target){
        int len = nums.length;
        if (len == 0 )
            return -1;
        if (len == 1)
            return nums[0] == target ? 0 : -1;
        int left = 0;
        int right = len - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(target == nums[mid])
                return mid;
            if(nums[mid] >= nums[left]){
                //说明左边有序
                if (target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                //说明右边有序
                if(target > nums[mid] && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}

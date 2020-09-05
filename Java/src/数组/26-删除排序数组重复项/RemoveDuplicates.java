public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("solution");

    }
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 1)
            return len;
        int pos = 0;
        for (int i = 1; i < len; ){
            if(nums[pos] == nums[i]){
                i++;
            }else
            {
                pos++;
                nums[pos] = nums[i];
                i++;
            }
        }
        return pos + 1;
    }
}

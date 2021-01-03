public class Solution {
    public static void main(String[] args) {
        System.out.println("solution");
        int[] nums = {0};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        for (int num:
             nums) {
            if(num == i)
                i++;
            else
                return i;
        }
        return i;
    }
}

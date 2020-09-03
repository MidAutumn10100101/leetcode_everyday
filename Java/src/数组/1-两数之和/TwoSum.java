public class TwoSum {
    public static void main(String[] args) {
        System.out.println("solution");

    }
    public static int[] twoSum(int[] nums, int target){
        int[] res = {0, 0};
        for (int i=0; i < nums.length; i++){
            int search_num = target - nums[i];
            int search_index = inArray(nums, search_num);
            if( search_index >=0 && search_index != i){
                if(i < search_index){
                    res[0] = i;
                    res[1] = search_index;
                }
                else{
                    res[0] = search_index;
                    res[1] = i;
                }
            }
        }
        return res;
    }
    //返回target在数组中的下标
    public static int inArray(int[] nums, int target){
        int res = -1;
        for (int i=0; i < nums.length; i++){
            if(target == nums[i])
                return i;
        }
        return res;
    }

}

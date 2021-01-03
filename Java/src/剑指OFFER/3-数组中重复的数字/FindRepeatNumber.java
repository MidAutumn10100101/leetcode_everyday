import java.util.HashSet;

public class FindRepeatNumber {

    public static void main(String[] args) {
        System.out.println("solution");

    }

    //时间：O(n)  空间：O(n)
    public static int findRepeatNumber(int[] nums) {
        HashSet set = new HashSet();
        for (int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return 0;
    }

    //时间：O(n)  空间：O(1)
    public static int findRepeatNumber1(int[] nums){
        int res = -1;
        for(int i=0; i<nums.length;){
            int m = nums[i];
            //数字元素在应该所在的位置
            if(m == i){
                i++;
            }else {
                //交换，将m放置到它应该在的位置
                if(m != nums[m]){
                    nums[i] = nums[m];
                    nums[m] = m;
                }else {  //该数字在下标为i和m的位置都出现了
                    res = m;
                    break;
                }
            }
        }
        return res;
    }
}

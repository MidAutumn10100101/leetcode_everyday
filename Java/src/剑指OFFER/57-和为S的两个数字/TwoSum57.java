import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum57 {
    public static void main(String[] args) {
        System.out.println("solution");
        int[] nums = {10,26,30,31,47,60};
        int[] res = twoSum(nums, 40);
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(target-nums[i], nums[i]);
        }
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                list.add(nums[i]);
                list.add(map.get(nums[i]));
                break;
            }
        }
        int[] res = new int[list.size()];
        for (int i=0; i<list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}

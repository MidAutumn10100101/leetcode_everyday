import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println("solution");

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]))
                map.replace(nums[i],2);
            else
                map.put(nums[i],1);
        }
        for (int key: map.keySet())
            if(map.get(key) == 1)
                return key;
        return 0;
    }
}

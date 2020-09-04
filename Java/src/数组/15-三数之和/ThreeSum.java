
import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println("solution");
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSumSimple(nums);
        System.out.println(list);
    }
    public static ArrayList<ArrayList> threeSum(int[] nums){
        ArrayList<ArrayList> listMain = new ArrayList<>();
        int numsLength = nums.length;
        for (int i=0;i<numsLength;i++){
            for (int j=i+1;j<numsLength;j++){
                for (int k=j+1;k<numsLength;k++){
                    ArrayList<Integer> list = new ArrayList<>();
                    if((nums[i]+nums[j]+nums[k]) == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        listMain.add(list);
                    }
                }
            }
        }
        return listMain;
    }
    public static List<List<Integer>> threeSumSimple(int[] nums){
        List<List<Integer>> listMain = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length - 2; i++){
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1;
            int right = length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    while (left < right && nums[left] == nums[++left]);
                }
                else if(sum > 0){
                    while (left < right && nums[right] == nums[--right]);
                }
                else {
                    listMain.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[++left]);
                    while (left < right && nums[right] == nums[--right]);
                }
            }
        }
        return listMain;
    }
    public static ArrayList<ArrayList> threeSumError(int[] nums){
        ArrayList<ArrayList> listMain = new ArrayList<>();
        Arrays.sort(nums);
        int numsLength = nums.length;
        if(numsLength == 0)
            return listMain;
        int left = 0;
        int right = numsLength - 1;
        int lastSum = nums[left] + nums[right] - 1;
        while (left < right-1){
            int sum = nums[left] + nums[right];
            if(sum == lastSum){
                if((sum + nums[left+1]) == 0)
                    left++;
                else if((sum + nums[right-1]) == 0)
                    right++;
            }
            if(left < right-1){
                ArrayList<Integer> list = new ArrayList<>();
                if((sum + nums[left+1]) == 0){
                    list.add(nums[left]);
                    list.add(nums[left+1]);
                    list.add(nums[right]);
                    listMain.add(list);
                    left++;
                }
                else if ((sum + nums[right-1]) == 0){
                    list.add(nums[left]);
                    list.add(nums[right-1]);
                    list.add(nums[right]);
                    listMain.add(list);
                    right--;
                }
                else if (-sum < nums[left+1])
                    right--;
                else
                    left++;
                lastSum = sum;
            }
        }
        return listMain;
    }
}

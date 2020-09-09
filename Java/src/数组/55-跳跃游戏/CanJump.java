import static java.lang.Math.max;

public class CanJump {
    public static void main(String[] args) {
        System.out.println("solution");

    }
    public static boolean canJump(int[] nums){
        int len = nums.length;
        int maxIndex = 0;
        for (int index=0; index<len; index++){
            if(index > maxIndex)
                return false;
            maxIndex = max(maxIndex, index + nums[index]);
        }
        return true;
    }
}

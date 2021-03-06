import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {

    public static void main(String[] args) {
        System.out.println("solution");

    }

    public static int[][] findContinuousSequence(int target) {
        //滑动窗口左闭右开
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2){
            if(sum < target){
                sum = sum + j;
                j++;
            }else if(sum > target){
                sum = sum - i;
                i++;
            }else {
                int[] arr = new int[j-i];
                for(int k=i; k<j; k++)
                    arr[k-i] = k;
                res.add(arr);
                sum = sum - i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);

    }
}

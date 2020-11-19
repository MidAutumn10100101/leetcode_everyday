import java.util.ArrayList;

//思路：使用快慢指针判断是否进入循环

public class IsHappy {
    public static void main(String[] args) {
        System.out.println("solution");
        boolean res = isHappy(20);
        System.out.println(res);
    }
    public static boolean isHappy(int n) {
        int sum = n;
        int count = 0;
        while (sum != 0 && count<1000){
            ArrayList<Integer> list = new ArrayList<>();
            while (sum > 0){
                int num = sum % 10;
                list.add(num);
                sum = (sum - num) / 10;
            }
            sum = 0;
            for (int num: list){
                sum = sum + num * num;
            }
            if(sum == 1)
                return true;
            count++;
        }
        return false;

    }
}

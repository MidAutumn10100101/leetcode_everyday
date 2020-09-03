import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class MaxArea {
    public static void main(String[] args) {
        System.out.println("solution");
        int[] h = {1,8,6,2,5,4,8,3,7};
        int res = maxAreaSimple(h);
        System.out.println(res);
    }
    public static int maxArea(int[] height){
        int area = 0;
        int temp = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = i + 1; j < height.length; j++){
                if(height[j] >= height[i]){
                    temp = (j - i) * (height[i]);
                    if(temp > area)
                        area = temp;
                }
                else{
                    temp = (j - i) * (height[j]);
                    if(temp > area)
                        area = temp;
                }
            }
        }
        return area;
    }
    public static int maxAreaSimple(int[] height){
        int area = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j){
            int h = min(height[i], height[j]);
            area = max(area, h * (j - i));
            if(height[i] <= height[j])
                i++;
            else
                j--;
        }
        return area;
    }
}

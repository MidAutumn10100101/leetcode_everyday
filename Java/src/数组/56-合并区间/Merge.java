import static java.lang.Math.min;

public class Merge {
    public static void main(String[] args) {
        System.out.println("solution");
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(intervals);

    }
    public static int[][] merge(int[][] intervals){

        int len = intervals.length;
        int[][] res = new int[len][2];
        for (int i = 1, row = 0, flag = 1; i < len;){
            if(flag == 1){
                res[row][0] = intervals[i-1][0];
                flag = 0;
            }
            if(intervals[i-1][1] >= intervals[i][0] && flag == 0){
                    res[row][0] = min(res[row][0], intervals[i][0]);
                i++;
            }else {
                res[row][1] = intervals[i][1];
                i++;
                row++;
                flag = 1;
            }
        }
        return res;
    }
}

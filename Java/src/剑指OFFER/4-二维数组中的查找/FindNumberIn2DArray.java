public class FindNumberIn2DArray {

    public static void main(String[] args) {
        System.out.println("solution");

    }
    //这一题的着手点在于不能按照按照常规思路从左上方开始查；应该发现数字分布规律，从右上开始
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int len1 = matrix.length;
        int len2,i = 0,j = 0;
        if(len1 > 0){
            len2 = matrix[0].length;
            j = len2 - 1;
        }
        while (i<len1 && j>=0){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target){ //第j列的所有数都大于target
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}

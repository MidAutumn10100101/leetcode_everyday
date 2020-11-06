public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("solution");
        boolean res = isPalindrome("aba    ");
        System.out.println(res);

    }
    public static boolean isPalindrome(String s) {
        if(s.length() == 0)
            return true;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        int flag = 1;
        while (left <= right){
            while (!isValid(s.charAt(left))){
                left++;
                if(left > s.length()-1){
                    flag = 0;
                    break;
                }

            }
            while (!isValid(s.charAt(right))){
                right--;
                if(right < 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                if(s.charAt(left) == s.charAt(right)){
                    left++;
                    right--;
                }else
                    return false;
            }else
                break;

        }
        return true;
    }

    public static boolean isValid(char c){
        if(Character.isDigit(c) || Character.isLetter(c))
            return true;
        else
            return false;
    }

}

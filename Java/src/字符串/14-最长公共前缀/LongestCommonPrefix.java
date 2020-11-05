import com.sun.istack.internal.localization.NullLocalizable;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("solution");
        String[] in = {"ab","a"};
        String res = longestCommonPrefix(in);
        System.out.println(res);
    }
    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        int FLAG = 1;
        ArrayList<Character> res = new ArrayList<>();
        if(strs.length == 0 )
            return "";
        if(strs[0].length() == 0){
            return "";
        }else {
            res.add(strs[0].charAt(index));
        }
        while (FLAG == 1){
            for (String str: strs) {
                if(str.length() == 0){
                    return "";
                }
                else if(index >= str.length() || str.charAt(index) != res.get(index)){
                    res.remove(index);
                    FLAG = 0;
                    break;
                }
            }
            if(FLAG == 1){
                index = index + 1;
                if(index < strs[0].length()){
                    res.add(strs[0].charAt(index));
                }else {
                    FLAG = 0;
                }

            }
        }
        System.out.println(res);
        StringBuilder reslut = new StringBuilder();
        for (Character c : res){
            reslut.append(c);
        }
        return String.valueOf(reslut);
    }
}

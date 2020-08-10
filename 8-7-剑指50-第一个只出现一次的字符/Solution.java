import java.util.HashMap;

public class Solution {
    public char firstUniqChar(String s) {
        if(s == null){
            return ' ';
        }
        HashMap<Character,Boolean> hashMap = new HashMap<Character,Boolean>();
        for (int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), false);
            }else {
                hashMap.put(s.charAt(i), true);
            }
        }
        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.charAt(i)))
                return s.charAt(i);
        }
        return ' ';

    }
}

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println("solution");
        int res = firstUniqChar("eeeeeeea");
        System.out.println(res);
    }
    public static int firstUniqChar(String s) {
        if(s.length() == 0)
            return -1;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.replace(c, -1);
            }else{
                map.put(c, i);
            }
        }
        for (int i: map.values()){
            if(i != -1)
                return i;
        }
        return -1;
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class Intersect {
    public static void main(String[] args) {
        System.out.println("solution");
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i]))
                map.replace(nums1[i], map.get(nums1[i]), map.get(nums1[i])+1);
            else
                map.put(nums1[i], 1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                arrayList.add(nums2[i]);
                if(map.get(nums2[i]) == 1)
                    map.remove(nums2[i]);
                else
                    map.replace(nums2[i], map.get(nums2[i]), map.get(nums2[i])-1);
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++)
            res[i] = arrayList.get(i);
        return res;
    }
}

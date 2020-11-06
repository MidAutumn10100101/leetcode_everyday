public class StrStr {
    public static void main(String[] args) {
        System.out.println("solution");
        int res = strStr("mississippi", "issipi" );
        System.out.println(res);

    }
    public static int strStr(String haystack, String needle) {
        int index = -1;
        int i,j=0;
        if(needle.length() == 0)
            return 0;
        for(i=0; i<haystack.length(); ){
            if(j == needle.length()){
                index = i - needle.length() ;
                break;
            }
            else {
                if (haystack.charAt(i) != needle.charAt(j)) {
                    i = i - j + 1;
                    j = 0;
                } else {
                    j++;
                    i++;
                }
            }
        }
        if(j == needle.length())
            index = i - needle.length() ;
        return index;
    }
}

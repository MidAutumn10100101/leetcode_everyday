public class RomanToInt {

    public static void main(String[] args) {
        System.out.println("solution");
        int res = romanToInt("MCMXCIV");
        System.out.println(res);
    }

    public static int romanToInt(String s){
        int res = 0;
        int i = 0;
        for (i = 0;  i < s.length()-1; i++){
            if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                res = res + 4;
                i = i + 1;
            }else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                res = res + 9;
                i = i + 1;
            }else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                res = res + 40;
                i = i + 1;
            }else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                res = res + 90;
                i = i + 1;
            }else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                res = res + 400;
                i = i + 1;
            }else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                res = res + 900;
                i = i + 1;
            }else {
                switch (s.charAt(i)){
                    case 'I':
                        res = res + 1;
                        break;
                    case 'V':
                        res = res + 5;
                        break;
                    case 'X':
                        res = res + 10;
                        break;
                    case 'L':
                        res = res + 50;
                        break;
                    case 'C':
                        res = res + 100;
                        break;
                    case 'D':
                        res = res + 500;
                        break;
                    case 'M':
                        res = res + 1000;
                        break;
                    default:
                        break;
                }
            }
        }
        if(i == s.length()-1){
            switch (s.charAt(i)) {
                case 'I':
                    res = res + 1;
                    break;
                case 'V':
                    res = res + 5;
                    break;
                case 'X':
                    res = res + 10;
                    break;
                case 'L':
                    res = res + 50;
                    break;
                case 'C':
                    res = res + 100;
                    break;
                case 'D':
                    res = res + 500;
                    break;
                case 'M':
                    res = res + 1000;
                    break;
                default:
                    break;
            }
        }
        return  res;
    }
}

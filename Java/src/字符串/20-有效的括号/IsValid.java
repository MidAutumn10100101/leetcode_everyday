import java.util.LinkedList;

public class IsValid {
    public static void main(String[] args) {
        System.out.println("solution");
        boolean res = isValid("");
        System.out.println(res);

    }
    public static boolean isValid(String s){
        LinkedList<Character> stack = new LinkedList<>();
        if(s.length() == 0)
            return true;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.add(s.charAt(i));
            else if(s.charAt(i) == ')'){
                if(stack.size() == 0)
                    return false;
                else if(stack.getLast() != '(')
                    return false;
                else
                    stack.removeLast();
            }
            else if(s.charAt(i) == ']'){
                if(stack.size() == 0)
                    return false;
                else if(stack.getLast() != '[')
                    return false;
                else
                    stack.removeLast();
            }
            else if(s.charAt(i) == '}'){
                if(stack.size() == 0)
                    return false;
                else if(stack.getLast() != '{')
                    return false;
                else
                    stack.removeLast();
            }
        }
        if (stack.size() > 0)
            return false;
        return true;
    }
}

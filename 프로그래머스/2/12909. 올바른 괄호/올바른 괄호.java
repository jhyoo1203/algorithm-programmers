import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        char[] str = s.toCharArray();
        
        for (char c : str) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
        }
        
        return stack.isEmpty();
    }
}

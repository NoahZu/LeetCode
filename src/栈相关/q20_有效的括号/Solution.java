package 栈相关.q20_有效的括号;

import java.util.Stack;

/**
 * 利用栈 o(n)
 */
class Solution {
    public boolean isValid(String s) {
        Deque<Character> ss = new LinkedList<Character>();
        for(char a : s.toCharArray()) {
            if(a == '(' || a == '[' || a == '{') {
                ss.push(a);
            } else {
                Character b = ss.peekFirst();
                if(b == null) {
                    return false;
                }
                if((b == '(' && a == ')') || (b == '[' && a == ']') || (b == '{' && a == '}')) {
                    ss.pop();
                } else {
                    return false;
                }
            }
        }
        return ss.isEmpty();
    }
}

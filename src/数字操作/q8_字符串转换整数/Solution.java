package 数字操作.q8_字符串转换整数;

/**
 * o(n) 重点还是判断溢出
 */
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) {
            return 0;
        }

        char firstChar = s.charAt(0);
        if(firstChar != '-' && firstChar != '+' && (firstChar < '0' || firstChar > '9')) {
            return 0;
        }
        char[] charArray;
        if(firstChar == '-' || firstChar == '+') {
            charArray = s.substring(1,s.length()).toCharArray();
        } else {
            charArray = s.toCharArray();
        }
        int result = 0;
        for(char a : charArray) {
            if(a >= '0' && a <= '9') {
                if(result > Integer.MAX_VALUE / 10 || result * 10 > Integer.MAX_VALUE - (a - '0')) {
                    if(firstChar == '-') {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
                result = result * 10 + a - '0';
            } else {
                break;
            }
        }

        return firstChar == '-' ? -result : result;
    }
}

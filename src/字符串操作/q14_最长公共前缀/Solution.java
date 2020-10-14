package 字符串操作.q14_最长公共前缀;

/**
 * 水平扫描 o(n)
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        String result = strs[0];
        for(int i = 0;i<strs.length;i++) {
            result = commonHead(result,strs[i]);
            if(result.isEmpty()) {
                break;
            }
        }
        return result;
    }

    String commonHead(String a,String b) {
        if(a.equals(b)) {
            return a;
        }
        if(a.isEmpty() || b.isEmpty()) {
            return "";
        }

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<Math.min(aChars.length,bChars.length);i++) {
            if(aChars[i] == bChars[i]) {
                sb.append(aChars[i]);
            } else {
                break;
            }
        } 

        return sb.toString();
        
    }
}

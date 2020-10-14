package 字符串操作.q763_划分字母区间;

import java.util.ArrayList;
import java.util.List;

/**
 * 先存储每个字母最后出现的位置，最后遍历一次 o(n)
 */
class Solution {

    public static List<Integer> partitionLabels(String S) {
        int[] charLastIndex = new int[26];

        for(int i = 0;i<S.length();i++) {
            charLastIndex[S.charAt(i) - 'a'] = i;
        }
        int anchor = 0,j = 0;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0;i<S.length();i++) {
            j = Math.max(j,charLastIndex[S.charAt(i) - 'a']);

            if(i == j) {
                ans.add(j-anchor+1);
                anchor = i + 1;
            }
        }
        return ans;
    }

}

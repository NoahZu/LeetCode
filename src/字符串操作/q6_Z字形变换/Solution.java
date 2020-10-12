package 字符串操作.q6_Z字形变换;

import java.util.ArrayList;
import java.util.List;

/**
 * o(n) 可用一boolean变量代替求余操作
 */
class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0;i<numRows;i++) {
            sbs[i] = new StringBuilder();
        }

        boolean directionDown = true;
        int nums = 0;
        for(int i = 0;i<s.length();i++) {
            sbs[nums].append(s.charAt(i));

            if(nums == numRows - 1) {
                directionDown = false;
            } else if (nums == 0){
                directionDown = true;
            }
            if(directionDown) {
                nums++;
            } else {
                nums--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) {
            result.append(sb);
        }
        return result.toString();

    }
}

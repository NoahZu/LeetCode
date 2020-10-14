package 数字操作.q7_整数反转.f1;

/**
 * 转成String o(n) 捕获异常判断是否溢出
 */
class Solution {
     public static int reverse(int x) {
        List<Integer> nums = new ArrayList<Integer>();
        int symbol = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while(x >0) {
            nums.add(x % 10);
            x = x / 10;
        }
        int result = 0;
        for(int i = 0;i < nums.size();i++) {
            //判断溢出
            if(i == 9 && (result > Integer.MAX_VALUE / 10) || (result * 10 > Integer.MAX_VALUE - nums.get(i))) {
                return 0;
            }
            result = (result * 10) + nums.get(i);
            if(result < 0) {
                return 0;
            }
        }
        return result * symbol;
    }
}

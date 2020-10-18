package 数字操作.q9_回文数;

/**
 * 不转换成String 反转一半的数字o(log(n))
 */
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 10 && x >= 0) {
            return true;
        }

        if(x < 0) {
            return false;
        }

        List<Integer> list = new ArrayList<Integer>();
        while(x > 0) {
            list.add(x % 10);
            x /= 10;
        }

        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            if(list.get(left) != list.get(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}

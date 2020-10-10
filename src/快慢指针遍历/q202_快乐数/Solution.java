package 快慢指针遍历.q202_快乐数;

/**
 * 快慢指针，思想同q141判断是否有环，用快慢指针找出循环终止条件 o(n)
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> container = new HashSet<Integer>();
        int current = n;
        while(true) {
            current = getNext(current);
            if(current == 1) {
                return true;
            }
            if(container.contains(current)) {
                return false;
            }
            container.add(current);
        }
    }

    int getNext(int n) {
        int result = 0;
        while(n > 0) {
            result = result + (n % 10) * (n % 10);
            n/=10;
        }
        return result;
    }
}

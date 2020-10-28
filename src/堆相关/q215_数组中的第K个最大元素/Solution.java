package 堆相关.q215_数组中的第K个最大元素;

import java.util.PriorityQueue;

/**
 * 利用大根堆实现 o(n*log(k))
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
         int findCount = nums.length - k;
         PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
         for(int i = 0;i<nums.length;i++) {
            queue.add(nums[i]);
         }

         for(int i = 0;i<findCount;i++) {
             queue.poll();
         }
         return queue.poll();
    }
}

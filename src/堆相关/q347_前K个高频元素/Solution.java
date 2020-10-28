package 堆相关.q347_前K个高频元素;

import java.util.*;

/**
 * 利用大根堆（PriorityQueue）实现 o(n*log(k))
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((ints, t1) -> t1[1] - ints[1]);
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 0);
            }
        }

        for (int key : map.keySet()) {
            queue.add(new int[] {key,map.get(key)});
        }
        int[] result = new int[k];
        for(int i = 0;i<k;i++) {
            result[i] = Objects.requireNonNull(queue.poll())[0];
        }
        return result;
    }
}

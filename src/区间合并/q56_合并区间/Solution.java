package 区间合并.q56_合并区间;


import java.util.*;

/**
 * 先根据start进行排序之后merge o(n*log(n))
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }

        //排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        List<int[]> result = new ArrayList<int[]>();
        int[] merged = intervals[0];

        for(int i = 1;i<intervals.length ;i++) {
            int[] cu = intervals[i];

            //可以合并
            if(cu[0] >= merged[0] && cu[0] <= merged[1]) {
                merged[1] = Math.max(cu[1],merged[1]);
            } else {
                result.add(merged);
                merged = intervals[i];
            }

        }
        result.add(merged);
        return result.toArray(new int[result.size()][]);
    }
}

package 双指针遍历.q11_盛最多水的容器;

/**
 * 双指针遍历 o(n)
 */
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
            int curArea = (right - left) * Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, curArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
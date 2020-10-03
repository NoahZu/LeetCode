package 双指针遍历.q121_买卖股票的最佳时机;

/**
 * 维护一个最低股价变量，同时维护当前收益o(n)
 */
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
                continue;
            }
            if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}

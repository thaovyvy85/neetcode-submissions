class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        int leftIndex = 0;
        for (int i=1; i<prices.length; i++) {
            int rightIndex = i;
            if (prices[rightIndex] - prices[leftIndex] <= 0) {
                leftIndex = rightIndex;
            } else {
                profit = prices[rightIndex] - prices[leftIndex];
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++) {
            for (int j=i+1; j<prices.length; j++) {
                if (prices[i] < prices[j]) {
                    profit = prices[j] - prices[i];
                } else {
                    profit =0;
                }
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}

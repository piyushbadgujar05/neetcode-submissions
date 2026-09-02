class Solution {
    public int maxProfit(int[] prices) {
        int buytime=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            buytime=Math.min(buytime,prices[i]);
            profit=Math.max(profit,prices[i]-buytime);
        }
        return profit;
    }
}

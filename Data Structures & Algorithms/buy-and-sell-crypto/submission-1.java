class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=0;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[l]>=prices[r]){
                l=r;
            }else{
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
            r++;
        }
        return maxProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int currentProfit=0;
        int currentPrice=prices[0];
        for(int num:prices){
            currentProfit=num-currentPrice;
            maxProfit=Math.max(currentProfit,maxProfit);
            if(currentProfit<0){
                currentPrice=num;
            }
        }
        return maxProfit;
    }
}

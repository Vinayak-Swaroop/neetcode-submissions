class Solution {
    public int maxProfit(int[] prices) {
        int currProfit=0;
        int price = prices[0];
        int maxProfit =0;
        for(int i=0;i<prices.length;i++){
            currProfit = prices[i]-price;
            if(currProfit<0){
                price = prices[i];
                currProfit=0;
                continue;
            }
            maxProfit = Math.max(currProfit,maxProfit);
        }
        return maxProfit;
    }
}

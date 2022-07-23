class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        
        if(prices.length<=1){
            return 0;
        }
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minTillNow){
                minTillNow = prices[i];
            }
            maxProfit = (prices[i]-minTillNow) > maxProfit ? (prices[i]-minTillNow):maxProfit;
        }
        return maxProfit;
    }
}
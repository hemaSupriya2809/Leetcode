class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int m=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<m){
                m=prices[i];
            }
            if(prices[i]-m>p){
                p=prices[i]-m;
            }
        }
        return p;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0; i< prices.length - 1; i++) {

            minPrice = (int) Math.min(prices[i], minPrice);
            maxProfit = (int) Math.max(maxProfit, prices[i+1]-minPrice);
        }

        return maxProfit;
    }
}

// min = 10;
// i=1, i<6, min = 1, max = 4
// i=2, i<6, min = 1, max = 5
// i=3, i<6, min = 1, max = 6
// i=4, i<6, min = 1, max = 6
// i=5, i<5, min = 1, max = 

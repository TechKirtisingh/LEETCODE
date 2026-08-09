class Solution {
    public int maxProfit(int[] prices) {

// Buy = 1
// Sell = 6
// To:
// Profit = 6 - 1 = 5

//        [7, 1, 5, 3, 6, 4]

        int minPrice = prices[0]; //store min price | 7
        int maxProfit = 0; // store max profit | 0

        for (int i = 1; i < prices.length; i++) { // 1 | 2 | 3

            if (prices[i] < minPrice) { // 1<7 | 5<1(F) | 3<1
                minPrice = prices[i]; // minP =1
            } else {
                int profit = prices[i] - minPrice; // 5-1=4 | 
                maxProfit = Math.max(maxProfit, profit); //(0,4)
            }
        }

        return maxProfit;
    }
}
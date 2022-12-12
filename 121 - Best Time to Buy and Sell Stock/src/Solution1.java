// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Constraints:

// 1 <= prices.length <= 10^5
// 0 <= prices[i] <= 10^4

class Solution1 {
    public int maxProfit(int[] prices) {
        int indexOfSellPrice = 0;
        int maxProfit = 0;

        for (int indexOfBuyPrice = 0; indexOfBuyPrice < (prices.length
                - 1); indexOfBuyPrice++) {

            if (indexOfBuyPrice != 0 && (prices[indexOfBuyPrice] >= prices[indexOfBuyPrice - 1])) {
                continue;
            }

            if (indexOfBuyPrice >= indexOfSellPrice) {
                indexOfSellPrice = indexOfBuyPrice;
                
                for (int possibleIndexOfSellPrice = indexOfSellPrice + 1; possibleIndexOfSellPrice < prices.length; possibleIndexOfSellPrice++) {
                    if (prices[possibleIndexOfSellPrice] >= prices[indexOfSellPrice]) {
                        indexOfSellPrice = possibleIndexOfSellPrice;
                    }
                }
            }

            maxProfit = Math.max(maxProfit, prices[indexOfSellPrice] - prices[indexOfBuyPrice]);

        }

        return maxProfit;
    }
}
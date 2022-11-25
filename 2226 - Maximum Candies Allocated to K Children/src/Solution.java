// You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

// You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can take at most one pile of candies and some piles of candies may go unused.

// Return the maximum number of candies each child can get.

// Constraints:
// 1 <= candies.length <= 10^5
// 1 <= candies[i] <= 10^7
// 1 <= k <= 10^12

class Solution {
    int[] originalCandyPiles;
    long numberOfChildren;

    public int maximumCandies(int[] candies, long k) {
        originalCandyPiles = candies;
        numberOfChildren = k;

        int lowNumber = 1;
        int highNumber = 10_000_000; // Maximum number of candies per pile (10^7).
        while (lowNumber <= highNumber) {
            int middleNumber = lowNumber + ((highNumber - lowNumber) / 2);

            if (canMakeEnoughSubPiles(middleNumber)) {
                lowNumber = middleNumber + 1;
            } else {
                highNumber = middleNumber - 1;
            }
        }

        return highNumber;
    }

    public boolean canMakeEnoughSubPiles(int numberOfCandiesPerSubPile) {
        long numberOfSubPilesThatCanBeMade = 0;
        for (int numberOfCandies : originalCandyPiles) {
            numberOfSubPilesThatCanBeMade += numberOfCandies / numberOfCandiesPerSubPile;
        }
        return (numberOfSubPilesThatCanBeMade >= numberOfChildren);
    }
}
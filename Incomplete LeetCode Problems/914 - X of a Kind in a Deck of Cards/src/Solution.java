// You are given an integer array deck where deck[i] represents the number written on the ith card.

// Partition the cards into one or more groups such that:

// Each group has exactly x cards where x > 1, and
// All the cards in one group have the same integer written on them.
// Return true if such partition is possible, or false otherwise.

// Constraints:
// 1 <= deck.length <= 10^4
// 0 <= deck[i] < 10^4

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // Need to find the greatest common denominator (GCD) of the number of occurences of each number in the deck. If the GCD is greater than 1, return true. Otherwise, return false.
        return true;
    }
}
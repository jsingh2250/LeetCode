// You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

// Return a list answer of size 2 where:

// answer[0] is a list of all players that have not lost any matches.
// answer[1] is a list of all players that have lost exactly one match.
// The values in the two lists should be returned in increasing order.

// Note:
// You should only consider the players that have played at least one match.
// The testcases will be generated such that no two matches will have the same outcome.

// Constraints:
// 1 <= matches.length <= 10^5
// matches[i].length == 2
// 1 <= winneri, loseri <= 10^5
// winneri != loseri
// All matches[i] are unique.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
    // Declare an array that can be used to track whether each player has played in a match. The player number will be the index of this array.
    boolean[] hasPlayedByPlayerNumber = new boolean[100_001];

    // Declare an array that can be used to track the number of losses of each player number. The player number will be the index of this array.
    int[] numberOfLossesByPlayerNumber = new int[100_001];

    // Update the number of losses for each player number based on the matches.
    for (int[] match : matches) {
    hasPlayedByPlayerNumber[match[0]] = true;
    hasPlayedByPlayerNumber[match[1]] = true;

    numberOfLossesByPlayerNumber[match[1]]++;
    }

    // Create lists that can store players that have 0 losses at index 0 and players that have 1 loss at index 1.
    List<List<Integer>> playersWithIndexValueLosses = new ArrayList<>(2);
    playersWithIndexValueLosses.add(new LinkedList<>());
    playersWithIndexValueLosses.add(new LinkedList<>());

    // Add the player numbers to the appropriate list depending on their number of losses.
    for (int playerNumber = 0; playerNumber <
    numberOfLossesByPlayerNumber.length; playerNumber++) {
    if (hasPlayedByPlayerNumber[playerNumber] &&
    (numberOfLossesByPlayerNumber[playerNumber] <= 1)) {
    playersWithIndexValueLosses.get(numberOfLossesByPlayerNumber[playerNumber]).add(playerNumber);
    }
    }

    // Return the lists.
    return playersWithIndexValueLosses;
    }
}
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
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> playerNumberToNumberOfLosses = new HashMap<>();

        for (int[] match : matches) {
            // Add winner of match to hash map.
            playerNumberToNumberOfLosses.putIfAbsent(match[0], 0);

            // Add loser of match to hash map or update the number of that player's
            // losses.
            playerNumberToNumberOfLosses.put(match[1],
                    playerNumberToNumberOfLosses.getOrDefault(match[1], 0) + 1);
        }

        // Create lists that can store players that have 0 losses at index 0 and
        // players that have 1 loss at index 1.
        List<List<Integer>> playersWithIndexValueLosses = new ArrayList<>(2);
        playersWithIndexValueLosses.add(new LinkedList<>());
        playersWithIndexValueLosses.add(new LinkedList<>());

        // Add the player numbers to the appropriate list depending on their number
        // of losses.
        playerNumberToNumberOfLosses.forEach((playerNumber, numberOfLosses) -> {
            if (numberOfLosses <= 1) {
                playersWithIndexValueLosses.get(numberOfLosses).add(playerNumber);
            }
        });
        Collections.sort(playersWithIndexValueLosses.get(0));
        Collections.sort(playersWithIndexValueLosses.get(1));

        // Return the lists.
        return playersWithIndexValueLosses;
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    final int WORD1_NUMBER = 3;
    final String WORD1_STRING = "Fizz";
    final int WORD2_NUMBER = 5;
    final String WORD2_STRING = "Buzz";

    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % WORD1_NUMBER == 0 && i % WORD2_NUMBER == 0) {
                result.add(WORD1_STRING + WORD2_STRING);
            }

            else if (i % WORD1_NUMBER == 0) {
                result.add(WORD1_STRING);
            }

            else if (i % WORD2_NUMBER == 0) {
                result.add(WORD2_STRING);
            }
            else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}
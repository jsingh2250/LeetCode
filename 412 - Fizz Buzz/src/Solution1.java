import java.util.ArrayList;
import java.util.List;

class Solution1 {
    final int WORD1_NUMBER = 3;
    final String WORD1_STRING = "Fizz";
    final int WORD2_NUMBER = 5;
    final String WORD2_STRING = "Buzz";

    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            StringBuilder elementToAdd = new StringBuilder();

            if (i % WORD1_NUMBER == 0) {
                elementToAdd.append(WORD1_STRING);
            }
            if (i % WORD2_NUMBER == 0) {
                elementToAdd.append(WORD2_STRING);
            }
            if (elementToAdd.isEmpty()) {
                elementToAdd.append(i);
            }

            result.add(elementToAdd.toString());
        }

        return result;
    }
}
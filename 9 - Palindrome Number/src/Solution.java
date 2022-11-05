import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers can't be palindromes because of the negative sign.
        if (x < 0) {
            return false;
        }

        // Store the digits of the number.
        ArrayList<Integer> digits = new ArrayList<>();
        do {
            digits.add(x % 10);
            x /= 10;
        } while (x > 0);

        // Compare the digits of the number from the outer digits to the inner digits.
        for (int i = 0; i < (digits.size() / 2); i++) {
            if (digits.get(i) != digits.get(digits.size() - i - 1)) {
                return false;
            }
        }

        // The number is a palindrome.
        return true;
    }
}
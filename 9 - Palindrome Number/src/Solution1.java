class Solution1 {
    public boolean isPalindrome(int x) {
        // Negative numbers can't be palindromes because of the negative sign.
        // Numbers with zero as the least significant digit that aren't equal to zero are not palindromes because we do not consider leading zeros. Reject these cases now to prevent an issue with the return statement.
        if ((x < 0) || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // Extract and store the least significant digits in reverse order. If the number has an even number of digits, extract half of the digits. If the number has an odd number of digits, extract one more than half of the digits.
        int reversedLeastSignificantDigits = 0;
        int mostSignificantDigits = x;
        while (mostSignificantDigits > reversedLeastSignificantDigits) {
            reversedLeastSignificantDigits = (reversedLeastSignificantDigits * 10) + (mostSignificantDigits % 10);
            mostSignificantDigits /= 10;
        }

        // If the number had an even number of digits, check if the most significant digits are equal to the reversed least significant digits.
        // If the number had an odd number of digits, check if the most significant digits are equal to the reversed least significant digits after excluding the middle digit.
        return (mostSignificantDigits == reversedLeastSignificantDigits)
                || (mostSignificantDigits == (reversedLeastSignificantDigits / 10));
    }
}
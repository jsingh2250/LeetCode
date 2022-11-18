class Solution {
    public boolean isAnagram(String s, String t) {
        final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;
        int[] numberOfLetterOccurences = new int[NUMBER_OF_LETTERS_IN_ALPHABET];
        
        for (int stringIndex = 0; stringIndex < s.length(); stringIndex++) {
            numberOfLetterOccurences[s.charAt(stringIndex) - 'a']++;
        }
        
        for (int stringIndex = 0; stringIndex < t.length(); stringIndex++) {
            numberOfLetterOccurences[t.charAt(stringIndex) - 'a']--;
        }
        
        for (int letterOccurences : numberOfLetterOccurences) {
            if (letterOccurences != 0) {
                return false;
            }
        }
        
        return true;
    }
}
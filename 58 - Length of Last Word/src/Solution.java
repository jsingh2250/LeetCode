class Solution {
    public int lengthOfLastWord(String s) {
        int wordEndIndex = s.length() - 1;
        
        while (s.charAt(wordEndIndex) == ' ') {
            wordEndIndex--;
        }
        
        int wordStartIndex = wordEndIndex;
        
        while (wordStartIndex > 0) {
            if (s.charAt(wordStartIndex - 1) != ' ') {
                wordStartIndex--;
            }
            else {
                break;
            }
        }
        
        return (wordEndIndex - wordStartIndex + 1);
    }
}
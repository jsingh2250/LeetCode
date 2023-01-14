class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        char[] sAsCharArray = s.toCharArray();
        char[] tAsCharArray = t.toCharArray();

        while (sIndex < sAsCharArray.length && tIndex < tAsCharArray.length) {
            if (sAsCharArray[sIndex] == tAsCharArray[tIndex]) {
                sIndex++;
            }

            tIndex++;
        }

        return sIndex == s.length();
    }
}
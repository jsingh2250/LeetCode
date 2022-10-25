class Solution {
    public static String concatenateStringArrayElements(String[] stringArray) {
        
        String concatenatedElements = "";
        
        for (String element : stringArray) {
            concatenatedElements += element;
        }
        
        return concatenatedElements;
    }
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String concatenatedWord1 = concatenateStringArrayElements(word1);
        String concatenatedWord2 = concatenateStringArrayElements(word2);
        
        return concatenatedWord1.equals(concatenatedWord2);
    }
}
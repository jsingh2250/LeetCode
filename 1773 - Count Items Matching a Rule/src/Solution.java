import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int ruleKeyIndex;
        switch (ruleKey) {
            case "type":
                ruleKeyIndex = 0;
                break;
            case "color":
                ruleKeyIndex = 1;
                break;
            default:
                ruleKeyIndex = 2;
                break;
        }
        
        int numberOfItemsThatMatchRule = 0;
        for (List<String> item : items) {
            if (item.get(ruleKeyIndex).equals(ruleValue)) {
                numberOfItemsThatMatchRule++;
            }
        }
        
        return numberOfItemsThatMatchRule;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int sizeOfNewArray = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[sizeOfNewArray++] = nums[i];
            }
        }
        
        return sizeOfNewArray;
    }
}
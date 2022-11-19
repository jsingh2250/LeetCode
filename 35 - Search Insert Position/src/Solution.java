class Solution {
    public int calculateMiddleNumberIndex(int lowNumberIndex, int highNumberIndex) {
        return (highNumberIndex - lowNumberIndex) / 2 + lowNumberIndex;
    }
    
    public int searchInsert(int[] nums, int target) {
        int lowNumberIndex = 0;
        int highNumberIndex = nums.length - 1;
        
        int middleNumberIndex = 0;
        while (lowNumberIndex <= highNumberIndex) {
            middleNumberIndex = calculateMiddleNumberIndex(lowNumberIndex, highNumberIndex);
            
            if (target == nums[middleNumberIndex]) {
                break;
            }
            else if (target < nums[middleNumberIndex]) {
                highNumberIndex = middleNumberIndex - 1;
            }
            else {
                lowNumberIndex = middleNumberIndex + 1;
            }
        }
        
        if (target > nums[middleNumberIndex]) {
            middleNumberIndex++;
        }
        
        return middleNumberIndex;
    }
}
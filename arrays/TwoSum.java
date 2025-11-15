// // Two Sum - LeetCode #1
// // Brute Force | Time: O(n^2), Space: O(1)
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// solution ====> 

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
        
    }
}

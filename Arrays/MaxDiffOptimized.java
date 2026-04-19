//Leetcode 2016
// Optimized
class Solution {
    public int maximumDifference(int[] nums) {

        int n=nums.length;
        int minSoFar=nums[0];       //i
        int maxDiff=-1;         

        for(int j=1;j<n;j++)
        {
            if(nums[j]>minSoFar)
            {
                maxDiff=Math.max(maxDiff,nums[j]-minSoFar);
            }
            else
            {
                minSoFar=nums[j];
            }
        }
        return maxDiff;
    }
}
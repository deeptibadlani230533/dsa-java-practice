//brute force
//Leetcode 2016
class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxdiff=-1;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]>nums[i])
                {
                    int diff=nums[j]-nums[i];
                    if(diff>maxdiff)
                    {
                        maxdiff=diff;
                    }
                }
            }
        }
        return maxdiff;
    }
}
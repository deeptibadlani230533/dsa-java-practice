class Solution {
    public int maxProfit(int[] nums) {
        int minPrice=nums[0];
        int maxProfit=0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<minPrice)
            minPrice=nums[i];

            else
            {
                int profit=nums[i]-minPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
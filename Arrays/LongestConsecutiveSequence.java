class Solution {
    public int longestConsecutive(int[] nums) {
       
       Set <Integer> s=new HashSet<>();
    
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }

        int maxCount=0;
        for(int n:s)
        {
            if(!s.contains(n-1)){
            
                int currentNum=n;
                int count=1;
            

            while(s.contains(currentNum+1))
            {
                currentNum++;
                count++;
            }

            maxCount=Math.max(maxCount,count);
        }
        }
        return maxCount;



    }
}
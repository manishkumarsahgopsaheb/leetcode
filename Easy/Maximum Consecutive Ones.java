class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            // reset the count if we found the 0
            if(nums[i]==0)
                count = 0;
            // increment the count and find the max
            else
            {
                count++;
                // now let me find the max
                max = Math.max(max,count);
            }
        }
        return max;
    }
}

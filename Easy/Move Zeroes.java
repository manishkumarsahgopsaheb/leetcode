class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        int index = 0;
        
        if(nums==null || nums.length<=1) return;
        
    
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeroes++;
            }
            else
            {
                nums[index] = nums[i];
                index++;
            }
        }
        
        for(int i=0;i<zeroes;i++)
        {
            nums[nums.length-zeroes+i] = 0;
        }
        
    }
}

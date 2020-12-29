class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        int temp = 0;
        
        if(n<=2)
            return nums[n-1];
        if(n==3)
        {
            boolean flag = true;
            if(nums[0]==nums[1] || nums[1]==nums[2])
            {
                return nums[2];
            }
        }
        
        int i;
        for(i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[temp++] = nums[i];
                // temp++;
            }
        }
        nums[temp++] = nums[i];
        
        if(temp<=2)
            return nums[temp-1];
        
        return nums[temp-3];
    }

}

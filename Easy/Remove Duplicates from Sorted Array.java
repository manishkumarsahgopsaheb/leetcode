class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int temp=0;
        
        if(n<=1)
            return n;
        
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[temp++] = nums[i];
                // temp++;
            }
        }
        // nums[temp] = nums[n-1];
        nums[temp++] = nums[n-1];
        
        // return temp+1;
            return temp;
           
    }
}

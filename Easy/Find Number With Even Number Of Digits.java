class Solution {
    public int findNumbers(int[] nums) {
        int counterfornums = 0;
        for(int i=0;i<nums.length;i++)
        {
            
            int dgcount = digitcount(nums[i]);
            
            if(dgcount%2==0)
            {
                counterfornums++;
            }
        }
        return counterfornums;
        
    }
    public int digitcount(int num)
    {
        int count = 0;
            while(num>0)
            {
                num = num/10;
                count++;
            }
        return count;
    }
        
}

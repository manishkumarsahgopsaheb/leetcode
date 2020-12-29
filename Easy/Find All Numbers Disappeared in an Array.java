class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        
        // traverse the array
        
        for(int i=0;i<n;i++)
        {
            int j = Math.abs(nums[i]) - 1; // substracting 1 for indexing
            nums[j] = Math.abs(nums[j])*(-1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}

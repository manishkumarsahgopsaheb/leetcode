class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int l = 0;
//         int r = nums.length-1;
        int[] arr = new int[2];
        
//         while(l<r)
//         {
            // int sum = nums[l]+nums[r];
//             if(target == sum)
//             {
//                 arr[0] = l;
//                 arr[1] = r;
//                 break;
//             } 
//             else if(sum>target && nums[l]<nums[r])
//             {
//                 l++;
//             }
//             else
//             {
//                 r--;
//             }
//         }
//         return arr;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int sum = nums[i]+nums[j];
                if(sum==target)
                {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int n = A.length;
        int l=0;
        int r = n-1;
        
        while(l<r)
        {
            if((A[l]%2!=0 && A[r]%2==0))
            {
                //swap
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
                l++;
                r--;
            }
            else if(A[l]%2!=0 & A[r]%2!=0)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        
        return A;
    }
}

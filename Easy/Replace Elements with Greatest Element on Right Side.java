class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int prev = arr[n-1];
        arr[n-1] = -1;
        
        
        for(int i=n-2;i>=0;i--)
        {
            int curr = arr[i];
            arr[i] = Math.max(arr[i+1],prev);
            prev = Math.max(prev,curr);
        }
        return arr;
    }
}

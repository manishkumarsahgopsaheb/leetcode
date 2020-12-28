class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean inc = false;
        boolean dec = false;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i - 1] == arr[i]) {
                return false;
            } else if (arr[i - 1] < arr[i]) {
                inc = true;
                if (dec == true) {
                    return false;
                }
            } else {
                dec = true;
                if (inc == false) {
                    return false;
                }                
            }
        }
        return inc && dec;
    }
}

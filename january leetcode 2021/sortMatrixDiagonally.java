class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int diff = i-j;
                PriorityQueue<Integer> queue = map.getOrDefault(diff, new PriorityQueue<>());
                queue.offer(mat[i][j]);
                
                map.put(diff, queue);
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int diff = i-j;
                PriorityQueue<Integer> queue = map.get(diff);
                mat[i][j] = queue.poll();
            }
        }
        return mat;
    }
}

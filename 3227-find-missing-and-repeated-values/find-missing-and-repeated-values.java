class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sum = 0;
        int ans[] = new int[2];
        int n = grid.length;
        int m = grid[0].length;
        double nSquare = Math.pow(n,2);
        int targetSum = (int)(nSquare*(nSquare+1))/2;
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(hs.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                else{
                    hs.add(grid[i][j]);
                    sum += grid[i][j];
                }
            }
        }

        int missNum = targetSum - sum;
        ans[1] = missNum;
        return ans; 

        
    }
}
class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        ArrayList <Integer> list = new ArrayList<>();
        // int i = 0;
        int j = grid[0].length;
        
        for(int row = 0; row < grid.length; row++){
            int col = grid[0].length-1;
            int arr[] = grid[row];
            Arrays.sort(arr);
            while(limits[row] > 0){
                list.add(grid[row][col]);
                limits[row]--;
                col--;
            }
        } 
        Collections.sort(list);
        int idx = list.size()-1;
        long sum = 0;
            while(k > 0){
                sum = sum + (long)list.get(idx);
                idx--;
                k--;
            }
        return sum;    
    }
}
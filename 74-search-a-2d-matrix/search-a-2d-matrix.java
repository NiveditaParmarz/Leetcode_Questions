class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //we will implement a 2d array as a 1d array.
        //2d index banane ke liye from a normal 1 to 9 1d index, convert the 1d index as:
        //rownumber = 1dIdx/no. of columns
        //columnnumber = 1dIdx % no. of columns 

        int i = matrix.length;
        int j = matrix[0].length;
        int lo = 0;
        int hi = (i*j)-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2; //this is the 1d index.
            int row = mid/j;
            int col = mid%j;
            int ele = matrix[row][col];
            if(ele == target)return true;
            else if(ele < target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
            
        }
        return false;        
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        
        int n = matrix.length;
        int m = matrix[0].length;

//---------------------------------------
        //Adding rows and columns in sets
        for(int i =  0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

//-------------------------------------

    for(int num: rowSet){
        for(int j = 0; j < m; j++){
            matrix[num][j] = 0;
        }
    }

    for(int num:colSet){
        for(int i = 0; i < n; i++){
            matrix[i][num] = 0;
        }
    }



    }
}
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int ans[][] = new int[n/3][3];
        Arrays.sort(nums);
        int i = 0;
        int idx = 0;
        for(int a = 2; a < n;){
            int j = 0;
            if(nums[a]-nums[a-2] <= k){
                while(j < 3){
                    ans[i][j] = nums[idx];
                    idx++;
                    j++;
                }
                i++;
            }
            else{
                return new int[0][0];
            }
            a = a+3;
        }
        return ans;
        
    }
}
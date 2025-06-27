class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];

        int nIdx = n;
        int i = 0;
        for(int idx = 0; idx < nums.length; idx++){
            if(idx%2==0){
                ans[idx] = nums[i];
                i++;
            }
            else{
                ans[idx] = nums[nIdx];
                nIdx++;
            }
        }
        return ans;
        
    }
}
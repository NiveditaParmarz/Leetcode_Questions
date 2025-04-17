class Solution {
    public int countPairs(int[] nums, int k) {
        
        int count = 0;
        int n = nums.length;

        for(int i = 0; i <= n-2; i++){
            for(int j = i+1; j <= n-1; j++){
                if(nums[i]==nums[j]){
                    int product = i*j;
                    if(product % k == 0){
                        count++;
                    }
                }
                
            }

        }


            return count;
        
    }
}
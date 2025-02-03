class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1;
        int n = nums.length;
        int contLen = 1;
        for(int i = 0; i < n-1; i++){
            // int currLen = 1;
            if(nums[i+1]>nums[i]){
                contLen++;
            }
            else{
                contLen = 1;
            }
            maxLen = Math.max(maxLen,contLen);      
        }

        int currLen = 1;
        for(int i = 0; i < n-1; i++){
            
            if(nums[i+1] < nums[i]){
                currLen++;
            }
            else{
                currLen = 1;
            }
            maxLen = Math.max(maxLen,currLen);    
        }

        return maxLen;
        
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target)return true;
            if(nums[lo]==nums[mid] && nums[mid]==nums[hi]){
                lo++;
                hi--;
            }
            else if(nums[mid] >= nums[lo]){ //left side, sorted
                if(target >= nums[lo] && target <= nums[mid]){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            else{ //right side, sorted
                if(target >= nums[mid] && target <= nums[hi]){
                    lo = mid + 1;
                }
                else{
                    hi = mid -1;
                }

            }
        }
        return false;        
    }
}
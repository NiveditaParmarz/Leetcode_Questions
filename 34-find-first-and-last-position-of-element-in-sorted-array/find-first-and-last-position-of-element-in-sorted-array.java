class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int ans[] = {-1,-1};
        if(n==0)return ans;
        // if(nums[0]==nums[n-1] && nums[0]==target){
        //     int arr[] = {0,n-1};
        //     return arr;
        // }
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                
                    ans[0] = mid;
                    // ans[1] = mid;
                    hi = mid-1; //this line correct
                
                // else{
                //     if(ans[0] < mid){ //bada idx mil gaya than already stored in startidx. So this could be end idx?
                //         ans[1] = mid;
                //         lo = mid + 1; //aur aage check karte hai to get end idx.
                //     }
                //     else{ //jo index abhi mila (mid), wo already stored start index se chhota hai, so possible start idx ho sakta hai.
                //        // ans[1] = ans[0]; //not required
                //         ans[0] = mid;
                //         hi = mid-1; //aur peeche jake try karte hai start idx mil jaye toh
                //     }
                // }
            }

            else if(nums[mid] < target){
                lo = mid+1;
            }

            else{
                hi = mid-1;
            }
        }

        lo = 0;
        hi = n-1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                ans[1] = mid;
                lo = mid+1;
            }

            else if(nums[mid] < target){
                lo = mid+1;
            }

            else{
                hi = mid-1;
            }

        }

        return ans;
        
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //using sliding window
    
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        // sum = sum/k;
        double ans = sum/k;

        int sp = 0; // we will be removing this element
        int ep = k; // and adding this element.

        while(ep < nums.length){
            sum = sum + nums[ep] - nums[sp];
            double copy = sum/k;
            ans = Math.max(copy,ans);
            ep++;
            sp++;
        }

        return ans;

    }
}
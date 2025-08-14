class Solution {
    public int longestOnes(int[] arr, int k) {
        int sp = 0;

        int n = arr.length;

        int zeroCount = 0;
        int ans = 0;

        for(int ep = 0; ep < n; ep++){
            if(arr[ep]==0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(arr[sp]==0){
                    zeroCount--;
                }
                sp++;
            }
            ans = Math.max(ans,ep-sp+1);
        }

        return ans;
    }
}
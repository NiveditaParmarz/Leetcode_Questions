class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int pfsum[] = pfsum(nums);
        int ans = 0;
        for(int ep = 0; ep < n; ep++){
            int diff = pfsum[ep] - k;
            ans = ans + hm.getOrDefault(diff,0);
            hm.put(pfsum[ep],hm.getOrDefault(pfsum[ep],0)+1);
        }
        return ans;
        
    }

    public int[] pfsum(int arr[]){
        int n = arr.length;
        int pfsum[] = new int[n];
        pfsum[0] = arr[0];
        for(int i = 1; i < n; i++){
            pfsum[i] = pfsum[i-1]+arr[i];
        }
        return pfsum;
    }

}
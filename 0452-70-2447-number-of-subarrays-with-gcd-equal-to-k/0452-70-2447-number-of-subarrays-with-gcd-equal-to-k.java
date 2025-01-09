class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int ans = 0;
            for(int j = i; j < n; j++){
                ans = gcd(nums[j],ans);
                if(ans < k)break; //cuz once gcd becomes lesser than target, it will get lesser only or stay same, never increase.
                if(ans==k)count++;
            }
        }
        return count;
    }

    public int gcd(int a, int b){
        if(a == 0)return b;
        int temp = gcd(b%a,a);
        return temp;
    }
}
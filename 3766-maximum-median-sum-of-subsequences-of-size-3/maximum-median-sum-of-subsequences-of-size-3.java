class Solution {
    public long maximumMedianSum(int[] nums) {
        int n = nums.length;
        int count = n/3;
        Arrays.sort(nums);
        int numOfMed = 0;
        int idx = n-2;
        long sum = 0;
        
        while(numOfMed!=count){
            sum += nums[idx];
            numOfMed++;
            idx = idx - 2;   
        }

        return sum;
    }
}
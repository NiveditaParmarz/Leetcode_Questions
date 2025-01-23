class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int ans = 0;
        long toAchieve = 1; //toAchieve are the numbers from 1 to target. Every number.
        int i = 0;
        while(toAchieve <= target){
            if(i < coins.length && coins[i] <= toAchieve){
                toAchieve = toAchieve + coins[i];
                i++;
            }
            else{
                toAchieve += toAchieve;
                ans++;
            }
        }
        return ans;
        
    }
}
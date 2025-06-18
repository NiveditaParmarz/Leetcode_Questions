class Solution {
    public int specialTriplets(int[] nums) {
        int mod = 1000000007;
        HashMap<Integer,Integer> rightMap = new HashMap<>();
        HashMap<Integer,Integer> leftMap = new HashMap<>();

        int n = nums.length;

        //--------------------------------------------
        // So, when we are at i = 0, there are no left elements. Only right elements.
        // So we initially add all the elements with their frequencies in right map.
        // When we reach i = 0, we will be removing that element from rightMap as well, 
        // so don't worry.
        for(int i = 0; i < n; i++){
            rightMap.put(nums[i],rightMap.getOrDefault(nums[i],0)+1);
        } 

        //-----------------------------------------------
        int count = 0;

        for(int i = 0; i < n; i++){
            int currele = nums[i];
            if(rightMap.containsKey(currele)){
                rightMap.put(currele,rightMap.get(currele)-1);
            }

            // (A + B) % M = ((A % M) + (B % M)) % M
            // (A * B) % M = ((A % M) * (B % M)) % M

            //converting to long as when we multiply rc & lc, it will be better.
            long rightCount = rightMap.getOrDefault((currele*2),0);
            long leftCount = leftMap.getOrDefault((currele*2),0);

            long sum = (leftCount*rightCount);
    
            count = (int)((count%mod) + sum%mod)%mod;
            

            leftMap.put(currele,leftMap.getOrDefault(currele,0)+1);

        }

        return count;
    }
}
class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        
        if(n==0||n==1)return n;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        
        int overallCount = 0;
        for(int num: set){
            int left = num-1;
            
            if(!set.contains(left)){ //means it is start of a sequence. 
                //so now we will check its rights.
                int length = 1;
                int currNum = num;
                
                while(set.contains(currNum+1)){
                    length++;
                    currNum++;
                }
                overallCount = Math.max(length,overallCount);
            }
        }

        return overallCount;
               
    }
}
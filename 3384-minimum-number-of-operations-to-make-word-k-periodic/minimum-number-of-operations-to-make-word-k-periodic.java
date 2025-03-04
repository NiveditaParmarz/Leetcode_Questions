class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k){
        HashMap <String,Integer> hm = new HashMap<>();
        int n = word.length();
        for(int i = 0; i <= n-k;){
            String substr = word.substring(i,i+k);
            hm.put(substr , hm.getOrDefault(substr,0)+1);
            i = i+k; 
        }
        int totalParts = n/k;
        int maxFreq = -1;
        for(String key : hm.keySet()){
            if(hm.get(key) > maxFreq){
                maxFreq = hm.get(key);
            }
        }
        return totalParts-maxFreq;

        
    }
}
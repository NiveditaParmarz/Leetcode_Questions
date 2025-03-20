class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int ans[] = new int[groups.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < elements.length; i++){
            if(!hm.containsKey(elements[i])){
                hm.put(elements[i],i);
            }
        }

        for(int i = 0; i < groups.length; i++){
            int minIdx = minIdx(groups[i],hm);
            ans[i] = minIdx;
        }

        return ans;
    }

    public int minIdx(int n, HashMap<Integer,Integer>hm){
        int minIdx = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n; i++){
            if(n%i==0){
                if(hm.containsKey(i)){ //i is the factor
                    minIdx = Math.min(minIdx,hm.get(i));
                }
                if(hm.containsKey(n/i)){
                    minIdx = Math.min(minIdx,hm.get(n/i));
                }
            }           
        }
        if(minIdx == Integer.MAX_VALUE)return -1;
        return minIdx;
    }
}
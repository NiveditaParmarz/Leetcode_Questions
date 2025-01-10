class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int ans = 0;
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(List<Integer> smallList: wall){
            int len = 0;
            for(int i = 0; i < smallList.size()-1; i++){
                len = len + smallList.get(i);
                hm.put(len,hm.getOrDefault(len,0)+1);
                ans = Math.max(hm.get(len),ans);
            }
        }
        return wall.size()-ans;

    }
}
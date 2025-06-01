class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
        }

        int n = candyType.length;
        int allowed = n/2;

        if(set.size() < allowed){
            return set.size();
        }
        
        return allowed;
        
    }
}
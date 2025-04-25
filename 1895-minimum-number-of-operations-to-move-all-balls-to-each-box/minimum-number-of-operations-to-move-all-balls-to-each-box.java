class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==j)continue;

                if(boxes.charAt(j)=='1'){
                    int dist = Math.abs(i-j);
                    ans[i] += dist;
                }
            }
        }

        return ans;
        
    }
}
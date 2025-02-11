class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque <Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int ans[] = new int[n-k+1]; 
        int idx = 0;

        for(int i = 0; i < k; i++){
            while(dq.size()>0 && nums[i] > dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[i]);

            ans[0] = dq.getFirst();
            // idx++;
        }

        for(int i = k; i < n; i++){
            while(dq.size()>0 && nums[i] > dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[i]);

            if(dq.getFirst() == nums[i-k]){
                dq.removeFirst();
            }
            ans[i-k+1] = dq.getFirst();
            // idx++;

        }

        return ans;


    }
}
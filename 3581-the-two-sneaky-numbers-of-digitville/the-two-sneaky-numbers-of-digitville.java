class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        // HashSet<Integer> set = new HashSet<>();
        // // boolean flag = true;
        int ans[] = new int[2];
        // for(int num : nums){
        //     if(hm.get(num)==2){
        //         set.add(num);
        //     }
        // }
        
        boolean flag = true;
        for(int key : hm.keySet()){
            if(hm.get(key)==2){
                 if(flag == true){
                    ans[0] = key;
                    flag = false;
                 }
                 else{
                    ans[1] = key;
                    break;
                 }
                 
            }
        }

        return ans;
        
    }
}
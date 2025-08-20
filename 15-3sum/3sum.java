class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         if(n < 3){
//             return new ArrayList<>();
//         }

//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums);
        
//         for(int i = 0; i < n-2; i++){ //till n-2 as we need 2 more elements after i to make a 3 sum stupid.
//             if(i != 0 && nums[i]==nums[i-1]){ //we don't want repeated n1s.
//                 continue;
//             }
//             twoSum(nums,i+1,result,-nums[i]);
//             //i+1 because:
//             //Start searching for the second and third elements from index i+1.

// //This avoids reusing the same element twice (we can’t use nums[i] again)
//         }

//         return result;
//   }

//   public void twoSum(int arr[], int i, List<List<Integer>> result, int target){
//         int j = arr.length-1;

//         while(i < j){
//             if(arr[i]+arr[j] < target){
//                 i++;
//             }
//             else if(arr[i]+arr[j] > target){
//                 j--;
//             }
//             else{
//                 result.add(Arrays.asList(-target,arr[i],arr[j]));
//             }

//             while(i < j && arr[i] == arr[i+1]){
//                 i++;
//             }

//             while(i < j && arr[j] == arr[j-1]){
//                 j--;
//             }

//             i++;
//             j--;
//         }

//   }













public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, i + 1, result, -nums[i]);
        }

        return result;
    }

    private void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {
        int i = k, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                result.add(Arrays.asList(-target, nums[i], nums[j]));

                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                i++;
                j--;
            }
        }
    }
}
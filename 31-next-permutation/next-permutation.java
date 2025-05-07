class Solution {
    public void nextPermutation(int[] nums) {

        int targetIdx = -1;
        int n = nums.length;

        for(int i = n-1; i > 0; i--){
            if(nums[i-1] < nums[i]){
                targetIdx = i-1;
                break;
            }
        }
        if(targetIdx != -1){
            int swapIdx = -1;
        for(int i = n-1; i >= targetIdx+1; i--){
            if(nums[i] > nums[targetIdx]){
                swapIdx = i;
                break;
            }
        }
        swap(nums,targetIdx ,swapIdx);


        }
        

        reverseArrayFromIdx(nums,targetIdx+1);
        
    }

    public void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void reverseArrayFromIdx(int arr[], int idx){
        int left = idx;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}